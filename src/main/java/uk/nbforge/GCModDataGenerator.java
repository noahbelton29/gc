package uk.nbforge;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import uk.nbforge.datagen.GCLanguageProvider;
import uk.nbforge.datagen.GCModelProvider;

public class GCModDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(GCModelProvider::new);
        pack.addProvider(GCLanguageProvider::new);
    }
}
