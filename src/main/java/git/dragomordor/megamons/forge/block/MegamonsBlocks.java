package git.dragomordor.megamons.forge.block;

import com.cobblemon.mod.common.CobblemonBlocks;
import git.dragomordor.megamons.forge.MegamonsMod;
import git.dragomordor.megamons.forge.item.MegamonsItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class MegamonsBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MegamonsMod.MODID);

    // Register Blocks
    // Megastone ore blocks
        // Crystal Ore - Megastone
    public static final RegistryObject<Block> ORE_CRYSTAL_AERODACTYLITE = registerBlock("aerodactylite_crystal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)
                    .strength(5.5F,3.5F).requiresCorrectToolForDrops(), UniformInt.of(5, 9)));
    public static final RegistryObject<Block> ORE_CRYSTAL_ALAKAZITE = registerBlock("alakazite_crystal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)
                    .strength(5.5F,3.5F).requiresCorrectToolForDrops(), UniformInt.of(5, 9)));
    public static final RegistryObject<Block> ORE_CRYSTAL_BEEDRILLITE = registerBlock("beedrillite_crystal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)
                    .strength(5.5F,3.5F).requiresCorrectToolForDrops(), UniformInt.of(5, 9)));
    public static final RegistryObject<Block> ORE_CRYSTAL_BLASTOISINITE = registerBlock("blastoisinite_crystal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)
                    .strength(5.5F,3.5F).requiresCorrectToolForDrops(), UniformInt.of(5, 9)));
    public static final RegistryObject<Block> ORE_CRYSTAL_CHARIZARDITEX = registerBlock("charizarditex_crystal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)
                    .strength(5.5F,3.5F).requiresCorrectToolForDrops(), UniformInt.of(5, 9)));
    public static final RegistryObject<Block> ORE_CRYSTAL_CHARIZARDITEY = registerBlock("charizarditey_crystal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)
                    .strength(5.5F,3.5F).requiresCorrectToolForDrops(), UniformInt.of(5, 9)));
    public static final RegistryObject<Block> ORE_CRYSTAL_GENGARITE = registerBlock("gengarite_crystal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)
                    .strength(5.5F,3.5F).requiresCorrectToolForDrops(), UniformInt.of(5, 9)));
    public static final RegistryObject<Block> ORE_CRYSTAL_GYARADOSITE = registerBlock("gyaradosite_crystal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)
                    .strength(5.5F,3.5F).requiresCorrectToolForDrops(), UniformInt.of(5, 9)));
    public static final RegistryObject<Block> ORE_CRYSTAL_KANGASKHANITE = registerBlock("kangaskhanite_crystal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)
                    .strength(5.5F,3.5F).requiresCorrectToolForDrops(), UniformInt.of(5, 9)));
    public static final RegistryObject<Block> ORE_CRYSTAL_MEWTWONITEX = registerBlock("mewtwonitex_crystal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)
                    .strength(5.5F,3.5F).requiresCorrectToolForDrops(), UniformInt.of(5, 9)));
    public static final RegistryObject<Block> ORE_CRYSTAL_MEWTWONITEY = registerBlock("mewtwonitey_crystal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)
                    .strength(5.5F,3.5F).requiresCorrectToolForDrops(), UniformInt.of(5, 9)));
    public static final RegistryObject<Block> ORE_CRYSTAL_PIDGEOTITE = registerBlock("pidgeotite_crystal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)
                    .strength(5.5F,3.5F).requiresCorrectToolForDrops(), UniformInt.of(5, 9)));
    public static final RegistryObject<Block> ORE_CRYSTAL_PINSIRITE = registerBlock("pinsirite_crystal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)
                    .strength(5.5F,3.5F).requiresCorrectToolForDrops(), UniformInt.of(5, 9)));
    public static final RegistryObject<Block> ORE_CRYSTAL_SLOWBRONITE = registerBlock("slowbronite_crystal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)
                    .strength(5.5F,3.5F).requiresCorrectToolForDrops(), UniformInt.of(5, 9)));
    public static final RegistryObject<Block> ORE_CRYSTAL_VENUSAURITE = registerBlock("venusaurite_crystal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)
                    .strength(5.5F,3.5F).requiresCorrectToolForDrops(), UniformInt.of(5, 9)));

    // Geode Crystal Evo ores
    public static final RegistryObject<Block> CRYSTAL_DAWN_STONE_ORE = registerBlock("crystal_dawn_stone_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(CobblemonBlocks.DAWN_STONE_ORE)
                    .strength(5.5F,3.5F).requiresCorrectToolForDrops(), UniformInt.of(5, 9)));
    public static final RegistryObject<Block> CRYSTAL_DUSK_STONE_ORE = registerBlock("crystal_dusk_stone_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(CobblemonBlocks.DUSK_STONE_ORE)
                    .strength(5.5F,3.5F).requiresCorrectToolForDrops(), UniformInt.of(5, 9)));
    public static final RegistryObject<Block> CRYSTAL_FIRE_STONE_ORE = registerBlock("crystal_fire_stone_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(CobblemonBlocks.FIRE_STONE_ORE)
                    .strength(5.5F,3.5F).requiresCorrectToolForDrops(), UniformInt.of(5, 9)));
    public static final RegistryObject<Block> CRYSTAL_ICE_STONE_ORE = registerBlock("crystal_ice_stone_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(CobblemonBlocks.ICE_STONE_ORE)
                    .strength(5.5F,3.5F).requiresCorrectToolForDrops(), UniformInt.of(5, 9)));
    public static final RegistryObject<Block> CRYSTAL_LEAF_STONE_ORE = registerBlock("crystal_leaf_stone_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(CobblemonBlocks.LEAF_STONE_ORE)
                    .strength(5.5F,3.5F).requiresCorrectToolForDrops(), UniformInt.of(5, 9)));
    public static final RegistryObject<Block> CRYSTAL_MOON_STONE_ORE = registerBlock("crystal_moon_stone_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(CobblemonBlocks.MOON_STONE_ORE)
                    .strength(5.5F,3.5F).requiresCorrectToolForDrops(), UniformInt.of(5, 9)));
    public static final RegistryObject<Block> CRYSTAL_SHINY_STONE_ORE = registerBlock("crystal_shiny_stone_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(CobblemonBlocks.SHINY_STONE_ORE)
                    .strength(5.5F,3.5F).requiresCorrectToolForDrops(), UniformInt.of(5, 9)));
    public static final RegistryObject<Block> CRYSTAL_SUN_STONE_ORE = registerBlock("crystal_sun_stone_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(CobblemonBlocks.SUN_STONE_ORE)
                    .strength(5.5F,3.5F).requiresCorrectToolForDrops(), UniformInt.of(5, 9)));
    public static final RegistryObject<Block> CRYSTAL_THUNDER_STONE_ORE = registerBlock("crystal_thunder_stone_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(CobblemonBlocks.THUNDER_STONE_ORE)
                    .strength(5.5F,3.5F).requiresCorrectToolForDrops(), UniformInt.of(5, 9)));
    public static final RegistryObject<Block> CRYSTAL_WATER_STONE_ORE = registerBlock("crystal_water_stone_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(CobblemonBlocks.WATER_STONE_ORE)
                    .strength(5.5F,3.5F).requiresCorrectToolForDrops(), UniformInt.of(5, 9)));

    // Megastone Geode Block
        // inner crystal block
    public static final RegistryObject<Block> ANISTARITE_GEODE_BLOCK = registerBlock("anistarite_geode_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).strength(5.5F,3.5F).requiresCorrectToolForDrops()));
    // outer shell block
    public static final RegistryObject<Block> ANISTARITE_ROUGH_GEODE_BLOCK = registerBlock("anistarite_rough_geode_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).strength(6.0F,4.0F).requiresCorrectToolForDrops()));


    // Helper methods for block reigstry
    // registerDefault Block
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    // register Default BlockItem
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return MegamonsItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    // Register all blocks
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        MegamonsMod.LOGGER.info("Registering Mod Blocks for "+ MegamonsMod.MODID);
    }
}
