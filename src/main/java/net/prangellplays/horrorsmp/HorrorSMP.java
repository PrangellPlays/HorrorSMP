package net.prangellplays.horrorsmp;

import net.fabricmc.api.ModInitializer;

import net.prangellplays.horrorsmp.callbacks.HorrorSMPCallbacks;
import net.prangellplays.horrorsmp.effect.HorrorSMPEffects;
import net.prangellplays.horrorsmp.particle.HorrorSMPParticles;
import net.prangellplays.horrorsmp.registry.HorrorSMPBlocks;
import net.prangellplays.horrorsmp.registry.HorrorSMPItems;
import net.prangellplays.horrorsmp.util.HorrorSMPRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.minecraft.util.Identifier;

public class HorrorSMP implements ModInitializer {
	public static final String MOD_ID = "horrorsmp";
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	@Override
	public void onInitialize() {

		HorrorSMPItems.registerHorrorSMPItems();
		HorrorSMPBlocks.registerHorrorSMPBlocks();
		HorrorSMPCallbacks.registerCallbacks();
		HorrorSMPEffects.registerEffects();
		HorrorSMPRegistries.registerRegistries();
		HorrorSMPParticles.registerParticles();
	}

	public static Identifier id(String path) {
		return new Identifier(MOD_ID, path);
	}
}