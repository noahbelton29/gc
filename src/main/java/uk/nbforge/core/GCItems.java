package uk.nbforge.core;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import uk.nbforge.GCMod;
import uk.nbforge.util.GCModUtils;

import java.util.ArrayList;
import java.util.function.Function;

public class GCItems {
    public static final ArrayList<Item> ITEMS = new ArrayList<>();

    // Block Items
    public static final Item TARDIS_ITEM = registerBlockItem(
            "tardis",
            GCBlocks.TARDIS_BLOCK
    );

    private static Item registerBlockItem(String name, Block block) {
        return registerItem(
                name,
                new Item.Properties().useBlockDescriptionPrefix(),
                properties -> new BlockItem(block, properties)
        );
    }

    private static Item registerItem(String name, Item.Properties properties) {
        return registerItem(name, properties, Item::new);
    }

    private static Item registerItem(
            String name,
            Item.Properties properties,
            Function<Item.Properties, Item> factory
    ) {
        properties.setId(ResourceKey.create(
                Registries.ITEM,
                GCModUtils.modIdentifier(name)
        ));

        Item item = Registry.register(
                BuiltInRegistries.ITEM,
                GCModUtils.modIdentifier(name),
                factory.apply(properties)
        );

        ITEMS.add(item);
        return item;
    }

    public static void initItems() {
        GCMod.LOGGER.info("Registering items for " + GCMod.MOD_ID);
    }
}