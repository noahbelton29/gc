package uk.nbforge.core;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import uk.nbforge.GCMod;
import uk.nbforge.core.block.TardisBlock;
import uk.nbforge.util.GCModUtils;

import java.util.ArrayList;
import java.util.function.Function;

public class GCBlocks {
    public static final ArrayList<Block> BLOCKS = new ArrayList<>();

    public static final Block TARDIS_BLOCK = registerBlock("tardis", TardisBlock::new);

    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block block = function.apply(
                BlockBehaviour.Properties.of()
                        .setId(ResourceKey.create(
                                Registries.BLOCK,
                                GCModUtils.modIdentifier(name)
                        ))
        );

        BLOCKS.add(block);

        return Registry.register(
                BuiltInRegistries.BLOCK,
                GCModUtils.modIdentifier(name),
                block
        );
    }

    public static void initBlocks() {
        GCMod.LOGGER.info("Registering blocks for " + GCMod.MOD_ID);
    }
}