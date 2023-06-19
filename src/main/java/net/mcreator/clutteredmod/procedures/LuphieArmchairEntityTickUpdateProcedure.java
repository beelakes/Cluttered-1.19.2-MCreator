package net.mcreator.clutteredmod.procedures;

import net.minecraft.world.entity.Entity;

public class LuphieArmchairEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.isVehicle() == false) {
			if (!entity.level.isClientSide())
				entity.discard();
		}
	}
}
