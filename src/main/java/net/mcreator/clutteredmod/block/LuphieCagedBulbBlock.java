
package net.mcreator.clutteredmod.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.DirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Collections;

public class LuphieCagedBulbBlock extends Block {
	public static final DirectionProperty FACING = DirectionalBlock.FACING;

	public LuphieCagedBulbBlock() {
		super(BlockBehaviour.Properties.of(Material.DECORATION).sound(SoundType.GLASS).strength(1f, 10f).lightLevel(s -> 15).noOcclusion()
				.isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {

		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(3.5, 3, 3.5, 12.5, 13, 12.5), box(7, 13, 7, 9, 16, 9));
			case NORTH -> Shapes.or(box(3.5, 3, 3.5, 12.5, 13, 12.5), box(7, 13, 7, 9, 16, 9));
			case EAST -> Shapes.or(box(3.5, 3, 3.5, 12.5, 13, 12.5), box(7, 13, 7, 9, 16, 9));
			case WEST -> Shapes.or(box(3.5, 3, 3.5, 12.5, 13, 12.5), box(7, 13, 7, 9, 16, 9));
			case UP -> Shapes.or(box(3.5, 3.5, 3, 12.5, 12.5, 13), box(7, 7, 13, 9, 9, 16));
			case DOWN -> Shapes.or(box(3.5, 3.5, 3, 12.5, 12.5, 13), box(7, 7, 0, 9, 9, 3));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(FACING, context.getNearestLookingDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}
}
