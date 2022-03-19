package com.albertsmods.lushforest.world.biome;

import com.albertsmods.lushforest.LushForest;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;

public class ModBiomeInit {

    public static final ResourceKey<Biome> LUSH_FOREST = register("lush_forest");
    public static final ResourceKey<Biome> LUSH_VALLEY = register("lush_valley");
    public static final ResourceKey<Biome> LUSH_BIRCH_FOREST = register("lush_birch_forest");
    public static final ResourceKey<Biome> LUSH_JUNGLE = register("lush_jungle");

    public static final ResourceKey<Biome> SURFACE_WORKER = register("do_not_gen");

    private static ResourceKey<Biome> register(String name)
    {
        return ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(LushForest.MOD_ID, name));
    }
}
