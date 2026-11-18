package uk.nbforge.client.renderer.block;

import com.geckolib.constant.dataticket.DataTicket;
import com.geckolib.renderer.GeoBlockRenderer;
import com.geckolib.renderer.base.GeoRenderState;
import com.geckolib.renderer.base.RenderPassInfo;
import com.google.common.reflect.TypeToken;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.blockentity.state.BlockEntityRenderState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;
import uk.nbforge.client.model.TardisBlockModel;
import uk.nbforge.core.block_entities.TardisBlockEntity;

public class TardisBlockRenderer<R extends BlockEntityRenderState & GeoRenderState> extends GeoBlockRenderer<TardisBlockEntity, @NonNull R> {
    private static final DataTicket<Integer> ROTATION_16 = DataTicket.create("tardis_rotation_16", new TypeToken<>() {
    });

    public TardisBlockRenderer(BlockEntityRendererProvider.Context context) {
        super(context, new TardisBlockModel());
    }

    @Override
    public void addRenderData(TardisBlockEntity animatable, @Nullable Void relatedObject, R renderState, float partialTick) {
        renderState.addGeckolibData(ROTATION_16, animatable.getBlockState().getValue(BlockStateProperties.ROTATION_16));
    }

    @Override
    public void adjustRenderPose(RenderPassInfo<R> renderPassInfo) {
        int segment = renderPassInfo.getOrDefaultGeckolibData(ROTATION_16, 0);
        float yaw = -(segment * 22.5f);

        PoseStack poseStack = renderPassInfo.poseStack();

        poseStack.rotate(Axis.YP.rotationDegrees(yaw + 180));
    }
}
