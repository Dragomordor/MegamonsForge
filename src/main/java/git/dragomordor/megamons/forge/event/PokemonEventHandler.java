package git.dragomordor.megamons.forge.event;

import com.cobblemon.mod.common.pokemon.Pokemon;
import git.dragomordor.megamons.forge.MegamonsMod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(modid = MegamonsMod.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class PokemonEventHandler {
    @SubscribeEvent
    public static void onPokemonHeldItemChange(PokemonHeldItemChangeEvent event) {
        Pokemon pokemon = event.getPokemon();
        ItemStack previousItem = event.getPreviousItem();
        ItemStack newItem = event.getNewItem();

        // Your logic here
        MegaDevolveEvent.onPokemonHeldItemChange(pokemon, previousItem, newItem);
    }
}

