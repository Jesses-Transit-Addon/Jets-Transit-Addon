package org.eu.awesomekalin.jta.mod.blocks.directional.rail;


import org.mtr.mapping.holder.*;
import org.mtr.mapping.tool.HolderBase;
import org.mtr.mod.block.BlockTicketBarrier;

import java.util.List;

public class BritishTicketBarrier extends BlockTicketBarrier {

    public static final BooleanProperty LOCKED = BooleanProperty.of("locked");

    public BritishTicketBarrier(boolean isEntrance) {
        super(isEntrance);
    }

    @Override
    public void addBlockProperties(List<HolderBase<?>> properties) {
        properties.add(LOCKED);
        super.addBlockProperties(properties);
    }

    @Override
    public void onEntityCollision2(BlockState state, World world, BlockPos blockPos, Entity entity) {
        if (!state.get(new Property<>(LOCKED.data))) {
            super.onEntityCollision2(state, world, blockPos, entity);
        }
    }

    @Override
    public void onPlaced2(World world, BlockPos pos, BlockState state, LivingEntity placer, ItemStack itemStack) {
        super.onPlaced2(world, pos, state, placer, itemStack);
        world.setBlockState(pos, state.with(new Property<>(LOCKED.data), false));
    }

    // need to find a way to expand the hitbox horizontally coz tbh idk how.
}
