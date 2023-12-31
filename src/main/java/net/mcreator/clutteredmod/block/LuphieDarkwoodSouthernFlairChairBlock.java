
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

import net.mcreator.clutteredmod.procedures.LuphieLogSetSeatingRightClickProcedure;

import java.util.List;
import java.util.Collections;

public class LuphieDarkwoodSouthernFlairChairBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public LuphieDarkwoodSouthernFlairChairBlock() {
		super(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(1f, 10f).noOcclusion()
				.isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("ACNH"));
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
			default ->
				Shapes.or(box(5.5, 0, 4, 9.5, 15, 16), box(22.5, 0, 4, 26.5, 15, 16), box(5.5, 0, 0, 26.5, 22, 4), box(9.5, 3, 3, 22.5, 9, 15));
			case NORTH ->
				Shapes.or(box(6.5, 0, 0, 10.5, 15, 12), box(-10.5, 0, 0, -6.5, 15, 12), box(-10.5, 0, 12, 10.5, 22, 16), box(-6.5, 3, 1, 6.5, 9, 13));
			case EAST ->
				Shapes.or(box(4, 0, 6.5, 16, 15, 10.5), box(4, 0, -10.5, 16, 15, -6.5), box(0, 0, -10.5, 4, 22, 10.5), box(3, 3, -6.5, 15, 9, 6.5));
			case WEST ->
				Shapes.or(box(0, 0, 5.5, 12, 15, 9.5), box(0, 0, 22.5, 12, 15, 26.5), box(12, 0, 5.5, 16, 22, 26.5), box(1, 3, 9.5, 13, 9, 22.5));
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

		LuphieLogSetSeatingRightClickProcedure.execute(world, x, y, z, entity);
		return InteractionResult.SUCCESS;
	}
}
