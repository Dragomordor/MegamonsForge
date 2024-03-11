package git.dragomordor.megamons.forge.world;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

public class ModPlacedFeatures {

    private static final int GeodeCount = 27;
    private static final int GeodeRarity = 40;

    // Geodes
    // Gen 1
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
    // Gen 2
    public static final ResourceKey<PlacedFeature> AMPHAROSITE_GEODE = PlacementUtils.createKey("ampharosite_geode_placed");
    // TODO: Add Heracronite
    // TODO: Add Houndoominite
    public static final ResourceKey<PlacedFeature> SCIZORITE_GEODE = PlacementUtils.createKey("scizorite_geode_placed");
    public static final ResourceKey<PlacedFeature> STEELIXITE_GEODE = PlacementUtils.createKey("steelixite_geode_placed");
    public static final ResourceKey<PlacedFeature> TYRANITARITE_GEODE = PlacementUtils.createKey("tyranitarite_geode_placed");
    // Gen 3
    // TODO: Add Absolite
    // TODO: Add Aggronite
    // TODO: Add Altarianite
    public static final ResourceKey<PlacedFeature> BANETTITE_GEODE = PlacementUtils.createKey("banettite_geode_placed");
    // TODO: Add Blazikenite
    // TODO: Add Cameruptite
    public static final ResourceKey<PlacedFeature> GARDEVOIRITE_GEODE = PlacementUtils.createKey("gardevoirite_geode_placed");
    public static final ResourceKey<PlacedFeature> GLALITITE_GEODE = PlacementUtils.createKey("glalitite_geode_placed");
    // TODO: Add Latiasite
    // TODO: Add Latiosite
    public static final ResourceKey<PlacedFeature> MAWILITE_GEODE = PlacementUtils.createKey("mawilite_geode_placed");
    // TODO: Add Manechtite
    // TODO: Add Medichamite
    // TODO: Add Metagrossite
    // TODO: Add Rayquazite
    public static final ResourceKey<PlacedFeature> SABLENITE_GEODE = PlacementUtils.createKey("sablenite_geode_placed");
    // TODO: Add Salamencite
    // TODO: Add Sceptilite
    public static final ResourceKey<PlacedFeature> SHARPEDONITE_GEODE = PlacementUtils.createKey("sharpedonite_geode_placed");
    // TODO: Add Swampertite
    // Gen 4
    // TODO: Add Abomasite
    public static final ResourceKey<PlacedFeature> GALLADITE_GEODE = PlacementUtils.createKey("galladite_geode_placed");
    public static final ResourceKey<PlacedFeature> GARCHOMPITE_GEODE = PlacementUtils.createKey("garchompite_geode_placed");
    // TODO: Add Lopunnite
    // TODO: Add Lucarionite
    // Gen 5
    // TODO: Add Audinite
    // Gen 6
    // TODO: Add Diancite
    // Gen 7+

    
    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> holderGetter = context.lookup(Registries.CONFIGURED_FEATURE);
        // Gen 1
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
        // Gen 2
        Holder<ConfiguredFeature<?, ?>> ampharosite_holder = holderGetter.getOrThrow(ModConfiguredFeatures.AMPHAROSITE_GEODE);
        // TODO: Add Heracronite
        // TODO: Add Houndoominite
        Holder<ConfiguredFeature<?, ?>> scizorite_holder = holderGetter.getOrThrow(ModConfiguredFeatures.SCIZORITE_GEODE);
        Holder<ConfiguredFeature<?, ?>> steelixite_holder = holderGetter.getOrThrow(ModConfiguredFeatures.STEELIXITE_GEODE);
        Holder<ConfiguredFeature<?, ?>> tyranitarite_holder = holderGetter.getOrThrow(ModConfiguredFeatures.TYRANITARITE_GEODE);
        // Gen 3
        // TODO: Add Absolite
        // TODO: Add Aggronite
        // TODO: Add Altarianite
        Holder<ConfiguredFeature<?, ?>> banettite_holder = holderGetter.getOrThrow(ModConfiguredFeatures.BANETTITE_GEODE);
        // TODO: Add Blazikenite
        // TODO: Add Cameruptite
        Holder<ConfiguredFeature<?, ?>> gardevoirite_holder = holderGetter.getOrThrow(ModConfiguredFeatures.GARDEVOIRITE_GEODE);
        Holder<ConfiguredFeature<?, ?>> glalitite_holder = holderGetter.getOrThrow(ModConfiguredFeatures.GLALITITE_GEODE);
        // TODO: Add Latiasite
        // TODO: Add Latiosite
        Holder<ConfiguredFeature<?, ?>> mawilite_holder = holderGetter.getOrThrow(ModConfiguredFeatures.MAWILITE_GEODE);
        // TODO: Add Manechtite
        // TODO: Add Medichamite
        // TODO: Add Metagrossite
        // TODO: Add Rayquazite
        Holder<ConfiguredFeature<?, ?>> sablenite_holder = holderGetter.getOrThrow(ModConfiguredFeatures.SABLENITE_GEODE);
        // TODO: Add Salamencite
        // TODO: Add Sceptilite
        Holder<ConfiguredFeature<?, ?>> sharpedonite_holder = holderGetter.getOrThrow(ModConfiguredFeatures.SHARPEDONITE_GEODE);
        // TODO: Add Swampertite
        // Gen 4
        // TODO: Add Abomasite
        Holder<ConfiguredFeature<?, ?>> galladite_holder = holderGetter.getOrThrow(ModConfiguredFeatures.GALLADITE_GEODE);
        Holder<ConfiguredFeature<?, ?>> garchompite_holder = holderGetter.getOrThrow(ModConfiguredFeatures.GARCHOMPITE_GEODE);
        // TODO: Add Lopunnite
        // TODO: Add Lucarionite
        // Gen 5
        // TODO: Add Audinite
        // Gen 6
        // TODO: Add Diancite
        // Gen 7+


