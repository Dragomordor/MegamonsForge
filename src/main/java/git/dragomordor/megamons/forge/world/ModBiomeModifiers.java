package git.dragomordor.megamons.forge.world;

import git.dragomordor.megamons.forge.MegamonsMod;
import git.dragomordor.megamons.forge.tags.ModTags;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBiomeModifiers {

    // Gen 1
    public static final ResourceKey<BiomeModifier> ADD_AERODACTYLITE_GEODE = registerKey("add_aerodactylite_geode");
    public static final ResourceKey<BiomeModifier> ADD_ALAKAZITE_GEODE = registerKey("add_alakazite_geode");
    public static final ResourceKey<BiomeModifier> ADD_BEEDRILLITE_GEODE = registerKey("add_beedrillite_geode");
    public static final ResourceKey<BiomeModifier> ADD_BLASTOISINITE_GEODE = registerKey("add_blastoisinite_geode");
    public static final ResourceKey<BiomeModifier> ADD_CHARIZARDITEX_GEODE = registerKey("add_charizarditex_geode");
    public static final ResourceKey<BiomeModifier> ADD_CHARIZARDITEY_GEODE = registerKey("add_charizarditey_geode");
    public static final ResourceKey<BiomeModifier> ADD_GENGARITE_GEODE = registerKey("add_gengarite_geode");
    public static final ResourceKey<BiomeModifier> ADD_GYARADOSITE_GEODE = registerKey("add_gyaradosite_geode");
    public static final ResourceKey<BiomeModifier> ADD_KANGASKHANITE_GEODE = registerKey("add_kangaskhanite_geode");
    public static final ResourceKey<BiomeModifier> ADD_MEWTWONITEX_GEODE = registerKey("add_mewtwonitex_geode");
    public static final ResourceKey<BiomeModifier> ADD_MEWTWONITEY_GEODE = registerKey("add_mewtwonitey_geode");
    public static final ResourceKey<BiomeModifier> ADD_PIDGEOTITE_GEODE = registerKey("add_pidgeotite_geode");
    public static final ResourceKey<BiomeModifier> ADD_PINSIRITE_GEODE = registerKey("add_pinsirite_geode");
    public static final ResourceKey<BiomeModifier> ADD_SLOWBRONITE_GEODE = registerKey("add_slowbronite_geode");
    public static final ResourceKey<BiomeModifier> ADD_VENUSAURITE_GEODE = registerKey("add_venusaurite_geode");
    // Gen 2
    public static final ResourceKey<BiomeModifier> ADD_AMPHAROSITE_GEODE = registerKey("add_ampharosite_geode");
    // TODO: Add Heracronite
    // TODO: Add Houndoominite
    public static final ResourceKey<BiomeModifier> ADD_SCIZORITE_GEODE = registerKey("add_scizorite_geode");
    public static final ResourceKey<BiomeModifier> ADD_STEELIXITE_GEODE = registerKey("add_steelixite_geode");
    public static final ResourceKey<BiomeModifier> ADD_TYRANITARITE_GEODE = registerKey("add_tyranitarite_geode");
    // Gen 3
    // TODO: Add Absolite
    // TODO: Add Aggronite
    // TODO: Add Altarianite
    public static final ResourceKey<BiomeModifier> ADD_BANETTITE_GEODE = registerKey("add_banettite_geode");
    // TODO: Add Blazikenite
    // TODO: Add Cameruptite
    public static final ResourceKey<BiomeModifier> ADD_GARDEVOIRITE_GEODE = registerKey("add_gardevoirite_geode");
    public static final ResourceKey<BiomeModifier> ADD_GLALITITE_GEODE = registerKey("add_glalitite_geode");
    // TODO: Add Latiasite
    // TODO: Add Latiosite
    public static final ResourceKey<BiomeModifier> ADD_MAWILITE_GEODE = registerKey("add_mawilite_geode");
    // TODO: Add Manechtite
    // TODO: Add Medichamite
    // TODO: Add Metagrossite
    // TODO: Add Rayquazite
    public static final ResourceKey<BiomeModifier> ADD_SABLENITE_GEODE = registerKey("add_sablenite_geode");
    // TODO: Add Salamencite
    // TODO: Add Sceptilite
    public static final ResourceKey<BiomeModifier> ADD_SHARPEDONITE_GEODE = registerKey("add_sharpedonite_geode");
    // TODO: Add Swampertite
    // Gen 4
    // TODO: Add Abomasite
    public static final ResourceKey<BiomeModifier> ADD_GALLADITE_GEODE = registerKey("add_galladite_geode");
    public static final ResourceKey<BiomeModifier> ADD_GARCHOMPITE_GEODE = registerKey("add_garchompite_geode");
    // TODO: Add Lopunnite
    // TODO: Add Lucarionite
    // Gen 5
    // TODO: Add Audinite
    // Gen 6
    // TODO: Add Diancite
    // Gen 7+


    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);


        // Geodes
        // Gen 1
        context.register(ADD_AERODACTYLITE_GEODE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.AERODACTYLITE_GEODE)),
                GenerationStep.Decoration.LOCAL_MODIFICATIONS));

        context.register(ADD_ALAKAZITE_GEODE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.ALAKAZITE_GEODE)),
                GenerationStep.Decoration.LOCAL_MODIFICATIONS));

        context.register(ADD_BEEDRILLITE_GEODE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.BEEDRILLITE_GEODE)),
                GenerationStep.Decoration.LOCAL_MODIFICATIONS));

        context.register(ADD_BLASTOISINITE_GEODE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.BLASTOISINITE_GEODE)),
                GenerationStep.Decoration.LOCAL_MODIFICATIONS));

        context.register(ADD_CHARIZARDITEX_GEODE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.CHARIZARDITEX_GEODE)),
                GenerationStep.Decoration.LOCAL_MODIFICATIONS));

        context.register(ADD_CHARIZARDITEY_GEODE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.CHARIZARDITEY_GEODE)),
                GenerationStep.Decoration.LOCAL_MODIFICATIONS));

        context.register(ADD_GENGARITE_GEODE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.GENGARITE_GEODE)),
                GenerationStep.Decoration.LOCAL_MODIFICATIONS));

        context.register(ADD_GYARADOSITE_GEODE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.GYARADOSITE_GEODE)),
                GenerationStep.Decoration.LOCAL_MODIFICATIONS));

        context.register(ADD_KANGASKHANITE_GEODE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.KANGASKHANITE_GEODE)),
                GenerationStep.Decoration.LOCAL_MODIFICATIONS));

        context.register(ADD_MEWTWONITEX_GEODE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.EMPTY),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.MEWTWONITEX_GEODE)),
                GenerationStep.Decoration.LOCAL_MODIFICATIONS));

        context.register(ADD_MEWTWONITEY_GEODE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.EMPTY),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.MEWTWONITEY_GEODE)),
                GenerationStep.Decoration.LOCAL_MODIFICATIONS));

        context.register(ADD_PIDGEOTITE_GEODE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.PIDGEOTITE_GEODE)),
                GenerationStep.Decoration.LOCAL_MODIFICATIONS));

        context.register(ADD_PINSIRITE_GEODE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.PINSIRITE_GEODE)),
                GenerationStep.Decoration.LOCAL_MODIFICATIONS));

        context.register(ADD_SLOWBRONITE_GEODE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.SLOWBRONITE_GEODE)),
                GenerationStep.Decoration.LOCAL_MODIFICATIONS));

        context.register(ADD_VENUSAURITE_GEODE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.VENUSAURITE_GEODE)),
                GenerationStep.Decoration.LOCAL_MODIFICATIONS));

        // Gen 2
        context.register(ADD_AMPHAROSITE_GEODE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.EMPTY),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.AMPHAROSITE_GEODE)),
                GenerationStep.Decoration.LOCAL_MODIFICATIONS));

        // TODO: Add Heracronite
        // TODO: Add Houndoominite

        context.register(ADD_SCIZORITE_GEODE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.EMPTY),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.SCIZORITE_GEODE)),
                GenerationStep.Decoration.LOCAL_MODIFICATIONS));

        context.register(ADD_STEELIXITE_GEODE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.EMPTY),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.STEELIXITE_GEODE)),
                GenerationStep.Decoration.LOCAL_MODIFICATIONS));

        context.register(ADD_TYRANITARITE_GEODE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.EMPTY),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.TYRANITARITE_GEODE)),
                GenerationStep.Decoration.LOCAL_MODIFICATIONS));

        // Gen 3
        // TODO: Add Absolite
        // TODO: Add Aggronite
        // TODO: Add Altarianite

        context.register(ADD_BANETTITE_GEODE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.EMPTY),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.BANETTITE_GEODE)),
                GenerationStep.Decoration.LOCAL_MODIFICATIONS));

        // TODO: Add Blazikenite
        // TODO: Add Cameruptite

        context.register(ADD_GARDEVOIRITE_GEODE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.EMPTY),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.GARDEVOIRITE_GEODE)),
                GenerationStep.Decoration.LOCAL_MODIFICATIONS));

        context.register(ADD_GLALITITE_GEODE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.EMPTY),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.GLALITITE_GEODE)),
                GenerationStep.Decoration.LOCAL_MODIFICATIONS));

        // TODO: Add Latiasite
        // TODO: Add Latiosite

        context.register(ADD_MAWILITE_GEODE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.EMPTY),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.MAWILITE_GEODE)),
                GenerationStep.Decoration.LOCAL_MODIFICATIONS));

        // TODO: Add Manechtite
        // TODO: Add Medichamite
        // TODO: Add Metagrossite
        // TODO: Add Rayquazite

        context.register(ADD_SABLENITE_GEODE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.EMPTY),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.SABLENITE_GEODE)),
                GenerationStep.Decoration.LOCAL_MODIFICATIONS));

        // TODO: Add Salamencite
        // TODO: Add Sceptilite

        context.register(ADD_SHARPEDONITE_GEODE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.EMPTY),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.SHARPEDONITE_GEODE)),
                GenerationStep.Decoration.LOCAL_MODIFICATIONS));

        // TODO: Add Swampertite
        // Gen 4
        // TODO: Add Abomasite

        context.register(ADD_GALLADITE_GEODE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.EMPTY),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.GALLADITE_GEODE)),
                GenerationStep.Decoration.LOCAL_MODIFICATIONS));

        context.register(ADD_GARCHOMPITE_GEODE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModTags.Biomes.EMPTY),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.GARCHOMPITE_GEODE)),
                GenerationStep.Decoration.LOCAL_MODIFICATIONS));

        // TODO: Add Lopunnite
        // TODO: Add Lucarionite
        // Gen 5
        // TODO: Add Audinite
        // Gen 6
        // TODO: Add Diancite
        // Gen 7+


    }


    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(MegamonsMod.MODID, name));
    }
}
