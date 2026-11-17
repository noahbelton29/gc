package uk.nbforge.core;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import uk.nbforge.GCMod;
import uk.nbforge.core.block_entities.TardisBlockEntity;
import uk.nbforge.util.GCModUtils;

public class GCBlockEntities {
    public static final BlockEntityType<TardisBlockEntity> TARDIS_BLOCK_ENTITY_TYPE =
            Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, GCModUtils.modIdentifier("tardis_block_entity"),
                    FabricBlockEntityTypeBuilder.create(TardisBlockEntity::new, GCBlocks.TARDIS_BLOCK).build());

    public static void initBlockEntities() {
        GCMod.LOGGER.info("Registered Block Entities for " + GCMod.MOD_ID);
    }
}
