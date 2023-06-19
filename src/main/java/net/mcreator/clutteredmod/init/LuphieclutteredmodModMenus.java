
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.clutteredmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.clutteredmod.world.inventory.LuphieSmallStorageGuiMenu;
import net.mcreator.clutteredmod.world.inventory.LuphieLargeStorageGuiMenu;
import net.mcreator.clutteredmod.LuphieclutteredmodMod;

public class LuphieclutteredmodModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, LuphieclutteredmodMod.MODID);
	public static final RegistryObject<MenuType<LuphieSmallStorageGuiMenu>> LUPHIE_SMALL_STORAGE_GUI = REGISTRY.register("luphie_small_storage_gui",
			() -> IForgeMenuType.create(LuphieSmallStorageGuiMenu::new));
	public static final RegistryObject<MenuType<LuphieLargeStorageGuiMenu>> LUPHIE_LARGE_STORAGE_GUI = REGISTRY.register("luphie_large_storage_gui",
			() -> IForgeMenuType.create(LuphieLargeStorageGuiMenu::new));
}
