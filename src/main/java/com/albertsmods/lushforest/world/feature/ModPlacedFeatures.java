package com.albertsmods.lushforest.world.feature;

import com.albertsmods.lushforest.LushForest;
import net.minecraft.core.Holder;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModPlacedFeatures {

    public static final Holder<PlacedFeature> CALCITE_BOULDER = createPlacedFeature("calcite_boulder", ModConfiguredFeatures.CALCITE_BOULDER, CountPlacement.of(2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());


    public static <FC extends FeatureConfiguration> Holder<PlacedFeature> createPlacedFeature(String id, Holder<ConfiguredFeature<FC, ?>> feature, List<PlacementModifier> placementModifiers) {
                return BuiltinRegistries.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(LushForest.MOD_ID), new PlacedFeature(Holder.hackyErase(feature), List.copyOf(placementModifiers)));
    }

    public static <FC extends FeatureConfiguration> Holder<PlacedFeature> createPlacedFeature(String id, Holder<ConfiguredFeature<FC, ?>> feature, PlacementModifier... placementModifiers) {
        return createPlacedFeature(id, feature, List.of(placementModifiers));
    }
}
