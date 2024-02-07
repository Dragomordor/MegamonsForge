package git.dragomordor.megamons.forge.world;

import git.dragomordor.megamons.forge.block.MegamonsBlocks;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GeodeBlockSettings;
import net.minecraft.world.level.levelgen.GeodeCrackSettings;
import net.minecraft.world.level.levelgen.GeodeLayerSettings;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.GeodeConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

import java.util.List;

public class ModConfiguredFeatures {


    // Geodes
    public static final ResourceKey<ConfiguredFeature<?,?>> AERODACTYLITE_GEODE = FeatureUtils.createKey("aerodactylite_geode") ;
    public static final ResourceKey<ConfiguredFeature<?,?>> ALAKAZITE_GEODE = FeatureUtils.createKey("alakazite_geode") ;
    public static final ResourceKey<ConfiguredFeature<?,?>> BEEDRILLITE_GEODE = FeatureUtils.createKey("beedrillite_geode") ;
    public static final ResourceKey<ConfiguredFeature<?,?>> BLASTOISINITE_GEODE = FeatureUtils.createKey("blastoisinite_geode") ;
    public static final ResourceKey<ConfiguredFeature<?,?>> CHARIZARDITEX_GEODE = FeatureUtils.createKey("charizarditex_geode") ;
    public static final ResourceKey<ConfiguredFeature<?,?>> CHARIZARDITEY_GEODE = FeatureUtils.createKey("charizarditey_geode") ;
    public static final ResourceKey<ConfiguredFeature<?,?>> GENGARITE_GEODE = FeatureUtils.createKey("gengarite_geode") ;
    public static final ResourceKey<ConfiguredFeature<?,?>> GYARADOSITE_GEODE = FeatureUtils.createKey("gyaradosite_geode") ;
    public static final ResourceKey<ConfiguredFeature<?,?>> KANGASKHANITE_GEODE = FeatureUtils.createKey("kangaskhanite_geode") ;
    public static final ResourceKey<ConfiguredFeature<?,?>> MEWTWONITEX_GEODE = FeatureUtils.createKey("mewtwonitex_geode") ;
    public static final ResourceKey<ConfiguredFeature<?,?>> MEWTWONITEY_GEODE = FeatureUtils.createKey("mewtwonitey_geode") ;
    public static final ResourceKey<ConfiguredFeature<?,?>> PIDGEOTITE_GEODE = FeatureUtils.createKey("pidgeotite_geode") ;
    public static final ResourceKey<ConfiguredFeature<?,?>> PINSIRITE_GEODE = FeatureUtils.createKey("pinsirite_geode") ;
    public static final ResourceKey<ConfiguredFeature<?,?>> SLOWBRONITE_GEODE = FeatureUtils.createKey("slowbronite_geode") ;
    public static final ResourceKey<ConfiguredFeature<?,?>> VENUSAURITE_GEODE = FeatureUtils.createKey("venusaurite_geode") ;



    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        // Geodes
        // Alakazite geode
        FeatureUtils.register(context, AERODACTYLITE_GEODE, Feature.GEODE, new GeodeConfiguration(
                new GeodeBlockSettings(
                        BlockStateProvider.simple(Blocks.AIR), // filling
                        BlockStateProvider.simple(MegamonsBlocks.ANISTARITE_GEODE_BLOCK.get()), // inner layer
                        BlockStateProvider.simple(MegamonsBlocks.ORE_CRYSTAL_AERODACTYLITE.get()), //alternate inner layer
                        BlockStateProvider.simple(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK.get()), // middle layer
                        BlockStateProvider.simple(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK.get()), // outer layer
                        List.of( // inner blocks
                                MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_ICE_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_MOON_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_SUN_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_WATER_STONE_ORE.get().defaultBlockState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.0D, 2.8D, 2.9D, 3.9D),
                new GeodeCrackSettings(0.3D, 1.0D, 1),
                0.025D, 0.002D,
                false, UniformInt.of(4, 5),
                UniformInt.of(3, 4), UniformInt.of(1, 2),
                -16, 16, 0.05D, 1));

        // Alakazite geode
        FeatureUtils.register(context, ALAKAZITE_GEODE, Feature.GEODE, new GeodeConfiguration(
                new GeodeBlockSettings(
                        BlockStateProvider.simple(Blocks.AIR), // filling
                        BlockStateProvider.simple(MegamonsBlocks.ANISTARITE_GEODE_BLOCK.get()), // inner layer
                        BlockStateProvider.simple(MegamonsBlocks.ORE_CRYSTAL_ALAKAZITE.get()), //alternate inner layer
                        BlockStateProvider.simple(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK.get()), // middle layer
                        BlockStateProvider.simple(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK.get()), // outer layer
                        List.of( // inner blocks
                                MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_ICE_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_MOON_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_SUN_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_WATER_STONE_ORE.get().defaultBlockState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.0D, 2.8D, 2.9D, 3.9D),
                new GeodeCrackSettings(0.3D, 1.0D, 1),
                0.025D, 0.002D,
                false, UniformInt.of(4, 5),
                UniformInt.of(3, 4), UniformInt.of(1, 2),
                -16, 16, 0.05D, 1));

        // Beedrilite geode
        FeatureUtils.register(context, BEEDRILLITE_GEODE, Feature.GEODE, new GeodeConfiguration(
                new GeodeBlockSettings(
                        BlockStateProvider.simple(Blocks.AIR), // filling
                        BlockStateProvider.simple(MegamonsBlocks.ANISTARITE_GEODE_BLOCK.get()), // inner layer
                        BlockStateProvider.simple(MegamonsBlocks.ORE_CRYSTAL_BEEDRILLITE.get()), //alternate inner layer
                        BlockStateProvider.simple(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK.get()), // middle layer
                        BlockStateProvider.simple(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK.get()), // outer layer
                        List.of( // inner blocks
                                MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_ICE_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_MOON_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_SUN_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_WATER_STONE_ORE.get().defaultBlockState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.0D, 2.8D, 2.9D, 3.9D),
                new GeodeCrackSettings(0.3D, 1.0D, 1),
                0.025D, 0.002D,
                false, UniformInt.of(4, 5),
                UniformInt.of(3, 4), UniformInt.of(1, 2),
                -16, 16, 0.05D, 1));
        // Blastoisinite geode
        FeatureUtils.register(context, BLASTOISINITE_GEODE, Feature.GEODE, new GeodeConfiguration(
                new GeodeBlockSettings(
                        BlockStateProvider.simple(Blocks.AIR), // filling
                        BlockStateProvider.simple(MegamonsBlocks.ANISTARITE_GEODE_BLOCK.get()), // inner layer
                        BlockStateProvider.simple(MegamonsBlocks.ORE_CRYSTAL_BLASTOISINITE.get()), //alternate inner layer
                        BlockStateProvider.simple(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK.get()), // middle layer
                        BlockStateProvider.simple(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK.get()), // outer layer
                        List.of( // inner blocks
                                MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_ICE_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_MOON_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_SUN_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_WATER_STONE_ORE.get().defaultBlockState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.0D, 2.8D, 2.9D, 3.9D),
                new GeodeCrackSettings(0.3D, 1.0D, 1),
                0.025D, 0.002D,
                false, UniformInt.of(4, 5),
                UniformInt.of(3, 4), UniformInt.of(1, 2),
                -16, 16, 0.05D, 1));
        // CharizarditeX geode
        FeatureUtils.register(context, CHARIZARDITEX_GEODE, Feature.GEODE, new GeodeConfiguration(
                new GeodeBlockSettings(
                        BlockStateProvider.simple(Blocks.AIR), // filling
                        BlockStateProvider.simple(MegamonsBlocks.ANISTARITE_GEODE_BLOCK.get()), // inner layer
                        BlockStateProvider.simple(MegamonsBlocks.ORE_CRYSTAL_CHARIZARDITEX.get()), //alternate inner layer
                        BlockStateProvider.simple(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK.get()), // middle layer
                        BlockStateProvider.simple(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK.get()), // outer layer
                        List.of( // inner blocks
                                MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_ICE_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_MOON_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_SUN_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_WATER_STONE_ORE.get().defaultBlockState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.0D, 2.8D, 2.9D, 3.9D),
                new GeodeCrackSettings(0.3D, 1.0D, 1),
                0.025D, 0.002D,
                false, UniformInt.of(4, 5),
                UniformInt.of(3, 4), UniformInt.of(1, 2),
                -16, 16, 0.05D, 1));
        // CharizarditeY geode
        FeatureUtils.register(context, CHARIZARDITEY_GEODE, Feature.GEODE, new GeodeConfiguration(
                new GeodeBlockSettings(
                        BlockStateProvider.simple(Blocks.AIR), // filling
                        BlockStateProvider.simple(MegamonsBlocks.ANISTARITE_GEODE_BLOCK.get()), // inner layer
                        BlockStateProvider.simple(MegamonsBlocks.ORE_CRYSTAL_CHARIZARDITEY.get()), //alternate inner layer
                        BlockStateProvider.simple(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK.get()), // middle layer
                        BlockStateProvider.simple(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK.get()), // outer layer
                        List.of( // inner blocks
                                MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_ICE_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_MOON_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_SUN_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_WATER_STONE_ORE.get().defaultBlockState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.0D, 2.8D, 2.9D, 3.9D),
                new GeodeCrackSettings(0.3D, 1.0D, 1),
                0.025D, 0.002D,
                false, UniformInt.of(4, 5),
                UniformInt.of(3, 4), UniformInt.of(1, 2),
                -16, 16, 0.05D, 1));
        // Gengarite geode
        FeatureUtils.register(context, GENGARITE_GEODE, Feature.GEODE, new GeodeConfiguration(
                new GeodeBlockSettings(
                        BlockStateProvider.simple(Blocks.AIR), // filling
                        BlockStateProvider.simple(MegamonsBlocks.ANISTARITE_GEODE_BLOCK.get()), // inner layer
                        BlockStateProvider.simple(MegamonsBlocks.ORE_CRYSTAL_GENGARITE.get()), //alternate inner layer
                        BlockStateProvider.simple(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK.get()), // middle layer
                        BlockStateProvider.simple(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK.get()), // outer layer
                        List.of( // inner blocks
                                MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_ICE_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_MOON_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_SUN_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_WATER_STONE_ORE.get().defaultBlockState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.0D, 2.8D, 2.9D, 3.9D),
                new GeodeCrackSettings(0.3D, 1.0D, 1),
                0.025D, 0.002D,
                false, UniformInt.of(4, 5),
                UniformInt.of(3, 4), UniformInt.of(1, 2),
                -16, 16, 0.05D, 1));
        // Gyaradosite geode
        FeatureUtils.register(context, GYARADOSITE_GEODE, Feature.GEODE, new GeodeConfiguration(
                new GeodeBlockSettings(
                        BlockStateProvider.simple(Blocks.AIR), // filling
                        BlockStateProvider.simple(MegamonsBlocks.ANISTARITE_GEODE_BLOCK.get()), // inner layer
                        BlockStateProvider.simple(MegamonsBlocks.ORE_CRYSTAL_GYARADOSITE.get()), //alternate inner layer
                        BlockStateProvider.simple(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK.get()), // middle layer
                        BlockStateProvider.simple(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK.get()), // outer layer
                        List.of( // inner blocks
                                MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_ICE_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_MOON_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_SUN_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_WATER_STONE_ORE.get().defaultBlockState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.0D, 2.8D, 2.9D, 3.9D),
                new GeodeCrackSettings(0.3D, 1.0D, 1),
                0.025D, 0.002D,
                false, UniformInt.of(4, 5),
                UniformInt.of(3, 4), UniformInt.of(1, 2),
                -16, 16, 0.05D, 1));
        // kangaskhanite geode
        FeatureUtils.register(context, KANGASKHANITE_GEODE, Feature.GEODE, new GeodeConfiguration(
                new GeodeBlockSettings(
                        BlockStateProvider.simple(Blocks.AIR), // filling
                        BlockStateProvider.simple(MegamonsBlocks.ANISTARITE_GEODE_BLOCK.get()), // inner layer
                        BlockStateProvider.simple(MegamonsBlocks.ORE_CRYSTAL_KANGASKHANITE.get()), //alternate inner layer
                        BlockStateProvider.simple(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK.get()), // middle layer
                        BlockStateProvider.simple(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK.get()), // outer layer
                        List.of( // inner blocks
                                MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_ICE_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_MOON_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_SUN_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_WATER_STONE_ORE.get().defaultBlockState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.0D, 2.8D, 2.9D, 3.9D),
                new GeodeCrackSettings(0.3D, 1.0D, 1),
                0.025D, 0.002D,
                false, UniformInt.of(4, 5),
                UniformInt.of(3, 4), UniformInt.of(1, 2),
                -16, 16, 0.05D, 1));
        // MewtwoniteX geode
        FeatureUtils.register(context, MEWTWONITEX_GEODE, Feature.GEODE, new GeodeConfiguration(
                new GeodeBlockSettings(
                        BlockStateProvider.simple(Blocks.AIR), // filling
                        BlockStateProvider.simple(MegamonsBlocks.ANISTARITE_GEODE_BLOCK.get()), // inner layer
                        BlockStateProvider.simple(MegamonsBlocks.ORE_CRYSTAL_MEWTWONITEX.get()), //alternate inner layer
                        BlockStateProvider.simple(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK.get()), // middle layer
                        BlockStateProvider.simple(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK.get()), // outer layer
                        List.of( // inner blocks
                                MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_ICE_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_MOON_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_SUN_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_WATER_STONE_ORE.get().defaultBlockState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.0D, 2.8D, 2.9D, 3.9D),
                new GeodeCrackSettings(0.3D, 1.0D, 1),
                0.025D, 0.002D,
                false, UniformInt.of(4, 5),
                UniformInt.of(3, 4), UniformInt.of(1, 2),
                -16, 16, 0.05D, 1));
        // MewtwoniteY geode
        FeatureUtils.register(context, MEWTWONITEY_GEODE, Feature.GEODE, new GeodeConfiguration(
                new GeodeBlockSettings(
                        BlockStateProvider.simple(Blocks.AIR), // filling
                        BlockStateProvider.simple(MegamonsBlocks.ANISTARITE_GEODE_BLOCK.get()), // inner layer
                        BlockStateProvider.simple(MegamonsBlocks.ORE_CRYSTAL_MEWTWONITEY.get()), //alternate inner layer
                        BlockStateProvider.simple(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK.get()), // middle layer
                        BlockStateProvider.simple(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK.get()), // outer layer
                        List.of( // inner blocks
                                MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_ICE_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_MOON_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_SUN_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_WATER_STONE_ORE.get().defaultBlockState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.0D, 2.8D, 2.9D, 3.9D),
                new GeodeCrackSettings(0.3D, 1.0D, 1),
                0.025D, 0.002D,
                false, UniformInt.of(4, 5),
                UniformInt.of(3, 4), UniformInt.of(1, 2),
                -16, 16, 0.05D, 1));
        // Pidgeotite geode
        FeatureUtils.register(context, PIDGEOTITE_GEODE, Feature.GEODE, new GeodeConfiguration(
                new GeodeBlockSettings(
                        BlockStateProvider.simple(Blocks.AIR), // filling
                        BlockStateProvider.simple(MegamonsBlocks.ANISTARITE_GEODE_BLOCK.get()), // inner layer
                        BlockStateProvider.simple(MegamonsBlocks.ORE_CRYSTAL_PIDGEOTITE.get()), //alternate inner layer
                        BlockStateProvider.simple(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK.get()), // middle layer
                        BlockStateProvider.simple(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK.get()), // outer layer
                        List.of( // inner blocks
                                MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_ICE_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_MOON_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_SUN_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_WATER_STONE_ORE.get().defaultBlockState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.0D, 2.8D, 2.9D, 3.9D),
                new GeodeCrackSettings(0.3D, 1.0D, 1),
                0.025D, 0.002D,
                false, UniformInt.of(4, 5),
                UniformInt.of(3, 4), UniformInt.of(1, 2),
                -16, 16, 0.05D, 1));
        // Pinsirite geode
        FeatureUtils.register(context, PINSIRITE_GEODE, Feature.GEODE, new GeodeConfiguration(
                new GeodeBlockSettings(
                        BlockStateProvider.simple(Blocks.AIR), // filling
                        BlockStateProvider.simple(MegamonsBlocks.ANISTARITE_GEODE_BLOCK.get()), // inner layer
                        BlockStateProvider.simple(MegamonsBlocks.ORE_CRYSTAL_PINSIRITE.get()), //alternate inner layer
                        BlockStateProvider.simple(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK.get()), // middle layer
                        BlockStateProvider.simple(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK.get()), // outer layer
                        List.of( // inner blocks
                                MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_ICE_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_MOON_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_SUN_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_WATER_STONE_ORE.get().defaultBlockState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.0D, 2.8D, 2.9D, 3.9D),
                new GeodeCrackSettings(0.3D, 1.0D, 1),
                0.025D, 0.002D,
                false, UniformInt.of(4, 5),
                UniformInt.of(3, 4), UniformInt.of(1, 2),
                -16, 16, 0.05D, 1));
        // Slowbronite geode
        FeatureUtils.register(context, SLOWBRONITE_GEODE, Feature.GEODE, new GeodeConfiguration(
                new GeodeBlockSettings(
                        BlockStateProvider.simple(Blocks.AIR), // filling
                        BlockStateProvider.simple(MegamonsBlocks.ANISTARITE_GEODE_BLOCK.get()), // inner layer
                        BlockStateProvider.simple(MegamonsBlocks.ORE_CRYSTAL_SLOWBRONITE.get()), //alternate inner layer
                        BlockStateProvider.simple(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK.get()), // middle layer
                        BlockStateProvider.simple(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK.get()), // outer layer
                        List.of( // inner blocks
                                MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_ICE_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_MOON_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_SUN_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_WATER_STONE_ORE.get().defaultBlockState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.0D, 2.8D, 2.9D, 3.9D),
                new GeodeCrackSettings(0.3D, 1.0D, 1),
                0.025D, 0.002D,
                false, UniformInt.of(4, 5),
                UniformInt.of(3, 4), UniformInt.of(1, 2),
                -16, 16, 0.05D, 1));
        // Venusaurite geode
        FeatureUtils.register(context, VENUSAURITE_GEODE, Feature.GEODE, new GeodeConfiguration(
                new GeodeBlockSettings(
                        BlockStateProvider.simple(Blocks.AIR), // filling
                        BlockStateProvider.simple(MegamonsBlocks.ANISTARITE_GEODE_BLOCK.get()), // inner layer
                        BlockStateProvider.simple(MegamonsBlocks.ORE_CRYSTAL_VENUSAURITE.get()), //alternate inner layer
                        BlockStateProvider.simple(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK.get()), // middle layer
                        BlockStateProvider.simple(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK.get()), // outer layer
                        List.of( // inner blocks
                                MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_ICE_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_MOON_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_SUN_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE.get().defaultBlockState(),
                                MegamonsBlocks.CRYSTAL_WATER_STONE_ORE.get().defaultBlockState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.0D, 2.8D, 2.9D, 3.9D),
                new GeodeCrackSettings(0.3D, 1.0D, 1),
                0.025D, 0.002D,
                false, UniformInt.of(4, 5),
                UniformInt.of(3, 4), UniformInt.of(1, 2),
                -16, 16, 0.05D, 1));


    }




}
