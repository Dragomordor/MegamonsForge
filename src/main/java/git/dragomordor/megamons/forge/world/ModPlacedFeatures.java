package git.dragomordor.megamons.forge.world;

import git.dragomordor.megamons.forge.MegamonsMod;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModPlacedFeatures {

    // Geodes
    public static final ResourceKey<PlacedFeature> AERODACTYLITE_GEODE = PlacementUtils.createKey("aerodactylite_geode_placed");
    public static final ResourceKey<PlacedFeature> ALAKAZITE_GEODE = PlacementUtils.createKey("alakazite_geode_placed");
    public static final ResourceKey<PlacedFeature> BEEDRILLITE_GEODE = PlacementUtils.createKey("beedrillite_geode_placed");
    public static final ResourceKey<PlacedFeature> BLASTOISINITE_GEODE = PlacementUtils.createKey("blastoisinite_geode_placed");
    public static final ResourceKey<PlacedFeature> CHARIZARDITEX_GEODE = PlacementUtils.createKey("charizarditex_geode_placed");
    public static final ResourceKey<PlacedFeature> CHARIZARDITEY_GEODE = PlacementUtils.createKey("charizarditey_geode_placed");
    public static final ResourceKey<PlacedFeature> GENGARITE_GEODE = PlacementUtils.createKey("gengarite_geode_placed");
    public static final ResourceKey<PlacedFeature> GYARADOSITE_GEODE = PlacementUtils.createKey("gyaradosite_geode_placed");
    public static final ResourceKey<PlacedFeature> KANGASKHANITE_GEODE = PlacementUtils.createKey("kangaskhanite_geode_placed");
    public static final ResourceKey<PlacedFeature> MEWTWONITEX_GEODE = PlacementUtils.createKey("mewtwonitex_geode_placed");
    public static final ResourceKey<PlacedFeature> MEWTWONITEY_GEODE = PlacementUtils.createKey("mewtwonitey_geode_placed");
    public static final ResourceKey<PlacedFeature> PIDGEOTITE_GEODE = PlacementUtils.createKey("pidgeotite_geode_placed");
    public static final ResourceKey<PlacedFeature> PINSIRITE_GEODE = PlacementUtils.createKey("pinsirite_geode_placed");
    public static final ResourceKey<PlacedFeature> SLOWBRONITE_GEODE = PlacementUtils.createKey("slowbronite_geode_placed");
    public static final ResourceKey<PlacedFeature> VENUSAURITE_GEODE = PlacementUtils.createKey("venusaurite_geode_placed");





    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> holderGetter = context.lookup(Registries.CONFIGURED_FEATURE);
        Holder<ConfiguredFeature<?, ?>> aerodactylite_holder = holderGetter.getOrThrow(ModConfiguredFeatures.AERODACTYLITE_GEODE);
        Holder<ConfiguredFeature<?, ?>> alakazite_holder = holderGetter.getOrThrow(ModConfiguredFeatures.ALAKAZITE_GEODE);
        Holder<ConfiguredFeature<?, ?>> beedrillite_holder = holderGetter.getOrThrow(ModConfiguredFeatures.BEEDRILLITE_GEODE);
        Holder<ConfiguredFeature<?, ?>> blastoisinite_holder = holderGetter.getOrThrow(ModConfiguredFeatures.BLASTOISINITE_GEODE);
        Holder<ConfiguredFeature<?, ?>> charizarditex_holder = holderGetter.getOrThrow(ModConfiguredFeatures.CHARIZARDITEX_GEODE);
        Holder<ConfiguredFeature<?, ?>> charizarditey_holder = holderGetter.getOrThrow(ModConfiguredFeatures.CHARIZARDITEY_GEODE);
        Holder<ConfiguredFeature<?, ?>> gengarite_holder = holderGetter.getOrThrow(ModConfiguredFeatures.GENGARITE_GEODE);
        Holder<ConfiguredFeature<?, ?>> gyaradosite_holder = holderGetter.getOrThrow(ModConfiguredFeatures.GYARADOSITE_GEODE);
        Holder<ConfiguredFeature<?, ?>> kangaskhanite_holder = holderGetter.getOrThrow(ModConfiguredFeatures.KANGASKHANITE_GEODE);
        Holder<ConfiguredFeature<?, ?>> mewtwonitex_holder = holderGetter.getOrThrow(ModConfiguredFeatures.MEWTWONITEX_GEODE);
        Holder<ConfiguredFeature<?, ?>> mewtwonitey_holder = holderGetter.getOrThrow(ModConfiguredFeatures.MEWTWONITEY_GEODE);
        Holder<ConfiguredFeature<?, ?>> pidgeotite_holder = holderGetter.getOrThrow(ModConfiguredFeatures.PIDGEOTITE_GEODE);
        Holder<ConfiguredFeature<?, ?>> pinsirite_holder = holderGetter.getOrThrow(ModConfiguredFeatures.PINSIRITE_GEODE);
        Holder<ConfiguredFeature<?, ?>> slowbronite_holder = holderGetter.getOrThrow(ModConfiguredFeatures.SLOWBRONITE_GEODE);
        Holder<ConfiguredFeature<?, ?>> venusaurite_holder = holderGetter.getOrThrow(ModConfiguredFeatures.VENUSAURITE_GEODE);


        PlacementUtils.register(context, AERODACTYLITE_GEODE, aerodactylite_holder,
                new PlacementModifier[]{RarityFilter.onAverageOnceEvery(600), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)),
                        BiomeFilter.biome()});

        PlacementUtils.register(context, AERODACTYLITE_GEODE, aerodactylite_holder,
                new PlacementModifier[]{RarityFilter.onAverageOnceEvery(600), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)),
                        BiomeFilter.biome()});

        PlacementUtils.register(context, ALAKAZITE_GEODE, alakazite_holder,
                new PlacementModifier[]{RarityFilter.onAverageOnceEvery(600), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)),
                        BiomeFilter.biome()});

        PlacementUtils.register(context, BEEDRILLITE_GEODE, beedrillite_holder,
                new PlacementModifier[]{RarityFilter.onAverageOnceEvery(600), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)),
                        BiomeFilter.biome()});

        PlacementUtils.register(context, BLASTOISINITE_GEODE, blastoisinite_holder,
                new PlacementModifier[]{RarityFilter.onAverageOnceEvery(600), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)),
                        BiomeFilter.biome()});

        PlacementUtils.register(context, CHARIZARDITEX_GEODE, charizarditex_holder,
                new PlacementModifier[]{RarityFilter.onAverageOnceEvery(600), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)),
                        BiomeFilter.biome()});

        PlacementUtils.register(context, CHARIZARDITEY_GEODE, charizarditey_holder,
                new PlacementModifier[]{RarityFilter.onAverageOnceEvery(600), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)),
                        BiomeFilter.biome()});

        PlacementUtils.register(context, GENGARITE_GEODE, gengarite_holder,
                new PlacementModifier[]{RarityFilter.onAverageOnceEvery(600), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)),
                        BiomeFilter.biome()});

        PlacementUtils.register(context, GYARADOSITE_GEODE, gyaradosite_holder,
                new PlacementModifier[]{RarityFilter.onAverageOnceEvery(600), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)),
                        BiomeFilter.biome()});

        PlacementUtils.register(context, KANGASKHANITE_GEODE, kangaskhanite_holder,
                new PlacementModifier[]{RarityFilter.onAverageOnceEvery(600), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)),
                        BiomeFilter.biome()});

        PlacementUtils.register(context, MEWTWONITEX_GEODE, mewtwonitex_holder,
                new PlacementModifier[]{RarityFilter.onAverageOnceEvery(600), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)),
                        BiomeFilter.biome()});

        PlacementUtils.register(context, MEWTWONITEY_GEODE, mewtwonitey_holder,
                new PlacementModifier[]{RarityFilter.onAverageOnceEvery(600), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)),
                        BiomeFilter.biome()});

        PlacementUtils.register(context, PIDGEOTITE_GEODE, pidgeotite_holder,
                new PlacementModifier[]{RarityFilter.onAverageOnceEvery(600), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)),
                        BiomeFilter.biome()});

        PlacementUtils.register(context, PINSIRITE_GEODE, pinsirite_holder,
                new PlacementModifier[]{RarityFilter.onAverageOnceEvery(600), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)),
                        BiomeFilter.biome()});

        PlacementUtils.register(context, SLOWBRONITE_GEODE, slowbronite_holder,
                new PlacementModifier[]{RarityFilter.onAverageOnceEvery(600), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)),
                        BiomeFilter.biome()});

        PlacementUtils.register(context, VENUSAURITE_GEODE, venusaurite_holder,
                new PlacementModifier[]{RarityFilter.onAverageOnceEvery(600), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)),
                        BiomeFilter.biome()});



