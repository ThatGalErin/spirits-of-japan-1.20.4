package net.erin.soj;

import net.erin.soj.block.ModBlocks;
import net.erin.soj.block.entity.ModBlockEntities;
import net.erin.soj.entity.ModEntities;
import net.erin.soj.item.ModItemGroups;
import net.erin.soj.item.ModItems;
import net.erin.soj.util.ModRegistries;
import net.erin.soj.screen.ModScreenHandlers;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SpiritsOfJapan implements ModInitializer {
	public static final String MOD_ID = "spirits_of_japan";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModRegistries.registerModStuffs();
		ModItemGroups.registerModGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModEntities.registerModEntities();
		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerScreenHandler();
	}
}