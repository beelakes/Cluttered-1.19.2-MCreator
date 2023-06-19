
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.clutteredmod.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class LuphieclutteredmodModTabs {
	public static CreativeModeTab TAB_CLUTTER_MOD;

	public static void load() {
		TAB_CLUTTER_MOD = new CreativeModeTab("tabclutter_mod") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(LuphieclutteredmodModBlocks.LUPHIE_PURPLE_BLACK_CAT_BOOKSHELF.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
