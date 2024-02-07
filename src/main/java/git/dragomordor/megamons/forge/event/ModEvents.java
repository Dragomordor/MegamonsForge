package git.dragomordor.megamons.forge.event;

import com.cobblemon.mod.common.api.events.CobblemonEvents;
import com.cobblemon.mod.common.api.events.battles.BattleFaintedEvent;
import com.cobblemon.mod.common.api.reactive.EventObservable;
import git.dragomordor.megamons.forge.MegamonsMod;
import net.minecraftforge.common.MinecraftForge;

public class ModEvents {

    public static void registerEvents() {
        // Register events here
        MegamonsMod.LOGGER.info("Registering Mod Events for "+ MegamonsMod.MODID);
    }
}
