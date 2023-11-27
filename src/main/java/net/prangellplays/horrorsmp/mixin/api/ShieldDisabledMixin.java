package net.prangellplays.horrorsmp.mixin.api;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.prangellplays.horrorsmp.HorrorSMP;
import net.prangellplays.horrorsmp.events.HorrorSMPEvents;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class ShieldDisabledMixin {

    private void shieldDisabledEvent(LivingEntity attacker, CallbackInfo ci) {
        HorrorSMP.LOGGER.info("Shield disabled!");
        HorrorSMPEvents.SHIELD_DISABLED.invoker().shieldDisabled(PlayerEntity.class.cast(this), attacker);
    }
}