        // Gen 1
        PlacementUtils.register(context, AERODACTYLITE_GEODE, aerodactylite_holder,
                new PlacementModifier[]{RarityFilter.onAverageOnceEvery(GeodeCount * GeodeRarity), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)),
                        BiomeFilter.biome()});

        PlacementUtils.register(context, AERODACTYLITE_GEODE, aerodactylite_holder,
                new PlacementModifier[]{RarityFilter.onAverageOnceEvery(GeodeCount * GeodeRarity), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)),
                        BiomeFilter.biome()});

        PlacementUtils.register(context, ALAKAZITE_GEODE, alakazite_holder,
                new PlacementModifier[]{RarityFilter.onAverageOnceEvery(GeodeCount * GeodeRarity), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)),
                        BiomeFilter.biome()});

        PlacementUtils.register(context, BEEDRILLITE_GEODE, beedrillite_holder,
                new PlacementModifier[]{RarityFilter.onAverageOnceEvery(GeodeCount * GeodeRarity), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)),
                        BiomeFilter.biome()});

        PlacementUtils.register(context, BLASTOISINITE_GEODE, blastoisinite_holder,
                new PlacementModifier[]{RarityFilter.onAverageOnceEvery(GeodeCount * GeodeRarity), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)),
                        BiomeFilter.biome()});

        PlacementUtils.register(context, CHARIZARDITEX_GEODE, charizarditex_holder,
                new PlacementModifier[]{RarityFilter.onAverageOnceEvery(GeodeCount * GeodeRarity), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)),
                        BiomeFilter.biome()});

        PlacementUtils.register(context, CHARIZARDITEY_GEODE, charizarditey_holder,
                new PlacementModifier[]{RarityFilter.onAverageOnceEvery(GeodeCount * GeodeRarity), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)),
                        BiomeFilter.biome()});

        PlacementUtils.register(context, GENGARITE_GEODE, gengarite_holder,
                new PlacementModifier[]{RarityFilter.onAverageOnceEvery(GeodeCount * GeodeRarity), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)),
                        BiomeFilter.biome()});

        PlacementUtils.register(context, GYARADOSITE_GEODE, gyaradosite_holder,
                new PlacementModifier[]{RarityFilter.onAverageOnceEvery(GeodeCount * GeodeRarity), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)),
                        BiomeFilter.biome()});

        PlacementUtils.register(context, KANGASKHANITE_GEODE, kangaskhanite_holder,
                new PlacementModifier[]{RarityFilter.onAverageOnceEvery(GeodeCount * GeodeRarity), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)),
                        BiomeFilter.biome()});

        PlacementUtils.register(context, MEWTWONITEX_GEODE, mewtwonitex_holder,
                new PlacementModifier[]{RarityFilter.onAverageOnceEvery(GeodeCount * GeodeRarity), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)),
                        BiomeFilter.biome()});

        PlacementUtils.register(context, MEWTWONITEY_GEODE, mewtwonitey_holder,
                new PlacementModifier[]{RarityFilter.onAverageOnceEvery(GeodeCount * GeodeRarity), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)),
                        BiomeFilter.biome()});

        PlacementUtils.register(context, PIDGEOTITE_GEODE, pidgeotite_holder,
                new PlacementModifier[]{RarityFilter.onAverageOnceEvery(GeodeCount * GeodeRarity), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)),
                        BiomeFilter.biome()});

        PlacementUtils.register(context, PINSIRITE_GEODE, pinsirite_holder,
                new PlacementModifier[]{RarityFilter.onAverageOnceEvery(GeodeCount * GeodeRarity), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)),
                        BiomeFilter.biome()});

        PlacementUtils.register(context, SLOWBRONITE_GEODE, slowbronite_holder,
                new PlacementModifier[]{RarityFilter.onAverageOnceEvery(GeodeCount * GeodeRarity), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)),
                        BiomeFilter.biome()});

        PlacementUtils.register(context, VENUSAURITE_GEODE, venusaurite_holder,
                new PlacementModifier[]{RarityFilter.onAverageOnceEvery(GeodeCount * GeodeRarity), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)),
                        BiomeFilter.biome()});


        // Gen 2
        PlacementUtils.register(context, AMPHAROSITE_GEODE, ampharosite_holder,
                new PlacementModifier[]{RarityFilter.onAverageOnceEvery(GeodeCount * GeodeRarity), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)),
                        BiomeFilter.biome()});

        // TODO: Add Heracronite
        // TODO: Add Houndoominite

        PlacementUtils.register(context, SCIZORITE_GEODE, scizorite_holder,
                new PlacementModifier[]{RarityFilter.onAverageOnceEvery(GeodeCount * GeodeRarity), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)),
                        BiomeFilter.biome()});

        PlacementUtils.register(context, STEELIXITE_GEODE, steelixite_holder,
                new PlacementModifier[]{RarityFilter.onAverageOnceEvery(GeodeCount * GeodeRarity), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)),
                        BiomeFilter.biome()});

        PlacementUtils.register(context, TYRANITARITE_GEODE, tyranitarite_holder,
                new PlacementModifier[]{RarityFilter.onAverageOnceEvery(GeodeCount * GeodeRarity), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)),
                        BiomeFilter.biome()});

        // Gen 3
        // TODO: Add Absolite
        // TODO: Add Aggronite
        // TODO: Add Altarianite

        PlacementUtils.register(context, BANETTITE_GEODE, banettite_holder,
                new PlacementModifier[]{RarityFilter.onAverageOnceEvery(GeodeCount * GeodeRarity), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)),
                        BiomeFilter.biome()});

        // TODO: Add Blazikenite
        // TODO: Add Cameruptite

        PlacementUtils.register(context, GARDEVOIRITE_GEODE, gardevoirite_holder,
                new PlacementModifier[]{RarityFilter.onAverageOnceEvery(GeodeCount * GeodeRarity), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)),
                        BiomeFilter.biome()});

        PlacementUtils.register(context, GLALITITE_GEODE, glalitite_holder,
                new PlacementModifier[]{RarityFilter.onAverageOnceEvery(GeodeCount * GeodeRarity), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)),
                        BiomeFilter.biome()});

        // TODO: Add Latiasite
        // TODO: Add Latiosite

        PlacementUtils.register(context, MAWILITE_GEODE, mawilite_holder,
                new PlacementModifier[]{RarityFilter.onAverageOnceEvery(GeodeCount * GeodeRarity), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)),
                        BiomeFilter.biome()});

        // TODO: Add Manechtite
        // TODO: Add Medichamite
        // TODO: Add Metagrossite
        // TODO: Add Rayquazite

        PlacementUtils.register(context, SABLENITE_GEODE, sablenite_holder,
                new PlacementModifier[]{RarityFilter.onAverageOnceEvery(GeodeCount * GeodeRarity), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)),
                        BiomeFilter.biome()});

        // TODO: Add Salamencite
        // TODO: Add Sceptilite

        PlacementUtils.register(context, SHARPEDONITE_GEODE, sharpedonite_holder,
                new PlacementModifier[]{RarityFilter.onAverageOnceEvery(GeodeCount * GeodeRarity), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)),
                        BiomeFilter.biome()});

        // TODO: Add Swampertite
        // Gen 4
        // TODO: Add Abomasite

        PlacementUtils.register(context, GALLADITE_GEODE, galladite_holder,
                new PlacementModifier[]{RarityFilter.onAverageOnceEvery(GeodeCount * GeodeRarity), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)),
                        BiomeFilter.biome()});

        PlacementUtils.register(context, GARCHOMPITE_GEODE, garchompite_holder,
                new PlacementModifier[]{RarityFilter.onAverageOnceEvery(GeodeCount * GeodeRarity), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)),
                        BiomeFilter.biome()});

        // TODO: Add Lopunnite
        // TODO: Add Lucarionite
        // Gen 5
        // TODO: Add Audinite
        // Gen 6
        // TODO: Add Diancite
        // Gen 7+

    }
}
