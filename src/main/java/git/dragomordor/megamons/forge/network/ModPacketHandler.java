package git.dragomordor.megamons.forge.network;

import git.dragomordor.megamons.forge.config.ModConfig;
import git.dragomordor.megamons.forge.util.OverlayMessage;
import net.minecraft.client.Minecraft;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class ModPacketHandler {
    public static final ModPacketHandler INSTANCE = new ModPacketHandler();
    private static ModConfig config;

    public static void initializeConfig() {
        config = ModConfig.Builder.load();
    }
    public static void handleDisplayOverlayMessagePacket(OverlayMessage.DisplayOverlayMessagePacket message, Supplier<NetworkEvent.Context> contextSupplier) {
        NetworkEvent.Context context = contextSupplier.get();
        context.enqueueWork(() -> {
            Minecraft.getInstance().player.displayClientMessage(message.getMessage(), true);
        });
        context.setPacketHandled(true);
    }

    public static void encodeDisplayOverlayMessagePacket(OverlayMessage.DisplayOverlayMessagePacket message, FriendlyByteBuf buffer) {
        // Encode your packet data here
        buffer.writeComponent(message.getMessage());
    }

    public static OverlayMessage.DisplayOverlayMessagePacket decodeDisplayOverlayMessagePacket(FriendlyByteBuf buffer) {
        // Decode your packet data here
        return new OverlayMessage.DisplayOverlayMessagePacket(buffer.readComponent());
    }

    public static void register() {
        // Register your packet handlers here
        ModNetwork.CHANNEL.registerMessage(0, OverlayMessage.DisplayOverlayMessagePacket.class,
                ModPacketHandler::encodeDisplayOverlayMessagePacket,
                ModPacketHandler::decodeDisplayOverlayMessagePacket,
                ModPacketHandler::handleDisplayOverlayMessagePacket);
    }

}
