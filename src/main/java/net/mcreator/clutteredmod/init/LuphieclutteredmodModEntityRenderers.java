
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.clutteredmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.clutteredmod.client.renderer.LuphieUnlivingChairEntityRenderer;
import net.mcreator.clutteredmod.client.renderer.LuphieRoversStoolEntityRenderer;
import net.mcreator.clutteredmod.client.renderer.LuphiePastelChairEntityRenderer;
import net.mcreator.clutteredmod.client.renderer.LuphieMushroomBedSeatEntityRenderer;
import net.mcreator.clutteredmod.client.renderer.LuphieLovelyLoveSeatsEntityRenderer;
import net.mcreator.clutteredmod.client.renderer.LuphieLogSetSeatingEntityRenderer;
import net.mcreator.clutteredmod.client.renderer.LuphieLogBedSeatingEntityRenderer;
import net.mcreator.clutteredmod.client.renderer.LuphieImperialAndPastelChairEntityRenderer;
import net.mcreator.clutteredmod.client.renderer.LuphieArmchairEntityRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class LuphieclutteredmodModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(LuphieclutteredmodModEntities.LUPHIE_ARMCHAIR_ENTITY.get(), LuphieArmchairEntityRenderer::new);
		event.registerEntityRenderer(LuphieclutteredmodModEntities.LUPHIE_IMPERIAL_AND_PASTEL_CHAIR_ENTITY.get(),
				LuphieImperialAndPastelChairEntityRenderer::new);
		event.registerEntityRenderer(LuphieclutteredmodModEntities.LUPHIE_LOVELY_LOVE_SEATS_ENTITY.get(), LuphieLovelyLoveSeatsEntityRenderer::new);
		event.registerEntityRenderer(LuphieclutteredmodModEntities.LUPHIE_ROVERS_STOOL_ENTITY.get(), LuphieRoversStoolEntityRenderer::new);
		event.registerEntityRenderer(LuphieclutteredmodModEntities.LUPHIE_PASTEL_CHAIR_ENTITY.get(), LuphiePastelChairEntityRenderer::new);
		event.registerEntityRenderer(LuphieclutteredmodModEntities.LUPHIE_UNLIVING_CHAIR_ENTITY.get(), LuphieUnlivingChairEntityRenderer::new);
		event.registerEntityRenderer(LuphieclutteredmodModEntities.LUPHIE_LOG_SET_SEATING_ENTITY.get(), LuphieLogSetSeatingEntityRenderer::new);
		event.registerEntityRenderer(LuphieclutteredmodModEntities.LUPHIE_LOG_BED_SEATING_ENTITY.get(), LuphieLogBedSeatingEntityRenderer::new);
		event.registerEntityRenderer(LuphieclutteredmodModEntities.LUPHIE_MUSHROOM_BED_SEAT_ENTITY.get(), LuphieMushroomBedSeatEntityRenderer::new);
	}
}
