package git.dragomordor.megamons.forge.item.custom;

import com.cobblemon.mod.common.Cobblemon;
import com.cobblemon.mod.common.CobblemonSounds;
import com.cobblemon.mod.common.api.pokemon.PokemonSpecies;
import com.cobblemon.mod.common.api.storage.NoPokemonStoreException;
import com.cobblemon.mod.common.api.storage.party.PartyPosition;
import com.cobblemon.mod.common.api.storage.party.PlayerPartyStore;
import com.cobblemon.mod.common.api.storage.pc.PCStore;
import com.cobblemon.mod.common.entity.pokemon.PokemonEntity;
import com.cobblemon.mod.common.pokemon.Pokemon;
import com.cobblemon.mod.common.pokemon.Species;
import git.dragomordor.megamons.forge.config.ModConfig;
import git.dragomordor.megamons.forge.item.list.MegastoneItemList;
import git.dragomordor.megamons.forge.util.OverlayMessage;
import git.dragomordor.megamons.forge.util.megaspecies.HeldMegastoneMegaSpeciesUtil;
import git.dragomordor.megamons.forge.util.megaspecies.MegaSpeciesUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.List;

public class MegaCuffItem extends PokemonUseItem{
    ModConfig config = ModConfig.Builder.load();
    public MegaCuffItem() {
        super(new Item.Properties().stacksTo(1));
    }

    @Override
    public InteractionResult processInteraction(ItemStack itemStack, Player player, PokemonEntity target, Pokemon pokemon) throws NoPokemonStoreException {
        // has no held item
        if (pokemon.heldItemNoCopy$common().isEmpty()) {
            OverlayMessage.displayOverlayMessage(player,"message.megacuffitem.nohelditem");
            return InteractionResult.FAIL;
        }
        // Has held item
        // Get held item info
        ItemStack HeldItemStack = pokemon.heldItemNoCopy$common();
        Item HeldItemItem = HeldItemStack.getItem();

        // Check if held item is in list of MegaStone Items
        boolean isHeldItemMegaStone = isInMegaStoneList(HeldItemItem, new MegastoneItemList().getMegastonesItemList());

        // if held item is not megastone, return fail
        if (!isHeldItemMegaStone) {
            OverlayMessage.displayOverlayMessage(player,"message.megacuffitem.notamegastone");
            return InteractionResult.FAIL;
        }

        // Held item is a megastone!

        // redundant, but makes syntax better
        Item heldMegastone = HeldItemItem;

        // get applicable pokemon species for megastone
        Species applicablePreEvolutionSpecies = HeldMegastoneMegaSpeciesUtil.getApplicablePokemonPreEvolutionSpeciesFromMegastone(heldMegastone);
        Species applicablePostEvolutionSpecies = HeldMegastoneMegaSpeciesUtil.getApplicablePokemonPostEvolutionSpeciesFromMegastone(heldMegastone);

        // if either return weedle, megastone has no associated Pokémon
        Species weedle = PokemonSpecies.INSTANCE.getByName("weedle");
        if ((applicablePreEvolutionSpecies.equals(weedle)) || (applicablePostEvolutionSpecies.equals(weedle))) {
            OverlayMessage.displayOverlayMessage(player,"message.megacuffitem.megastonehasnopokemon");
            return InteractionResult.FAIL;
        }

        // Megastone has species associated to it
        // check whether Pokémon is either pre or post mega species
        if ((pokemon.getSpecies().equals(applicablePreEvolutionSpecies) || pokemon.getSpecies().equals(applicablePostEvolutionSpecies))) {
            // Pokémon is correct species for megastone
            // redundancy for syntax
            Species nonMegaSpecies = applicablePreEvolutionSpecies;
            Species MegaSpecies = applicablePostEvolutionSpecies;

            int numberOfMegaPokemonAllowed = config.numberOfMegaPokemonAllowed;

            if (numberOfMegaPokemonAllowed<=0) {
                OverlayMessage.displayOverlayMessage(player,"message.megacuffitem.nomegasallowed");
                return InteractionResult.FAIL;
            }

            if (pokemon.getSpecies().equals(nonMegaSpecies)) {
                int playerMegaCount = 0;
                // Check if the current Mega Pokémon is in the player's Party
                // Get list of all mega Pokémon
                List<String> MegaPokemonToCheck = MegaSpeciesUtil.getMegaSpecies();

                // Get players Pokémon in party and pc
                PlayerPartyStore pokemonInParty =  Cobblemon.INSTANCE.getStorage().getParty(player.getUUID());
                PCStore pokemonInPc = Cobblemon.INSTANCE.getStorage().getPC(player.getUUID());
                for (int partySlot = 0; partySlot <= 5; partySlot++) {
                    PartyPosition partyPosition = new PartyPosition(partySlot);
                    Pokemon pokemonInSlot = pokemonInParty.get(partyPosition);
                    if (pokemonInSlot!=null) {
                        if (MegaPokemonToCheck.contains(pokemonInSlot.getSpecies().toString())) {
                            // Pokémon in party is a mega Pokémon
                            playerMegaCount++; // increase number of Mega Pokémon detected
                            if (playerMegaCount>=numberOfMegaPokemonAllowed) {
                                OverlayMessage.displayOverlayMessage(player,"message.megacuffitem.maxmegas");
                                return InteractionResult.FAIL;
                            }
                        }
                    }
                }
                // Check if Mega Pokémon is in pc
                for (Pokemon pokemonToCheck: pokemonInPc) {
                    if (pokemonToCheck!=null) {
                        // Check whether any mega Pokémon are in pc
                        if (MegaPokemonToCheck.contains(pokemonToCheck.getSpecies().toString())) {
                            // Mega Pokémon is in pc
                            playerMegaCount++;
                            if (playerMegaCount>=numberOfMegaPokemonAllowed) {
                                OverlayMessage.displayOverlayMessage(player,"message.megacuffitem.maxmegas");
                                return InteractionResult.FAIL;
                            }
                        }
                    }
                }
            }

            // Come this far, you evolve
            if (pokemon.getSpecies().equals(nonMegaSpecies)) {
                evolveToMega(pokemon, nonMegaSpecies, MegaSpecies, player);
                return InteractionResult.SUCCESS;
            }
            if (pokemon.getSpecies().equals(MegaSpecies)) {
                devolveFromMega(pokemon, nonMegaSpecies, MegaSpecies, player);
                return InteractionResult.SUCCESS;
            }

        } else { // Pokémon is wrong species for megastone
            //player.sendMessage(Text.of("Wrong Megastone for "+pokemon.getDisplayName().getString()),true);
            OverlayMessage.displayOverlayMessage(player,"message.megacuffitem.wrongmegastone");
            return InteractionResult.FAIL;
        }

        // How did I even get here?
        OverlayMessage.displayOverlayMessage(player,"Oopsie?");
        System.out.println("How did I get here?");
        return InteractionResult.FAIL;
    }


