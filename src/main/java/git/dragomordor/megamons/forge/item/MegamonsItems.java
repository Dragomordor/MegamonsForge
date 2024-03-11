package git.dragomordor.megamons.forge.item;


import git.dragomordor.megamons.forge.MegamonsMod;
import git.dragomordor.megamons.forge.item.custom.CutMegaStoneItem;
import git.dragomordor.megamons.forge.item.custom.KeyStoneItem;
import git.dragomordor.megamons.forge.item.custom.MegaCuffItem;
import git.dragomordor.megamons.forge.item.custom.RawMegaStoneItem;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MegamonsItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MegamonsMod.MODID);

    // event bus
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
        MegamonsMod.LOGGER.info("Registering Mod Items for "+ MegamonsMod.MODID);
    }

    // Register Items

    // register RawMegaStoneItem
        // Gen 1
    public static final RegistryObject<Item> RAW_AERODACTYLITE = registerRawMegaStoneItem("raw_aerodactylite");
    public static final RegistryObject<Item> RAW_ALAKAZITE = registerRawMegaStoneItem("raw_alakazite");
    public static final RegistryObject<Item> RAW_BEEDRILLITE = registerRawMegaStoneItem("raw_beedrillite");
    public static final RegistryObject<Item> RAW_BLASTOISINITE = registerRawMegaStoneItem("raw_blastoisinite");
    public static final RegistryObject<Item> RAW_CHARIZARDITEX = registerRawMegaStoneItem("raw_charizarditex");
    public static final RegistryObject<Item> RAW_CHARIZARDITEY = registerRawMegaStoneItem("raw_charizarditey");
    public static final RegistryObject<Item> RAW_GENGARITE = registerRawMegaStoneItem("raw_gengarite");
    public static final RegistryObject<Item> RAW_GYARADOSITE = registerRawMegaStoneItem("raw_gyaradosite");
    public static final RegistryObject<Item> RAW_KANGASKHANITE = registerRawMegaStoneItem("raw_kangaskhanite");
    public static final RegistryObject<Item> RAW_MEWTWONITEX = registerRawMegaStoneItem("raw_mewtwonitex");
    public static final RegistryObject<Item> RAW_MEWTWONITEY = registerRawMegaStoneItem("raw_mewtwonitey");
    public static final RegistryObject<Item> RAW_PIDGEOTITE = registerRawMegaStoneItem("raw_pidgeotite");
    public static final RegistryObject<Item> RAW_PINSIRITE = registerRawMegaStoneItem("raw_pinsirite");
    public static final RegistryObject<Item> RAW_SLOWBRONITE = registerRawMegaStoneItem("raw_slowbronite");
    public static final RegistryObject<Item> RAW_VENUSAURITE = registerRawMegaStoneItem("raw_venusaurite");
    // Gen 2
    public static final RegistryObject<Item> RAW_AMPHAROSITE = registerRawMegaStoneItem("raw_ampharosite");
    // TODO: Add Heracroite
    // TODO: Add Houndoominite
    public static final RegistryObject<Item> RAW_SCIZORITE = registerRawMegaStoneItem("raw_scizorite");
    public static final RegistryObject<Item> RAW_STEELIXITE = registerRawMegaStoneItem("raw_steelixite");
    public static final RegistryObject<Item> RAW_TYRANITARITE = registerRawMegaStoneItem("raw_tyranitarite");
    // Gen 3
    // TODO: Add Absolite
    // TODO: Add Aggronite
    // TODO: Add Altarianite
    public static final RegistryObject<Item> RAW_BANETTITE = registerRawMegaStoneItem("raw_banettite");
    // TODO: Add Blazikenite
    // TODO: Add Cameruptite
    public static final RegistryObject<Item> RAW_GARDEVOIRITE = registerRawMegaStoneItem("raw_gardevoirite");
    public static final RegistryObject<Item> RAW_GLALITITE = registerRawMegaStoneItem("raw_glalitite");
    // TODO: Add Latiasite
    // TODO: Add Latiosite
    public static final RegistryObject<Item> RAW_MAWILITE = registerRawMegaStoneItem("raw_mawilite");
    // TODO: Add Manechtite
    // TODO: Add Medichamite
    // TODO: Add Metagrossite
    // TODO: Add Rayquazite
    public static final RegistryObject<Item> RAW_SABLENITE = registerRawMegaStoneItem("raw_sablenite");
    // TODO: Add Salamencite
    // TODO: Add Sceptilite
    public static final RegistryObject<Item> RAW_SHARPEDONITE = registerRawMegaStoneItem("raw_sharpedonite");
    // TODO: Add Swampertite
    // Gen 4
    // TODO: Add Abomasite
    public static final RegistryObject<Item> RAW_GALLADITE = registerRawMegaStoneItem("raw_galladite");
    public static final RegistryObject<Item> RAW_GARCHOMPITE = registerRawMegaStoneItem("raw_garchompite");
    // TODO: Add Lopunnite
    // TODO: Add Lucarionite
    // Gen 5
    // TODO: Add Audinite
    // Gen 6
    // TODO: Add Diancite
    // Gen 7+


    // register CutMegaStoneItem
        // Gen 1
    public static final RegistryObject<Item> CUT_AERODACTYLITE = registerCutMegaStoneItem("cut_aerodactylite");
    public static final RegistryObject<Item> CUT_ALAKAZITE = registerCutMegaStoneItem("cut_alakazite");
    public static final RegistryObject<Item> CUT_BEEDRILLITE = registerCutMegaStoneItem("cut_beedrillite");
    public static final RegistryObject<Item> CUT_BLASTOISINITE = registerCutMegaStoneItem("cut_blastoisinite");
    public static final RegistryObject<Item> CUT_CHARIZARDITEX = registerCutMegaStoneItem("cut_charizarditex");
    public static final RegistryObject<Item> CUT_CHARIZARDITEY = registerCutMegaStoneItem("cut_charizarditey");
    public static final RegistryObject<Item> CUT_GENGARITE = registerCutMegaStoneItem("cut_gengarite");
    public static final RegistryObject<Item> CUT_GYARADOSITE = registerCutMegaStoneItem("cut_gyaradosite");
    public static final RegistryObject<Item> CUT_KANGASKHANITE = registerCutMegaStoneItem("cut_kangaskhanite");
    public static final RegistryObject<Item> CUT_MEWTWONITEX = registerCutMegaStoneItem("cut_mewtwonitex");
    public static final RegistryObject<Item> CUT_MEWTWONITEY = registerCutMegaStoneItem("cut_mewtwonitey");
    public static final RegistryObject<Item> CUT_PIDGEOTITE = registerCutMegaStoneItem("cut_pidgeotite");
    public static final RegistryObject<Item> CUT_PINSIRITE = registerCutMegaStoneItem("cut_pinsirite");
    public static final RegistryObject<Item> CUT_SLOWBRONITE = registerCutMegaStoneItem("cut_slowbronite");
    public static final RegistryObject<Item> CUT_VENUSAURITE = registerCutMegaStoneItem("cut_venusaurite");
    // Gen 2
    public static final RegistryObject<Item> CUT_AMPHAROSITE = registerCutMegaStoneItem("cut_ampharosite");
    // TODO: Add Heracroite
    // TODO: Add Houndoominite
    public static final RegistryObject<Item> CUT_SCIZORITE = registerCutMegaStoneItem("cut_scizorite");
    public static final RegistryObject<Item> CUT_STEELIXITE = registerCutMegaStoneItem("cut_steelixite");
    public static final RegistryObject<Item> CUT_TYRANITARITE = registerCutMegaStoneItem("cut_tyranitarite");
    // Gen 3
    // TODO: Add Absolite
    // TODO: Add Aggronite
    // TODO: Add Altarianite
    public static final RegistryObject<Item> CUT_BANETTITE = registerCutMegaStoneItem("cut_banettite");
    // TODO: Add Blazikenite
    // TODO: Add Cameruptite
    public static final RegistryObject<Item> CUT_GARDEVOIRITE = registerCutMegaStoneItem("cut_gardevoirite");
    public static final RegistryObject<Item> CUT_GLALITITE = registerCutMegaStoneItem("cut_glalitite");
    // TODO: Add Latiasite
    // TODO: Add Latiosite
    public static final RegistryObject<Item> CUT_MAWILITE = registerCutMegaStoneItem("cut_mawilite");
    // TODO: Add Manechtite
    // TODO: Add Medichamite
    // TODO: Add Metagrossite
    // TODO: Add Rayquazite
    public static final RegistryObject<Item> CUT_SABLENITE = registerCutMegaStoneItem("cut_sablenite");
    // TODO: Add Salamencite
    // TODO: Add Sceptilite
    public static final RegistryObject<Item> CUT_SHARPEDONITE = registerCutMegaStoneItem("cut_sharpedonite");
    // TODO: Add Swampertite
    // Gen 4
    // TODO: Add Abomasite
    // TODO: Add Galladite
    public static final RegistryObject<Item> CUT_GALLADITE = registerCutMegaStoneItem("cut_galladite");
    public static final RegistryObject<Item> CUT_GARCHOMPITE = registerCutMegaStoneItem("cut_garchompite");
    // TODO: Add Lopunnite
    // TODO: Add Lucarionite
    // Gen 5
    // TODO: Add Audinite
    // Gen 6
    // TODO: Add Diancite
    // Gen 7+


    // Register KeyStoneItem
    public static final RegistryObject<Item> KEY_STONE = registerKeyStoneItem("key_stone");

    // Register Mega Cuff Item
    public static final RegistryObject<Item> MEGA_CUFF = registerMegaCuffItem("mega_cuff");


// Helper method to register items

    // register RawMegaStoneItem
    private static RegistryObject<Item> registerRawMegaStoneItem(String name) {
        return ITEMS.register(name, () -> new RawMegaStoneItem());
    }
    // register CutMegaStoneItem
    private static RegistryObject<Item> registerCutMegaStoneItem(String name) {
        return ITEMS.register(name, () -> new CutMegaStoneItem());
    }

    // register KeyStoneItem
    private static RegistryObject<Item> registerKeyStoneItem(String name) {
        return ITEMS.register(name, () -> new KeyStoneItem());
    }

    // Register Mega cuff
    private static RegistryObject<Item> registerMegaCuffItem(String name) {
        return ITEMS.register(name, () -> new MegaCuffItem());
    }




// Other Helper functions
    // get item by name
    public static Item getItemByName(String name) {
        ResourceLocation resourceLocation  = new ResourceLocation(MegamonsMod.MODID,name);
        Item item = ForgeRegistries.ITEMS.getValue(resourceLocation);
        return item;
    }

    public static ItemStack getItemStackByName(String name) {
        Item item = getItemByName(name);
        if (item!=null) {
            return new ItemStack(item,1);
        } else {
            return ItemStack.EMPTY;
        }
    }

}
