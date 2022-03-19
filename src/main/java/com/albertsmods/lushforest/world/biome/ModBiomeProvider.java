package com.albertsmods.lushforest.world.biome;

import com.mojang.datafixers.util.Pair;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.Climate;
import terrablender.worldgen.DefaultOverworldRegion;

import java.util.function.Consumer;

public class ModBiomeProvider extends DefaultOverworldRegion {

    public ModBiomeProvider(int weight) {
        super(weight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper)
    {
        this.addBiome(mapper, Climate.Parameter.point(0.5F), Climate.Parameter.point(0.7F), Climate.Parameter.point(1.3F), Climate.Parameter.point(0.4F), Climate.Parameter.point(0.2F), Climate.Parameter.point(0.1F), 0.0F, ModBiomeInit.LUSH_VALLEY);
        this.addBiomeSimilar(mapper, Biomes.SPARSE_JUNGLE, ModBiomeInit.LUSH_FOREST);
        this.addBiomeSimilar(mapper, Biomes.OLD_GROWTH_BIRCH_FOREST, ModBiomeInit.LUSH_BIRCH_FOREST);
        this.addBiomeSimilar(mapper, Biomes.JUNGLE, ModBiomeInit.LUSH_JUNGLE);
    }
}
