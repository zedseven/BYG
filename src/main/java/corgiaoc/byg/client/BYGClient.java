package corgiaoc.byg.client;

import corgiaoc.byg.client.textures.BlockColorManager;
import corgiaoc.byg.client.textures.renders.BYGCutoutRenders;
import corgiaoc.byg.common.entity.boat.BYGBoatRenderer;
import corgiaoc.byg.common.network.CustomEntitySpawnS2CPacket;
import corgiaoc.byg.core.BYGEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;

@Environment(EnvType.CLIENT)
public class BYGClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BYGCutoutRenders.renderCutOuts();
        BlockColorManager.onBlockColorsInit();
        BlockColorManager.onItemColorsInit();
        ClientPlayNetworking.registerGlobalReceiver(CustomEntitySpawnS2CPacket.SPAWN_PACKET_ID, CustomEntitySpawnS2CPacket::receiveSpawnPacket);
        EntityRendererRegistry.INSTANCE.register(BYGEntities.BOAT, BYGBoatRenderer::new);
    }
}