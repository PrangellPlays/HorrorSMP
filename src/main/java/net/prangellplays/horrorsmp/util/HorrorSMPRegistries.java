package net.prangellplays.horrorsmp.util;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.prangellplays.horrorsmp.registry.HorrorSMPBlocks;

public class HorrorSMPRegistries {
    public static void registerRegistries() {
        registerStrippableBlocks();
    }

    private static void registerStrippableBlocks() {
        StrippableBlockRegistry.register(HorrorSMPBlocks.PLASMYTHIC_LOG, HorrorSMPBlocks.STRIPPED_PLASMYTHIC_LOG);
        StrippableBlockRegistry.register(HorrorSMPBlocks.PLASMYTHIC_WOOD, HorrorSMPBlocks.STRIPPED_PLASMYTHIC_WOOD);
    }
}
