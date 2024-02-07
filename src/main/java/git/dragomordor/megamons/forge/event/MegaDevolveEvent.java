package git.dragomordor.megamons.forge.event;

import com.cobblemon.mod.common.CobblemonSounds;
import com.cobblemon.mod.common.api.pokemon.PokemonSpecies;
import com.cobblemon.mod.common.pokemon.Pokemon;
import com.cobblemon.mod.common.pokemon.Species;
import git.dragomordor.megamons.forge.item.list.MegastoneItemList;
import git.dragomordor.megamons.forge.util.OverlayMessage;
import git.dragomordor.megamons.forge.util.megaspecies.HeldMegastoneMegaSpeciesUtil;
import git.dragomordor.megamons.forge.util.megaspecies.MegaSpeciesUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.MinecraftForge;

import static git.dragomordor.megamons.forge.item.custom.MegaCuffItem.isInMegaStoneList;
import static git.dragomordor.megamons.forge.util.megaspecies.MegaSpeciesUtil.getPreSpeciesFromPostSpecies;



import java.util.List;


public class MegaDevolveEvent {

    public static void onPokemonHeldItemChange(Pokemon pokemon, ItemStack previousItemStack, ItemStack newItemStack) {
        System.out.println("Held item changed!");
        System.out.println("Pokemon: " + pokemon.getDisplayName().getString());
        System.out.println("Previous Item: " + previousItemStack);
        System.out.println("New Item: " + newItemStack);
        MegaDevolveEvent.MegaDevolveCheck(pokemon);
    }

    static void MegaDevolveCheck(Pokemon pokemon) {
        Species pokemonSpecies= pokemon.getSpecies();
        String pokemonSpeciesString = pokemonSpecies.getName();
        Player player = pokemon.getOwnerPlayer();

        List<String> megaSpeciesString = MegaSpeciesUtil.getMegaSpecies();
        // pokemon is a mega species
        if (megaSpeciesString.contains(pokemonSpeciesString)) {
            ItemStack HeldItemStack = pokemon.heldItemNoCopy$common();
            Item HeldItemItem = HeldItemStack.getItem();
            // Check if held item is in list of MegaStone Items
            boolean isHeldItemMegaStone = isInMegaStoneList(HeldItemItem, new MegastoneItemList().getMegastonesItemList());
            if (!isHeldItemMegaStone) { // if held item is not megastone, devolve pokemon
                DevolveMegaPokemon(pokemon, player);
            }
            // Held item is a megastone
            // get applicable pokemon species for megastone
            Species applicablePostEvolutionSpecies = HeldMegastoneMegaSpeciesUtil.getApplicablePokemonPostEvolutionSpeciesFromMegastone(HeldItemItem);
            // if return weedle, megastone has no associated Pokémon, devolve Pokémon
            Species weedle = PokemonSpecies.INSTANCE.getByName("weedle");
            if (applicablePostEvolutionSpecies.equals(weedle)) {
                DevolveMegaPokemon(pokemon, player);
            }
            // Megastone has species associated to it
            // check whether Pokémon is correct Post Species for Megastone
            if (!(pokemonSpecies.equals(applicablePostEvolutionSpecies))) {
                // Pokemon is not the correct mega species for mega stone
                DevolveMegaPokemon(pokemon, player);
            }
            // Pokémon is correct species for held megastone -- Nothing occurs
        }
        // Pokémon is not a mega species (nothing happens)
    }

    private static void DevolveMegaPokemon(Pokemon pokemon, Player player) {
        // Get pokemon species
        Species pokemonSpecies= pokemon.getSpecies();
        String pokemonSpeciesString = pokemonSpecies.getName();
        // Get Non mega species from mega species
        String pokemonPreSpeciesString = getPreSpeciesFromPostSpecies(pokemonSpeciesString);
        Species weedle = PokemonSpecies.INSTANCE.getByName("weedle");

        Species pokemonPreSpecies = PokemonSpecies.INSTANCE.getByName(pokemonPreSpeciesString);
        if (!(pokemonPreSpecies.equals(weedle))) {
            // transform Pokémon to PreSpecies
            pokemon.setSpecies(pokemonPreSpecies);
            String capitalizedSpeciesName = pokemonPreSpecies.getName().substring(0, 1).toUpperCase() + pokemonPreSpecies.getName().substring(1);
            if (player!=null) {
                OverlayMessage.displayOverlayMessage(player,capitalizedSpeciesName + " transformed into regular Form - Mega Stone Removed!");
                Level level = player.level();
                BlockPos blockPos = player.blockPosition();
                level.playSound(null,blockPos,CobblemonSounds.EVOLVING, SoundSource.PLAYERS,1f,0.1f);

                //player.playSound(CobblemonSounds.EVOLVING, 1F, 0.1F);
            }
        }
    }



}
