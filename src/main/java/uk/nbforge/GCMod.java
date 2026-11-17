package uk.nbforge;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.nbforge.core.GCBlocks;
import uk.nbforge.core.GCCreativeModeTabs;
import uk.nbforge.core.GCItems;

public class GCMod implements ModInitializer {
    public static final String MOD_ID = "gallifreyan_chronicles";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        GCItems.initItems();
        GCBlocks.initBlocks();
        GCCreativeModeTabs.initCreativeModeTabs();
    }
}
