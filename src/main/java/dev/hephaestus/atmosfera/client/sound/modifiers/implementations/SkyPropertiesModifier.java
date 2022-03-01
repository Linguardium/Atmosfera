package dev.hephaestus.atmosfera.client.sound.modifiers.implementations;

import com.google.gson.JsonObject;
import dev.hephaestus.atmosfera.client.sound.modifiers.AtmosphericSoundModifier;
import dev.hephaestus.atmosfera.world.context.EnvironmentContext;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;

public record SkyPropertiesModifier(Identifier skyProperties) implements AtmosphericSoundModifier, AtmosphericSoundModifier.Factory {
    @Override
    public float getModifier(EnvironmentContext context) {
        return 0;
    }

    @Override
    public AtmosphericSoundModifier create(World world) {
        return this;
    }
//    @Override
//    public float getModifier(EnvironmentContext context) {
//        return context.getPlayer().world.getDimension().getSkyProperties().equals(this.skyProperties) ? 1 : 0;
//    }
//
//    @Override
//    public AtmosphericSoundModifier create(World world) {
//        return this;
//    }
//
//    public static Factory create(JsonObject object) {
//        // Valid options here for vanilla are "overworld", "the_nether", and "the_end"
//        return new SkyPropertiesModifier(new Identifier(object.get("id").getAsString()));
//    }
}
