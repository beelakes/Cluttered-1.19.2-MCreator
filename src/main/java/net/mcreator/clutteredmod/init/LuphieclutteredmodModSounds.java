
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.clutteredmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.clutteredmod.LuphieclutteredmodMod;

public class LuphieclutteredmodModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, LuphieclutteredmodMod.MODID);
	public static final RegistryObject<SoundEvent> STARBOUNDMUSICBOX = REGISTRY.register("starboundmusicbox",
			() -> new SoundEvent(new ResourceLocation("luphieclutteredmod", "starboundmusicbox")));
}
