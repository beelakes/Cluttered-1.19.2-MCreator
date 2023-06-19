package net.mcreator.clutteredmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.clutteredmod.LuphieclutteredmodMod;

public class MusicboxOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		{
			int _value = 1;
			BlockPos _pos = new BlockPos(x, y, z);
			BlockState _bs = world.getBlockState(_pos);
			if (_bs.getBlock().getStateDefinition().getProperty("animation") instanceof IntegerProperty _integerProp
					&& _integerProp.getPossibleValues().contains(_value))
				world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
		}
		LuphieclutteredmodMod.queueServerWork(7, () -> {
			{
				int _value = 2;
				BlockPos _pos = new BlockPos(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("animation") instanceof IntegerProperty _integerProp
						&& _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("luphieclutteredmod:starboundmusicbox")), SoundSource.RECORDS,
							1, 1);
				} else {
					_level.playLocalSound(x, y, z,
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("luphieclutteredmod:starboundmusicbox")), SoundSource.RECORDS,
							1, 1, false);
				}
			}
		});
		LuphieclutteredmodMod.queueServerWork(370, () -> {
			{
				int _value = 3;
				BlockPos _pos = new BlockPos(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("animation") instanceof IntegerProperty _integerProp
						&& _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		});
	}
}
