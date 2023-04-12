package net.shadapin.shadventuremod;

import net.fabricmc.api.ModInitializer;

import net.shadapin.shadventuremod.item.ModItemGroup;
import net.shadapin.shadventuremod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShadventureMod implements ModInitializer {
	public static String MOD_ID = "shadventuremod";
	public static final Logger LOGGER = LoggerFactory.getLogger("shadventuremod");

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroup.registerItemGroups();
	}
}