package com.albertsmods.lushforest.world.biome;

import com.albertsmods.lushforest.LushForest;
import com.albertsmods.lushforest.config.ConfigManager;
import com.mojang.datafixers.util.Pair;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.Climate;
import terrablender.api.Region;
import terrablender.api.RegionType;

import java.util.function.Consumer;

public class ModBiomeProvider extends Region {


    public ModBiomeProvider(ResourceLocation name, RegionType type, int weight) {
        super(name, type, weight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper)
    {
        if (ConfigManager.getConfig().lushValleyEnabled) {
            this.addBiomeSimilar(mapper, Biomes.SAVANNA_PLATEAU, ModBiomeInit.LUSH_VALLEY);
            if (ConfigManager.getConfig().debugMessages) {
                LushForest.LOGGER.debug("Lush Valleys are enabled.");
            }
        }

        if (ConfigManager.getConfig().lushForestEnabled) {
            this.addBiomeSimilar(mapper, Biomes.SPARSE_JUNGLE, ModBiomeInit.LUSH_FOREST);
            if (ConfigManager.getConfig().debugMessages) {
                LushForest.LOGGER.debug("Lush forests are enabled.");
            }
        }

        if (ConfigManager.getConfig().lushBirchForestEnabled) {
            this.addBiomeSimilar(mapper, Biomes.OLD_GROWTH_BIRCH_FOREST, ModBiomeInit.LUSH_BIRCH_FOREST);
            if (ConfigManager.getConfig().debugMessages) {
                LushForest.LOGGER.debug("Lush birch forests are enabled.");
            }
        }

        if (ConfigManager.getConfig().lushJungleEnabled) {
            this.addBiomeSimilar(mapper, Biomes.JUNGLE, ModBiomeInit.LUSH_JUNGLE);
            if (ConfigManager.getConfig().debugMessages) {
                LushForest.LOGGER.debug("Lush jungles are enabled.");
            }
        }
    }
}
