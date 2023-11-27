package net.prangellplays.horrorsmp.particle;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.prangellplays.horrorsmp.HorrorSMP;

public class HorrorSMPParticles {
    public static final DefaultParticleType BLEED_PARTICLE = FabricParticleTypes.simple();
    public static final DefaultParticleType BURN_PARTICLE = FabricParticleTypes.simple();
    public static final DefaultParticleType CPV2_PARTICLE = FabricParticleTypes.simple();

    public static void registerParticles() {
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(HorrorSMP.MOD_ID, "bleed_particle"),
                BLEED_PARTICLE);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(HorrorSMP.MOD_ID, "burn_particle"),
                BURN_PARTICLE);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(HorrorSMP.MOD_ID, "cpv2_particle"),
                CPV2_PARTICLE);
    }
}
