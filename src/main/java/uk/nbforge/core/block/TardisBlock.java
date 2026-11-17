package uk.nbforge.core.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;
import uk.nbforge.core.GCBlockEntities;

public class TardisBlock extends Block implements EntityBlock {
    public TardisBlock(Properties properties) {
        super(properties);
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(@NonNull BlockPos worldPosition, @NonNull BlockState blockState) {
        return GCBlockEntities.TARDIS_BLOCK_ENTITY_TYPE.create(worldPosition, blockState);
    }
}