    // function to check if held item is in list of megastones
    public static boolean isInMegaStoneList(Item heldItem, List<Item> megastoneList) {
        for (Item megastone: megastoneList) {
            if (megastone.equals(heldItem)) {
                return true; // Held item is a mega stone
            }
        }
        return false; // Held item is not a mega stone
    }


    public static void evolveToMega(Pokemon pokemon, Species nonMegaSpecies, Species MegaSpecies, Player player) {
        pokemon.setSpecies(MegaSpecies);
        String capitalizedSpeciesName = nonMegaSpecies.getName().substring(0, 1).toUpperCase() + nonMegaSpecies.getName().substring(1);
        OverlayMessage.displayOverlayMessage(player,Component.translatable("message.megacuffitem.transformtomega",capitalizedSpeciesName).getString());
        Level level = player.level();
        BlockPos blockPos = player.blockPosition();
        level.playSound(null,blockPos,CobblemonSounds.EVOLVING, SoundSource.PLAYERS,1f,1f);
        pokemon.setTradeable(false);
    }

    public static void devolveFromMega(Pokemon pokemon, Species nonMegaSpecies, Species MegaSpecies, Player player) {
        pokemon.setSpecies(nonMegaSpecies);
        String capitalizedSpeciesName = nonMegaSpecies.getName().substring(0, 1).toUpperCase() + nonMegaSpecies.getName().substring(1);
        OverlayMessage.displayOverlayMessage(player,Component.translatable("message.megacuffitem.transformtononmega",capitalizedSpeciesName).getString());
        Level level = player.level();
        BlockPos blockPos = player.blockPosition();
        level.playSound(null,blockPos,CobblemonSounds.EVOLVING, SoundSource.PLAYERS,1f,0.1f);
        pokemon.setTradeable(true);
    }
}
