package git.dragomordor.megamons.forge.util.megaspecies;

import com.cobblemon.mod.common.api.pokemon.PokemonSpecies;
import com.cobblemon.mod.common.pokemon.Species;
import git.dragomordor.megamons.forge.item.MegamonsItems;
import net.minecraft.world.item.Item;

public class HeldMegastoneMegaSpeciesUtil {

    public static Species getApplicablePokemonPreEvolutionSpeciesFromMegastone(Item heldMegastone) {

        // Alakazite
        if (heldMegastone.equals(MegamonsItems.CUT_ALAKAZITE.get())) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.AlakazitePreEvolution);
        }
// Aerodactyl
        if (heldMegastone.equals(MegamonsItems.CUT_AERODACTYLITE.get())) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.AerodactylitePreEvolution);
        }
        // Beedrill
        if (heldMegastone.equals(MegamonsItems.CUT_BEEDRILLITE.get())) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.BeedrillitePreEvolution);
        }
        // Blastois
        if (heldMegastone.equals(MegamonsItems.CUT_BLASTOISINITE.get())) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.BlastoisinitePreEvolution);
        }
        // Charizard X
        if (heldMegastone.equals(MegamonsItems.CUT_CHARIZARDITEX.get())) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.CharizarditeXPreEvolution);
        }
        // Charizard Y
        if (heldMegastone.equals(MegamonsItems.CUT_CHARIZARDITEY.get())) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.CharizarditeYPreEvolution);
        }
        // Gengar
        if (heldMegastone.equals(MegamonsItems.CUT_GENGARITE.get())) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.GengaritePreEvolution);
        }
        // Gyarados
        if (heldMegastone.equals(MegamonsItems.CUT_GYARADOSITE.get())) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.GyaradositePreEvolution);
        }
        // Kangaskhan
        if (heldMegastone.equals(MegamonsItems.CUT_KANGASKHANITE.get())) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.KangaskhanitePreEvolution);
        }
        // Mewtwo X
        if (heldMegastone.equals(MegamonsItems.CUT_MEWTWONITEX.get())) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.MewtwoniteXPreEvolution);
        }
        // Mewtwo Y
        if (heldMegastone.equals(MegamonsItems.CUT_MEWTWONITEY.get())) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.MewtwoniteYPreEvolution);
        }
        // Pidgeot
        if (heldMegastone.equals(MegamonsItems.CUT_PIDGEOTITE.get())) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.PidgeotitePreEvolution);
        }
        // Pinsir
        if (heldMegastone.equals(MegamonsItems.CUT_PINSIRITE.get())) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.PinsiritePreEvolution);
        }
        // Slowbro
        if (heldMegastone.equals(MegamonsItems.CUT_SLOWBRONITE.get())) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.SlowbronitePreEvolution);
        }
        // Venusaur
        if (heldMegastone.equals(MegamonsItems.CUT_VENUSAURITE.get())) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.VenusauritePreEvolution);
        }

        // Default, held item is not in mega stone list (need to return something, not null)
        return PokemonSpecies.INSTANCE.getByName("weedle");
    }

    public static Species getApplicablePokemonPostEvolutionSpeciesFromMegastone(Item heldMegastone) {

        // Alakazite
        if (heldMegastone.equals(MegamonsItems.CUT_ALAKAZITE.get())) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.AlakazitePostEvolution);
        }

        // Aerodactyl
        if (heldMegastone.equals(MegamonsItems.CUT_AERODACTYLITE.get())) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.AerodactylitePostEvolution);
        }
        // Beedrill
        if (heldMegastone.equals(MegamonsItems.CUT_BEEDRILLITE.get())) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.BeedrillitePostEvolution);
        }
        // Blastois
        if (heldMegastone.equals(MegamonsItems.CUT_BLASTOISINITE.get())) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.BlastoisinitePostEvolution);
        }
        // Charizard X
        if (heldMegastone.equals(MegamonsItems.CUT_CHARIZARDITEX.get())) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.CharizarditeXPostEvolution);
        }
        // Charizard Y
        if (heldMegastone.equals(MegamonsItems.CUT_CHARIZARDITEY.get())) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.CharizarditeYPostEvolution);
        }
        // Gengar
        if (heldMegastone.equals(MegamonsItems.CUT_GENGARITE.get())) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.GengaritePostEvolution);
        }
        // Gyarados
        if (heldMegastone.equals(MegamonsItems.CUT_GYARADOSITE.get())) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.GyaradositePostEvolution);
        }
        // Kangaskhan
        if (heldMegastone.equals(MegamonsItems.CUT_KANGASKHANITE.get())) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.KangaskhanitePostEvolution);
        }
        // Mewtwo X
        if (heldMegastone.equals(MegamonsItems.CUT_MEWTWONITEX.get())) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.MewtwoniteXPostEvolution);
        }
        // Mewtwo Y
        if (heldMegastone.equals(MegamonsItems.CUT_MEWTWONITEY.get())) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.MewtwoniteYPostEvolution);
        }
        // Pidgeot
        if (heldMegastone.equals(MegamonsItems.CUT_PIDGEOTITE.get())) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.PidgeotitePostEvolution);
        }
        // Pinsir
        if (heldMegastone.equals(MegamonsItems.CUT_PINSIRITE.get())) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.PinsiritePostEvolution);
        }
        // Slowbro
        if (heldMegastone.equals(MegamonsItems.CUT_SLOWBRONITE.get())) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.SlowbronitePostEvolution);
        }
        // Venusaur
        if (heldMegastone.equals(MegamonsItems.CUT_VENUSAURITE.get())) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.VenusauritePostEvolution);
        }

        // Default, held item is not in mega stone list (need to return something, not null)
        return PokemonSpecies.INSTANCE.getByName("weedle");
    }

}
