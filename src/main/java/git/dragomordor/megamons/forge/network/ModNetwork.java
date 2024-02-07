package git.dragomordor.megamons.forge.network;

import git.dragomordor.megamons.forge.MegamonsMod;
import git.dragomordor.megamons.forge.util.OverlayMessage;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;

public class ModNetwork {
    public static final String PROTOCOL_VERSION = "1";
    public static final SimpleChannel CHANNEL = NetworkRegistry.newSimpleChannel(
            new ResourceLocation(MegamonsMod.MODID, "main"),
            () -> PROTOCOL_VERSION,
            PROTOCOL_VERSION::equals,
            PROTOCOL_VERSION::equals
    );


    public static void initialize() {
        // Setup your network channel here
        int messageIndex = 0; // Increment this for each new message
        CHANNEL.registerMessage(messageIndex++,
                OverlayMessage.DisplayOverlayMessagePacket.class,
                OverlayMessage.DisplayOverlayMessagePacket::encode,
                OverlayMessage.DisplayOverlayMessagePacket::decode,
                ModPacketHandler::handleDisplayOverlayMessagePacket);
    }


}