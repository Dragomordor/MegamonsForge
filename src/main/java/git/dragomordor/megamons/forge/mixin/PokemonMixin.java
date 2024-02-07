package git.dragomordor.megamons.forge.mixin;

import com.cobblemon.mod.common.pokemon.Pokemon;
import git.dragomordor.megamons.forge.MegamonsMod;
import git.dragomordor.megamons.forge.event.PokemonHeldItemChangeEvent;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Pokemon.class)
public class PokemonMixin {

    // This method will be called whenever a player swaps a held item
    @Inject(method = "swapHeldItem", at = @At(value = "RETURN"),remap = false)
    private void onSwapHeldItem(ItemStack stack, boolean decrement, CallbackInfoReturnable<ItemStack> info) {
        MegamonsMod.LOGGER.info("Injecting PokemonMixin for mod "+ MegamonsMod.MODID);

        ItemStack newItem = stack;
        ItemStack previousItem = info.getReturnValue();
        Pokemon pokemon = (Pokemon)(Object) this;

        MinecraftForge.EVENT_BUS.post(new PokemonHeldItemChangeEvent(pokemon, previousItem, newItem));
    }
}
