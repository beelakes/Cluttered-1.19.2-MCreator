
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.clutteredmod.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.clutteredmod.client.gui.LuphieSmallStorageGuiScreen;
import net.mcreator.clutteredmod.client.gui.LuphieLargeStorageGuiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class LuphieclutteredmodModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(LuphieclutteredmodModMenus.LUPHIE_SMALL_STORAGE_GUI.get(), LuphieSmallStorageGuiScreen::new);
			MenuScreens.register(LuphieclutteredmodModMenus.LUPHIE_LARGE_STORAGE_GUI.get(), LuphieLargeStorageGuiScreen::new);
		});
	}
}
