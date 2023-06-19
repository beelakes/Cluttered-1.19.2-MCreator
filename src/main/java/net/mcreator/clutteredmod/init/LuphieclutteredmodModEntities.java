
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.clutteredmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.clutteredmod.entity.LuphieUnlivingChairEntityEntity;
import net.mcreator.clutteredmod.entity.LuphieRoversStoolEntityEntity;
import net.mcreator.clutteredmod.entity.LuphiePastelChairEntityEntity;
import net.mcreator.clutteredmod.entity.LuphieMushroomBedSeatEntityEntity;
import net.mcreator.clutteredmod.entity.LuphieLovelyLoveSeatsEntityEntity;
import net.mcreator.clutteredmod.entity.LuphieLogSetSeatingEntityEntity;
import net.mcreator.clutteredmod.entity.LuphieLogBedSeatingEntityEntity;
import net.mcreator.clutteredmod.entity.LuphieImperialAndPastelChairEntityEntity;
import net.mcreator.clutteredmod.entity.LuphieArmchairEntityEntity;
import net.mcreator.clutteredmod.LuphieclutteredmodMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class LuphieclutteredmodModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, LuphieclutteredmodMod.MODID);
	public static final RegistryObject<EntityType<LuphieArmchairEntityEntity>> LUPHIE_ARMCHAIR_ENTITY = register("luphie_armchair_entity",
			EntityType.Builder.<LuphieArmchairEntityEntity>of(LuphieArmchairEntityEntity::new, MobCategory.MONSTER)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(LuphieArmchairEntityEntity::new)

					.sized(0.4f, 0.7f));
	public static final RegistryObject<EntityType<LuphieImperialAndPastelChairEntityEntity>> LUPHIE_IMPERIAL_AND_PASTEL_CHAIR_ENTITY = register(
			"luphie_imperial_and_pastel_chair_entity",
			EntityType.Builder.<LuphieImperialAndPastelChairEntityEntity>of(LuphieImperialAndPastelChairEntityEntity::new, MobCategory.MONSTER)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(LuphieImperialAndPastelChairEntityEntity::new)

					.sized(0.4f, 0.7f));
	public static final RegistryObject<EntityType<LuphieLovelyLoveSeatsEntityEntity>> LUPHIE_LOVELY_LOVE_SEATS_ENTITY = register(
			"luphie_lovely_love_seats_entity",
			EntityType.Builder.<LuphieLovelyLoveSeatsEntityEntity>of(LuphieLovelyLoveSeatsEntityEntity::new, MobCategory.MONSTER)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(LuphieLovelyLoveSeatsEntityEntity::new)

					.sized(0.4f, 0.7f));
	public static final RegistryObject<EntityType<LuphieRoversStoolEntityEntity>> LUPHIE_ROVERS_STOOL_ENTITY = register("luphie_rovers_stool_entity",
			EntityType.Builder.<LuphieRoversStoolEntityEntity>of(LuphieRoversStoolEntityEntity::new, MobCategory.MONSTER)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(LuphieRoversStoolEntityEntity::new)

					.sized(0.4f, 0.7f));
	public static final RegistryObject<EntityType<LuphiePastelChairEntityEntity>> LUPHIE_PASTEL_CHAIR_ENTITY = register("luphie_pastel_chair_entity",
			EntityType.Builder.<LuphiePastelChairEntityEntity>of(LuphiePastelChairEntityEntity::new, MobCategory.MONSTER)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(LuphiePastelChairEntityEntity::new)

					.sized(0.4f, 0.7f));
	public static final RegistryObject<EntityType<LuphieUnlivingChairEntityEntity>> LUPHIE_UNLIVING_CHAIR_ENTITY = register(
			"luphie_unliving_chair_entity",
			EntityType.Builder.<LuphieUnlivingChairEntityEntity>of(LuphieUnlivingChairEntityEntity::new, MobCategory.MONSTER)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(LuphieUnlivingChairEntityEntity::new)

					.sized(0.4f, 0.7f));
	public static final RegistryObject<EntityType<LuphieLogSetSeatingEntityEntity>> LUPHIE_LOG_SET_SEATING_ENTITY = register(
			"luphie_log_set_seating_entity",
			EntityType.Builder.<LuphieLogSetSeatingEntityEntity>of(LuphieLogSetSeatingEntityEntity::new, MobCategory.MONSTER)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(LuphieLogSetSeatingEntityEntity::new)

					.sized(0.4f, 0.7f));
	public static final RegistryObject<EntityType<LuphieLogBedSeatingEntityEntity>> LUPHIE_LOG_BED_SEATING_ENTITY = register(
			"luphie_log_bed_seating_entity",
			EntityType.Builder.<LuphieLogBedSeatingEntityEntity>of(LuphieLogBedSeatingEntityEntity::new, MobCategory.MONSTER)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(LuphieLogBedSeatingEntityEntity::new)

					.sized(0.4f, 0.7f));
	public static final RegistryObject<EntityType<LuphieMushroomBedSeatEntityEntity>> LUPHIE_MUSHROOM_BED_SEAT_ENTITY = register(
			"luphie_mushroom_bed_seat_entity",
			EntityType.Builder.<LuphieMushroomBedSeatEntityEntity>of(LuphieMushroomBedSeatEntityEntity::new, MobCategory.MONSTER)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(LuphieMushroomBedSeatEntityEntity::new)

					.sized(0.4f, 0.7f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			LuphieArmchairEntityEntity.init();
			LuphieImperialAndPastelChairEntityEntity.init();
			LuphieLovelyLoveSeatsEntityEntity.init();
			LuphieRoversStoolEntityEntity.init();
			LuphiePastelChairEntityEntity.init();
			LuphieUnlivingChairEntityEntity.init();
			LuphieLogSetSeatingEntityEntity.init();
			LuphieLogBedSeatingEntityEntity.init();
			LuphieMushroomBedSeatEntityEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(LUPHIE_ARMCHAIR_ENTITY.get(), LuphieArmchairEntityEntity.createAttributes().build());
		event.put(LUPHIE_IMPERIAL_AND_PASTEL_CHAIR_ENTITY.get(), LuphieImperialAndPastelChairEntityEntity.createAttributes().build());
		event.put(LUPHIE_LOVELY_LOVE_SEATS_ENTITY.get(), LuphieLovelyLoveSeatsEntityEntity.createAttributes().build());
		event.put(LUPHIE_ROVERS_STOOL_ENTITY.get(), LuphieRoversStoolEntityEntity.createAttributes().build());
		event.put(LUPHIE_PASTEL_CHAIR_ENTITY.get(), LuphiePastelChairEntityEntity.createAttributes().build());
		event.put(LUPHIE_UNLIVING_CHAIR_ENTITY.get(), LuphieUnlivingChairEntityEntity.createAttributes().build());
		event.put(LUPHIE_LOG_SET_SEATING_ENTITY.get(), LuphieLogSetSeatingEntityEntity.createAttributes().build());
		event.put(LUPHIE_LOG_BED_SEATING_ENTITY.get(), LuphieLogBedSeatingEntityEntity.createAttributes().build());
		event.put(LUPHIE_MUSHROOM_BED_SEAT_ENTITY.get(), LuphieMushroomBedSeatEntityEntity.createAttributes().build());
	}
}
