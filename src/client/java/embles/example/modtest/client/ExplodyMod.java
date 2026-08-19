package embles.example.modtest.client;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;

public class ExplodyMod implements ModInitializer {
    @Override
    public void onInitialize() {
        ServerTickEvents.START_LEVEL_TICK.register( (ServerLevel level) -> {
                
            level.explode(
                null,
                20.0,100,0.0,
                20.0F, Level.ExplosionInteraction.TNT
            );
            level.explode
        } );
    }
}
