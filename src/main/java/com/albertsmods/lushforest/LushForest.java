package com.albertsmods.lushforest;

import com.albertsmods.lushforest.world.biome.ModBiomeProvider;
import com.albertsmods.lushforest.world.biome.ModBiomes;
import net.fabricmc.api.ModInitializer;
import terrablender.api.Regions;
import terrablender.api.TerraBlenderApi;

public class LushForest implements ModInitializer, TerraBlenderApi {
	public static final String MOD_ID = "lushforest";

	@Override
	public void onInitialize()
	{
		ModBiomes.registerBiomes();
	}

	@Override
	public void onTerraBlenderInitialized()
	{
		Regions.register(new ModBiomeProvider(18));
	}

}
