package uk.nbforge.client.renderer.block;

import com.geckolib.renderer.GeoBlockRenderer;
import com.geckolib.renderer.base.GeoRenderState;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.blockentity.state.BlockEntityRenderState;
import org.jspecify.annotations.NonNull;
import uk.nbforge.client.model.TardisBlockModel;
import uk.nbforge.core.block_entities.TardisBlockEntity;

public class TardisBlockRenderer<R extends BlockEntityRenderState & GeoRenderState> extends GeoBlockRenderer<TardisBlockEntity, @NonNull R> {
    public TardisBlockRenderer(BlockEntityRendererProvider.Context context) {
        super(context, new TardisBlockModel());
    }
}
