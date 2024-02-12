package git.dragomordor.megamons.forge;

import git.dragomordor.megamons.forge.block.MegamonsBlocks;
import git.dragomordor.megamons.forge.item.MegamonsItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class MegamonsItemGroups {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MegamonsMod.MODID);

    // TM Group
    public static final RegistryObject<CreativeModeTab> TM_GROUP = CREATIVE_MODE_TABS.register("megamons_itemgroup",
            () -> CreativeModeTab.builder().icon(()->new ItemStack(MegamonsItems.KEY_STONE.get()))
                    .title(Component.translatable("itemgroup."+MegamonsMod.MODID))
                    .displayItems((pParameters, pOutput)-> {

                        // Items
//                        // Metal detector

                        // KeyStoneItem
                        pOutput.accept((MegamonsItems.KEY_STONE.get()));
                        // MegaCuffItem
                        pOutput.accept((MegamonsItems.MEGA_CUFF.get()));
                        // RawMegaStoneItems
                        pOutput.accept((MegamonsItems.RAW_AERODACTYLITE.get()));
                        pOutput.accept((MegamonsItems.RAW_ALAKAZITE.get()));
                        pOutput.accept((MegamonsItems.RAW_BEEDRILLITE.get()));
                        pOutput.accept((MegamonsItems.RAW_BLASTOISINITE.get()));
                        pOutput.accept((MegamonsItems.RAW_CHARIZARDITEX.get()));
                        pOutput.accept((MegamonsItems.RAW_CHARIZARDITEY.get()));
                        pOutput.accept((MegamonsItems.RAW_GENGARITE.get()));
                        pOutput.accept((MegamonsItems.RAW_GYARADOSITE.get()));
                        pOutput.accept((MegamonsItems.RAW_KANGASKHANITE.get()));
                        pOutput.accept((MegamonsItems.RAW_MEWTWONITEX.get()));
                        pOutput.accept((MegamonsItems.RAW_MEWTWONITEY.get()));
                        pOutput.accept((MegamonsItems.RAW_PIDGEOTITE.get()));
                        pOutput.accept((MegamonsItems.RAW_PINSIRITE.get()));
                        pOutput.accept((MegamonsItems.RAW_SLOWBRONITE.get()));
                        pOutput.accept((MegamonsItems.RAW_VENUSAURITE.get()));
                        // CutMegaStoneItems
                        pOutput.accept((MegamonsItems.CUT_AERODACTYLITE.get()));
                        pOutput.accept((MegamonsItems.CUT_ALAKAZITE.get()));
                        pOutput.accept((MegamonsItems.CUT_BEEDRILLITE.get()));
                        pOutput.accept((MegamonsItems.CUT_BLASTOISINITE.get()));
                        pOutput.accept((MegamonsItems.CUT_CHARIZARDITEX.get()));
                        pOutput.accept((MegamonsItems.CUT_CHARIZARDITEY.get()));
                        pOutput.accept((MegamonsItems.CUT_GENGARITE.get()));
                        pOutput.accept((MegamonsItems.CUT_GYARADOSITE.get()));
                        pOutput.accept((MegamonsItems.CUT_KANGASKHANITE.get()));
                        pOutput.accept((MegamonsItems.CUT_MEWTWONITEX.get()));
                        pOutput.accept((MegamonsItems.CUT_MEWTWONITEY.get()));
                        pOutput.accept((MegamonsItems.CUT_PIDGEOTITE.get()));
                        pOutput.accept((MegamonsItems.CUT_PINSIRITE.get()));
                        pOutput.accept((MegamonsItems.CUT_SLOWBRONITE.get()));
                        pOutput.accept((MegamonsItems.CUT_VENUSAURITE.get()));

                        // Blocks
//                        // Stone ore
//                       pOutput.accept((MegamonsBlocks.ORE_AERODACTYLITE.get()));
//                       pOutput.accept((MegamonsBlocks.ORE_ALAKAZITE.get()));
//                       pOutput.accept((MegamonsBlocks.ORE_BEEDRILLITE.get()));
//                       pOutput.accept((MegamonsBlocks.ORE_BLASTOISINITE.get()));
//                       pOutput.accept((MegamonsBlocks.ORE_CHARIZARDITEX.get()));
//                       pOutput.accept((MegamonsBlocks.ORE_CHARIZARDITEY.get()));
//                       pOutput.accept((MegamonsBlocks.ORE_GENGARITE.get()));
//                       pOutput.accept((MegamonsBlocks.ORE_GYARADOSITE.get()));
//                       pOutput.accept((MegamonsBlocks.ORE_KANGASKHANITE.get()));
//                       pOutput.accept((MegamonsBlocks.ORE_MEWTWONITEX.get()));
//                       pOutput.accept((MegamonsBlocks.ORE_MEWTWONITEY.get()));
//                       pOutput.accept((MegamonsBlocks.ORE_PIDGEOTITE.get()));
//                       pOutput.accept((MegamonsBlocks.ORE_PINSIRITE.get()));
//                       pOutput.accept((MegamonsBlocks.ORE_SLOWBRONITE.get()));
//                       pOutput.accept((MegamonsBlocks.ORE_VENUSAURITE.get()));
//                        // Deepslate ore
//                       pOutput.accept((MegamonsBlocks.ORE_DEEPSLATE_AERODACTYLITE.get()));
//                       pOutput.accept((MegamonsBlocks.ORE_DEEPSLATE_ALAKAZITE.get()));
//                       pOutput.accept((MegamonsBlocks.ORE_DEEPSLATE_BEEDRILLITE.get()));
//                       pOutput.accept((MegamonsBlocks.ORE_DEEPSLATE_BLASTOISINITE.get()));
//                       pOutput.accept((MegamonsBlocks.ORE_DEEPSLATE_CHARIZARDITEX.get()));
//                       pOutput.accept((MegamonsBlocks.ORE_DEEPSLATE_CHARIZARDITEY.get()));
//                       pOutput.accept((MegamonsBlocks.ORE_DEEPSLATE_GENGARITE.get()));
//                       pOutput.accept((MegamonsBlocks.ORE_DEEPSLATE_GYARADOSITE.get()));
//                       pOutput.accept((MegamonsBlocks.ORE_DEEPSLATE_KANGASKHANITE.get()));
//                       pOutput.accept((MegamonsBlocks.ORE_DEEPSLATE_MEWTWONITEX.get()));
//                       pOutput.accept((MegamonsBlocks.ORE_DEEPSLATE_MEWTWONITEY.get()));
//                       pOutput.accept((MegamonsBlocks.ORE_DEEPSLATE_PIDGEOTITE.get()));
//                       pOutput.accept((MegamonsBlocks.ORE_DEEPSLATE_PINSIRITE.get()));
//                       pOutput.accept((MegamonsBlocks.ORE_DEEPSLATE_SLOWBRONITE.get()));
//                       pOutput.accept((MegamonsBlocks.ORE_DEEPSLATE_VENUSAURITE.get()));

                        // Crystal blocks
                            // Megastone Geode wall
                        pOutput.accept((MegamonsBlocks.ANISTARITE_GEODE_BLOCK.get()));
                        pOutput.accept((MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK.get()));

                            // Crystal ore
                        pOutput.accept((MegamonsBlocks.ORE_CRYSTAL_AERODACTYLITE.get()));
                        pOutput.accept((MegamonsBlocks.ORE_CRYSTAL_ALAKAZITE.get()));
                        pOutput.accept((MegamonsBlocks.ORE_CRYSTAL_BEEDRILLITE.get()));
                        pOutput.accept((MegamonsBlocks.ORE_CRYSTAL_BLASTOISINITE.get()));
                        pOutput.accept((MegamonsBlocks.ORE_CRYSTAL_CHARIZARDITEX.get()));
                        pOutput.accept((MegamonsBlocks.ORE_CRYSTAL_CHARIZARDITEY.get()));
                        pOutput.accept((MegamonsBlocks.ORE_CRYSTAL_GENGARITE.get()));
                        pOutput.accept((MegamonsBlocks.ORE_CRYSTAL_GYARADOSITE.get()));
                        pOutput.accept((MegamonsBlocks.ORE_CRYSTAL_KANGASKHANITE.get()));
                        pOutput.accept((MegamonsBlocks.ORE_CRYSTAL_MEWTWONITEX.get()));
                        pOutput.accept((MegamonsBlocks.ORE_CRYSTAL_MEWTWONITEY.get()));
                        pOutput.accept((MegamonsBlocks.ORE_CRYSTAL_PIDGEOTITE.get()));
                        pOutput.accept((MegamonsBlocks.ORE_CRYSTAL_PINSIRITE.get()));
                        pOutput.accept((MegamonsBlocks.ORE_CRYSTAL_SLOWBRONITE.get()));
                        pOutput.accept((MegamonsBlocks.ORE_CRYSTAL_VENUSAURITE.get()));

                        // Geode Crystal Evo ores
                        pOutput.accept((MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE.get()));
                        pOutput.accept((MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE.get()));
                        pOutput.accept((MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE.get()));
                        pOutput.accept((MegamonsBlocks.CRYSTAL_ICE_STONE_ORE.get()));
                        pOutput.accept((MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE.get()));
                        pOutput.accept((MegamonsBlocks.CRYSTAL_MOON_STONE_ORE.get()));
                        pOutput.accept((MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE.get()));
                        pOutput.accept((MegamonsBlocks.CRYSTAL_SUN_STONE_ORE.get()));
                        pOutput.accept((MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE.get()));
                        pOutput.accept((MegamonsBlocks.CRYSTAL_WATER_STONE_ORE.get()));



                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }


}
