package com.albertsmods.lushforest.world.biome;

import com.albertsmods.lushforest.LushForest;
import com.albertsmods.lushforest.config.ConfigManager;
import com.albertsmods.lushforest.world.feature.ModPlacedFeatures;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.levelgen.GenerationStep;

public class ModDefaultBiomeFeatures {

    public static void addCalciteBoulders(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.RAW_GENERATION, ModPlacedFeatures.CALCITE_BOULDER);
        if (ConfigManager.getConfig().debugMessages) {
            LushForest.LOGGER.debug("Calcite Boulders have been added.");
        }
    }
}
