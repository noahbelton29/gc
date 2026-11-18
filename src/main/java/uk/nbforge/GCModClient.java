package uk.nbforge;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import uk.nbforge.client.renderer.block.TardisBlockRenderer;
import uk.nbforge.core.GCBlockEntities;

public class GCModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockEntityRenderers.register(GCBlockEntities.TARDIS_BLOCK_ENTITY_TYPE, TardisBlockRenderer::new);
    }
}
