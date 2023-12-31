
package net.mcreator.clutteredmod.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.clutteredmod.procedures.LuphiePastelChairRightClickProcedure;

import java.util.List;
import java.util.Collections;

public class LuphiePastelChairBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public LuphiePastelChairBlock() {
		super(BlockBehaviour.Properties.of(Material.DECORATION).sound(SoundType.WOOL).strength(1f, 10f).noOcclusion()
				.isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Starbound"));
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
			default -> Shapes.or(box(1, 2, 1, 15, 11, 15), box(2, 0, 2, 4, 2, 4), box(2, 0, 12, 4, 2, 14), box(12, 0, 12, 14, 2, 14),
					box(12, 0, 2, 14, 2, 4), box(11, 11, 1, 13, 15, 3), box(3, 11, 1, 5, 15, 3), box(1, 15, 0, 15, 27, 4));
			case NORTH -> Shapes.or(box(1, 2, 1, 15, 11, 15), box(12, 0, 12, 14, 2, 14), box(12, 0, 2, 14, 2, 4), box(2, 0, 2, 4, 2, 4),
					box(2, 0, 12, 4, 2, 14), box(3, 11, 13, 5, 15, 15), box(11, 11, 13, 13, 15, 15), box(1, 15, 12, 15, 27, 16));
			case EAST -> Shapes.or(box(1, 2, 1, 15, 11, 15), box(2, 0, 12, 4, 2, 14), box(12, 0, 12, 14, 2, 14), box(12, 0, 2, 14, 2, 4),
					box(2, 0, 2, 4, 2, 4), box(1, 11, 3, 3, 15, 5), box(1, 11, 11, 3, 15, 13), box(0, 15, 1, 4, 27, 15));
			case WEST -> Shapes.or(box(1, 2, 1, 15, 11, 15), box(12, 0, 2, 14, 2, 4), box(2, 0, 2, 4, 2, 4), box(2, 0, 12, 4, 2, 14),
					box(12, 0, 12, 14, 2, 14), box(13, 11, 11, 15, 15, 13), box(13, 11, 3, 15, 15, 5), box(12, 15, 1, 16, 27, 15));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
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

	@Override
	public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
		super.use(blockstate, world, pos, entity, hand, hit);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		double hitX = hit.getLocation().x;
		double hitY = hit.getLocation().y;
		double hitZ = hit.getLocation().z;
		Direction direction = hit.getDirection();

		LuphiePastelChairRightClickProcedure.execute(world, x, y, z, entity);
		return InteractionResult.SUCCESS;
	}
}
