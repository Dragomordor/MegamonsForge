package git.dragomordor.megamons.forge.tags;

import git.dragomordor.megamons.forge.MegamonsMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;

public class ModTags {

    public static class Blocks {

        public static final TagKey<Block> ORE_MEGASTONES =
                createTag("ore_megastones");

        public static final TagKey<Block> GEODE_WALLS =
                createTag("geode_walls");

        private static TagKey<Block> createTag(String name) {
            return  TagKey.create(Registries.BLOCK, new ResourceLocation(MegamonsMod.MODID, name));
        }
    }

    public static class Items {

        public static final TagKey<Item> RAW_MEGASTONES =
                createTag("raw_megastones");
        public static final TagKey<Item> CUT_MEGASTONES =
                        createTag("cut_megastones");
        public static final TagKey<Item> ORE_MEGASTONES =
                createTag("ore_megastones");

        // Mega Stones
        public static final TagKey<Item> GEN1_CUT_MEGASTONES =
                createTag("gen1_cut_megastones");
        public static final TagKey<Item> GEN2_CUT_MEGASTONES =
                createTag("gen2_cut_megastones");
        public static final TagKey<Item> GEN3_CUT_MEGASTONES =
                createTag("gen3_cut_megastones");
        public static final TagKey<Item> GEN4_CUT_MEGASTONES =
                createTag("gen4_cut_megastones");
        public static final TagKey<Item> GEN5_CUT_MEGASTONES =
                createTag("gen5_cut_megastones");
        public static final TagKey<Item> GEN6_CUT_MEGASTONES =
                createTag("gen6_cut_megastones");


        private static TagKey<Item> createTag(String name) {
            return  TagKey.create(Registries.ITEM, new ResourceLocation(MegamonsMod.MODID, name));
        }
    }

    public static class Biomes {
        public static final TagKey<Biome> AERODACTYLITE_TAG = createTag("aerodactylite_tag");


        public static final TagKey<Biome> EMPTY = createTag("empty_tag");

        private static TagKey<Biome> createTag(String name) {
            return  TagKey.create(Registries.BIOME, new ResourceLocation(MegamonsMod.MODID, name));
        }
    }

}
