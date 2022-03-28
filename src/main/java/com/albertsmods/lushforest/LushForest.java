package com.albertsmods.lushforest;

import com.albertsmods.lushforest.config.ConfigManager;
import com.albertsmods.lushforest.config.Configuration;
import com.albertsmods.lushforest.world.biome.ModBiomeProvider;
import com.albertsmods.lushforest.world.biome.ModBiomes;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import terrablender.api.RegionType;
import terrablender.api.Regions;
import terrablender.api.TerraBlenderApi;

public class LushForest implements ModInitializer, TerraBlenderApi {
	public static final String MOD_ID = "lushforest";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		ModBiomes.registerBiomes();

		ConfigManager.registerAutoConfig();
		Configuration config = AutoConfig.getConfigHolder(Configuration.class).getConfig();
		try {
			config.validatePostLoad();
		} catch (ConfigData.ValidationException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTerraBlenderInitialized()
	{
		if (ConfigManager.getConfig().biomeWeight != 0) {
			Regions.register(new ModBiomeProvider(new ResourceLocation(MOD_ID, "lushforest_biome_provider"), RegionType.OVERWORLD, ConfigManager.getConfig().biomeWeight));
		}
		else {
			LOGGER.info("Lush Forest Biomes are disabled in the config! Please change 0 to something bigger to re-enable them.");
		}
	}
}
