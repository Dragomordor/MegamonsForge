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
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBiomeModifiers {


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



    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);


        // Geodes
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

    }


    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(MegamonsMod.MODID, name));
    }
}
