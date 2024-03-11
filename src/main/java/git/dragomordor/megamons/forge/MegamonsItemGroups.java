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

                        // KeyStoneItem
                        pOutput.accept((MegamonsItems.KEY_STONE.get()));
                        // MegaCuffItem
                        pOutput.accept((MegamonsItems.MEGA_CUFF.get()));
                        // RawMegaStoneItems
                            // Gen 1
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
                        // Gen 2
                        pOutput.accept((MegamonsItems.RAW_AMPHAROSITE.get()));
                        // TODO: Add Heracroite
                        // TODO: Add Houndoominite
                        pOutput.accept((MegamonsItems.RAW_SCIZORITE.get()));
                        pOutput.accept((MegamonsItems.RAW_STEELIXITE.get()));
                        pOutput.accept((MegamonsItems.RAW_TYRANITARITE.get()));
                        // Gen 3
                        // TODO: Add Absolite
                        // TODO: Add Aggronite
                        // TODO: Add Altarianite
                        pOutput.accept((MegamonsItems.RAW_BANETTITE.get()));
                        // TODO: Add Blazikenite
                        // TODO: Add Cameruptite
                        pOutput.accept((MegamonsItems.RAW_GARDEVOIRITE.get()));
                        pOutput.accept((MegamonsItems.RAW_GLALITITE.get()));
                        // TODO: Add Latiasite
                        // TODO: Add Latiosite
                        pOutput.accept((MegamonsItems.RAW_MAWILITE.get()));
                        // TODO: Add Manechtite
                        // TODO: Add Medichamite
                        // TODO: Add Metagrossite
                        // TODO: Add Rayquazite
                        pOutput.accept((MegamonsItems.RAW_SABLENITE.get()));
                        // TODO: Add Salamencite
                        // TODO: Add Sceptilite
                        pOutput.accept((MegamonsItems.RAW_SHARPEDONITE.get()));
                        // TODO: Add Swampertite
                        // Gen 4
                        // TODO: Add Abomasite
                        pOutput.accept((MegamonsItems.RAW_GALLADITE.get()));
                        pOutput.accept((MegamonsItems.RAW_GARCHOMPITE.get()));
                        // TODO: Add Lopunnite
                        // TODO: Add Lucarionite
                        // Gen 5
                        // TODO: Add Audinite
                        // Gen 6
                        // TODO: Add Diancite
                        // Gen 7+


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
                        // Gen 2
                        pOutput.accept((MegamonsItems.CUT_AMPHAROSITE.get()));
                        // TODO: Add Heracroite
                        // TODO: Add Houndoominite
                        pOutput.accept((MegamonsItems.CUT_SCIZORITE.get()));
                        pOutput.accept((MegamonsItems.CUT_STEELIXITE.get()));
                        pOutput.accept((MegamonsItems.CUT_TYRANITARITE.get()));
                        // Gen 3
                        // TODO: Add Absolite
                        // TODO: Add Aggronite
                        // TODO: Add Altarianite
                        pOutput.accept((MegamonsItems.CUT_BANETTITE.get()));
                        // TODO: Add Blazikenite
                        // TODO: Add Cameruptite
                        pOutput.accept((MegamonsItems.CUT_GARDEVOIRITE.get()));
                        pOutput.accept((MegamonsItems.CUT_GLALITITE.get()));
                        // TODO: Add Latiasite
                        // TODO: Add Latiosite
                        pOutput.accept((MegamonsItems.CUT_MAWILITE.get()));
                        // TODO: Add Manechtite
                        // TODO: Add Medichamite
                        // TODO: Add Metagrossite
                        // TODO: Add Rayquazite
                        pOutput.accept((MegamonsItems.CUT_SABLENITE.get()));
                        // TODO: Add Salamencite
                        // TODO: Add Sceptilite
                        pOutput.accept((MegamonsItems.CUT_SHARPEDONITE.get()));
                        // TODO: Add Swampertite
                        // Gen 4
                        // TODO: Add Abomasite
                        pOutput.accept((MegamonsItems.CUT_GALLADITE.get()));
                        pOutput.accept((MegamonsItems.CUT_GARCHOMPITE.get()));
                        // TODO: Add Lopunnite
                        // TODO: Add Lucarionite
                        // Gen 5
                        // TODO: Add Audinite
                        // Gen 6
                        // TODO: Add Diancite
                        // Gen 7+



                    // Blocks
                        // Crystal blocks
                            // Megastone Geode wall
                        pOutput.accept((MegamonsBlocks.ANISTARITE_GEODE_BLOCK.get()));
                        pOutput.accept((MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK.get()));

                        // Crystal ore
                            // Gen 1
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
                        // Gen 2
                        pOutput.accept((MegamonsBlocks.ORE_CRYSTAL_AMPHAROSITE.get()));
                        // TODO: Add Heracroite
                        // TODO: Add Houndoominite
                        pOutput.accept((MegamonsBlocks.ORE_CRYSTAL_SCIZORITE.get()));
                        pOutput.accept((MegamonsBlocks.ORE_CRYSTAL_STEELIXITE.get()));
                        pOutput.accept((MegamonsBlocks.ORE_CRYSTAL_TYRANITARITE.get()));
                        // Gen 3
                        // TODO: Add Absolite
                        // TODO: Add Aggronite
                        // TODO: Add Altarianite
                        pOutput.accept((MegamonsBlocks.ORE_CRYSTAL_BANETTITE.get()));
                        // TODO: Add Blazikenite
                        // TODO: Add Cameruptite
                        pOutput.accept((MegamonsBlocks.ORE_CRYSTAL_GARDEVOIRITE.get()));
                        pOutput.accept((MegamonsBlocks.ORE_CRYSTAL_GLALITITE.get()));
                        // TODO: Add Latiasite
                        // TODO: Add Latiosite
                        pOutput.accept((MegamonsBlocks.ORE_CRYSTAL_MAWILITE.get()));
                        // TODO: Add Manechtite
                        // TODO: Add Medichamite
                        // TODO: Add Metagrossite
                        // TODO: Add Rayquazite
                        pOutput.accept((MegamonsBlocks.ORE_CRYSTAL_SABLENITE.get()));
                        // TODO: Add Salamencite
                        // TODO: Add Sceptilite
                        pOutput.accept((MegamonsBlocks.ORE_CRYSTAL_SHARPEDONITE.get()));
                        // TODO: Add Swampertite
                        // Gen 4
                        // TODO: Add Abomasite
                        pOutput.accept((MegamonsBlocks.ORE_CRYSTAL_GALLADITE.get()));
                        pOutput.accept((MegamonsBlocks.ORE_CRYSTAL_GARCHOMPITE.get()));
                        // TODO: Add Lopunnite
                        // TODO: Add Lucarionite
                        // Gen 5
                        // TODO: Add Audinite
                        // Gen 6
                        // TODO: Add Diancite
                        // Gen 7+



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
