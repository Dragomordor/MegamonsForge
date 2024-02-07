package git.dragomordor.megamons.forge.event;

import com.cobblemon.mod.common.pokemon.Pokemon;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.Event;

public class PokemonHeldItemChangeEvent extends Event {
    private final Pokemon pokemon;
    private final ItemStack previousItem;
    private final ItemStack newItem;

    public PokemonHeldItemChangeEvent(Pokemon pokemon, ItemStack previousItem, ItemStack newItem) {
        this.pokemon = pokemon;
        this.previousItem = previousItem;
        this.newItem = newItem;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public ItemStack getPreviousItem() {
        return previousItem;
    }

    public ItemStack getNewItem() {
        return newItem;
    }
}
