package net.m3wory.m3worys_farm;

import net.fabricmc.api.ModInitializer;

import net.m3wory.m3worys_farm.block.ModBlocks;
import net.m3wory.m3worys_farm.item.ModItemGroups;
import net.m3wory.m3worys_farm.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class M3worysFarm implements ModInitializer {

	public  static final String MOD_ID = "m3worys_farm";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();

		ModBlocks.registerModBlocks();
	}
}