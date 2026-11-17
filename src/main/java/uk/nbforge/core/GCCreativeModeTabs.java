package uk.nbforge.core;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import uk.nbforge.GCMod;
import uk.nbforge.util.GCModUtils;

public class GCCreativeModeTabs {
    public static final CreativeModeTab BISMUTH_ITEMS_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            GCModUtils.modIdentifier("gc_tardis_tab"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(GCItems.TARDIS_ITEM))
                    .title(Component.translatable("creativetab.gallifreyan_chronicles.gc_tardis_tab"))
                    .displayItems((parameters, output) -> {
                        output.accept(GCItems.TARDIS_ITEM);
                    }).build());

    public static void initCreativeModeTabs() {
        GCMod.LOGGER.info("Registered Creative Mode Tabs for " + GCMod.MOD_ID);
    }
}
