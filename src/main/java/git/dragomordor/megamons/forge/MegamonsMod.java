package git.dragomordor.megamons.forge;

import git.dragomordor.megamons.forge.block.MegamonsBlocks;
import git.dragomordor.megamons.forge.config.ModConfig;
import git.dragomordor.megamons.forge.event.ModEvents;
import git.dragomordor.megamons.forge.item.MegamonsItems;
import git.dragomordor.megamons.forge.network.ModNetwork;
import git.dragomordor.megamons.forge.network.ModPacketHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(MegamonsMod.MODID)
public class MegamonsMod{
    public static final Logger LOGGER = LogManager.getLogger(MegamonsMod.class); // create logger
    public static final String MODID = "megamons"; // mod ID
    public static final String MOD_CHANNEL = MODID + ":network";
    public static ModConfig config;

    public MegamonsMod() {

        MinecraftForge.EVENT_BUS.register(this);
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        // Load config
        config = ModConfig.Builder.load();

        // Register all items
        MegamonsItems.register(modEventBus);
        // Register all blocks
        MegamonsBlocks.register(modEventBus);
        // Register creative tabs
        MegamonsItemGroups.register(modEventBus);


        // Register events
        ModEvents.registerEvents();


        // listeners
        modEventBus.addListener(this::commonSetup); //common setup event bus listener
        MinecraftForge.EVENT_BUS.register(this);

        // Load network
        ModPacketHandler.initializeConfig();
        ModNetwork.initialize();
    }


    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }

    // new functions
    private void commonSetup(final FMLCommonSetupEvent event){
    }

}
