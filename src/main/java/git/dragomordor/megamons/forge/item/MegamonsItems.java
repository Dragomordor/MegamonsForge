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

    // register CutMegaStoneItem
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

    // Register KeyStoneItem
    public static final RegistryObject<Item> KEY_STONE = registerKeyStoneItem("key_stone");

    // Register Mega Cuff Item
    public static final RegistryObject<Item> MEGA_CUFF = registerMegaCuffItem("mega_cuff");

    // Register Metal Detector item





    // Register Functions
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

    // Register metal Detector item




    // Other functions
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
