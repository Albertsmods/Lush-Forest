package com.albertsmods.lushforest.world.biome;

import net.minecraft.core.Holder;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;

public class ModBiomes {
    public static void registerBiomes()
    {
        register(ModBiomeInit.LUSH_FOREST, ModOverworldBiomes.lushForest());
        register(ModBiomeInit.LUSH_VALLEY, ModOverworldBiomes.lushValley());
        register(ModBiomeInit.LUSH_BIRCH_FOREST, ModOverworldBiomes.lushBirchForest());
        register(ModBiomeInit.LUSH_JUNGLE, ModOverworldBiomes.lushJungle());
    }

    private static Holder<Biome> register(ResourceKey<Biome> key, Biome biome)
    {
        return BuiltinRegistries.register(BuiltinRegistries.BIOME, key, biome);
    }
}
