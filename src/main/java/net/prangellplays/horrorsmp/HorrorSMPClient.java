package net.prangellplays.horrorsmp;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.DyeableItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.world.World;
import net.prangellplays.horrorsmp.particle.BleedParticle;
import net.prangellplays.horrorsmp.particle.HorrorSMPParticles;
import net.prangellplays.horrorsmp.registry.HorrorSMPBlocks;

public class HorrorSMPClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(HorrorSMPBlocks.PLASMYTHIC_LEAVES, RenderLayer.getCutout());

        ParticleFactoryRegistry.getInstance().register(HorrorSMPParticles.BLEED_PARTICLE, BleedParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(HorrorSMPParticles.BURN_PARTICLE, BleedParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(HorrorSMPParticles.CPV2_PARTICLE, BleedParticle.Factory::new);
    }

    public int getColorOr(ItemStack stack, int base) {
        NbtCompound nbtCompound = stack.getSubNbt(DyeableItem.DISPLAY_KEY);
        if (nbtCompound != null && nbtCompound.contains(DyeableItem.COLOR_KEY, NbtElement.NUMBER_TYPE)) {
            return nbtCompound.getInt(DyeableItem.COLOR_KEY);
        }
        return base;
    }
    private static float blockingPredicate(ItemStack stack, World level, LivingEntity user, int i) {
        return user != null && user.getActiveItem() == stack ? 1.0f : 0.0f;
    }
}
