package uk.nbforge.client.model;

import com.geckolib.model.GeoModel;
import com.geckolib.renderer.base.GeoRenderState;
import net.minecraft.resources.Identifier;
import org.jspecify.annotations.NonNull;
import uk.nbforge.core.block_entities.TardisBlockEntity;
import uk.nbforge.util.GCModUtils;

public class TardisBlockModel extends GeoModel<TardisBlockEntity> {

    @Override
    public @NonNull Identifier getModelResource(@NonNull GeoRenderState renderState) {
        return GCModUtils.modIdentifier("tardis_exterior");
    }

    @Override
    public @NonNull Identifier getTextureResource(@NonNull GeoRenderState renderState) {
        return GCModUtils.modIdentifier("textures/block_entity/tardis_exterior.png");
    }

    @Override
    public @NonNull Identifier getAnimationResource(@NonNull TardisBlockEntity animatable) {
        return GCModUtils.modIdentifier("tardis_exterior");
    }
}