//        //Geodes
//        register(context, AERODACTYLITE_GEODE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.AERODACTYLITE_GEODE), List.of(
//                RarityFilter.onAverageOnceEvery(600), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6),
//                        VerticalAnchor.absolute(30)), BiomeFilter.biome()));
//        register(context, ALAKAZITE_GEODE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ALAKAZITE_GEODE), List.of(
//                RarityFilter.onAverageOnceEvery(600), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6),
//                        VerticalAnchor.absolute(30)), BiomeFilter.biome()));
//        register(context, BEEDRILLITE_GEODE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BEEDRILLITE_GEODE), List.of(
//                RarityFilter.onAverageOnceEvery(600), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6),
//                        VerticalAnchor.absolute(30)), BiomeFilter.biome()));
//        register(context, BLASTOISINITE_GEODE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLASTOISINITE_GEODE_KEY), List.of(
//                RarityFilter.onAverageOnceEvery(600), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6),
//                        VerticalAnchor.absolute(30)), BiomeFilter.biome()));
//        register(context, CHARIZARDITEX_GEODE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CHARIZARDITEX_GEODE_KEY), List.of(
//                RarityFilter.onAverageOnceEvery(600), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6),
//                        VerticalAnchor.absolute(30)), BiomeFilter.biome()));
//        register(context, CHARIZARDITEY_GEODE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CHARIZARDITEY_GEODE_KEY), List.of(
//                RarityFilter.onAverageOnceEvery(600), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6),
//                        VerticalAnchor.absolute(30)), BiomeFilter.biome()));
//        register(context, GENGARITE_GEODE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.GENGARITE_GEODE_KEY), List.of(
//                RarityFilter.onAverageOnceEvery(600), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6),
//                        VerticalAnchor.absolute(30)), BiomeFilter.biome()));
//        register(context, GYARADOSITE_GEODE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.GYARADOSITE_GEODE_KEY), List.of(
//                RarityFilter.onAverageOnceEvery(600), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6),
//                        VerticalAnchor.absolute(30)), BiomeFilter.biome()));
//        register(context, KANGASKHANITE_GEODE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.KANGASKHANITE_GEODE_KEY), List.of(
//                RarityFilter.onAverageOnceEvery(600), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6),
//                        VerticalAnchor.absolute(30)), BiomeFilter.biome()));
//        register(context, MEWTWONITEX_GEODE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MEWTWONITEX_GEODE_KEY), List.of(
//                RarityFilter.onAverageOnceEvery(600), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6),
//                        VerticalAnchor.absolute(30)), BiomeFilter.biome()));
//        register(context, MEWTWONITEY_GEODE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MEWTWONITEY_GEODE_KEY), List.of(
//                RarityFilter.onAverageOnceEvery(600), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6),
//                        VerticalAnchor.absolute(30)), BiomeFilter.biome()));
//        register(context, PIDGEOTITE_GEODE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PIDGEOTITE_GEODE_KEY), List.of(
//                RarityFilter.onAverageOnceEvery(600), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6),
//                        VerticalAnchor.absolute(30)), BiomeFilter.biome()));
//        register(context, PINSIRITE_GEODE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PINSIRITE_GEODE_KEY), List.of(
//                RarityFilter.onAverageOnceEvery(600), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6),
//                        VerticalAnchor.absolute(30)), BiomeFilter.biome()));
//        register(context, SLOWBRONITE_GEODE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SLOWBRONITE_GEODE_KEY), List.of(
//                RarityFilter.onAverageOnceEvery(600), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6),
//                        VerticalAnchor.absolute(30)), BiomeFilter.biome()));
//        register(context, VENUSAURITE_GEODE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.VENUSAURITE_GEODE_KEY), List.of(
//                RarityFilter.onAverageOnceEvery(600), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6),
//                        VerticalAnchor.absolute(30)), BiomeFilter.biome()));


    }


//    private static ResourceKey<PlacedFeature> registerKey(String name) {
//        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(MegamonsMod.MODID, name));
//    }
//
//    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
//                                 List<PlacementModifier> modifiers) {
//        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
//    }
}
