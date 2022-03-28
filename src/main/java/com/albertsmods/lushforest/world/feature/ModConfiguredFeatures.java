package com.albertsmods.lushforest.world.feature;

import com.albertsmods.lushforest.LushForest;
import net.minecraft.core.Holder;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.BlockStateConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;

public class ModConfiguredFeatures {

    public static final Holder<ConfiguredFeature<BlockStateConfiguration, ?>> CALCITE_BOULDER = createConfiguredFeature("calcite_boulder", Feature.FOREST_ROCK, new BlockStateConfiguration(Blocks.CALCITE.defaultBlockState()));

    public static <FC extends FeatureConfiguration, F extends Feature<FC>> Holder<ConfiguredFeature<FC, ?>> createConfiguredFeature(String id, F feature, FC config) {
        return BuiltinRegistries.registerExact(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(LushForest.MOD_ID, id).toString(), new ConfiguredFeature<>(feature, config));
    }
}
