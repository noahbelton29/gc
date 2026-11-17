package uk.nbforge.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import uk.nbforge.core.GCItems;
import uk.nbforge.util.GCStringUtils;

import java.util.concurrent.CompletableFuture;

public class GCLanguageProvider extends FabricLanguageProvider {
    public GCLanguageProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        for (Item item : GCItems.ITEMS) {
            translationBuilder.add(item, GCStringUtils.titleCase(BuiltInRegistries.ITEM.getKey(item).getPath()));
        }
        translationBuilder.add("creativetab.gallifreyan_chronicles.gc_tardis_tab", "GC: TARDIS");
    }
}
