package net.grumpenbug.experiment;

import net.fabricmc.api.ModInitializer;

import net.grumpenbug.experiment.block.ModBlocks;
import net.grumpenbug.experiment.items.ModItemGroups;
import net.grumpenbug.experiment.items.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


// Functions to use on initial launch
public class Experiment implements ModInitializer {
	public static final String MOD_ID = "experiment";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}