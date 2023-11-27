package net.prangellplays.horrorsmp.mixin.api;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.prangellplays.horrorsmp.events.HorrorSMPEvents;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public class ShieldBlockedMixin {

    private void shieldBlockEvent(DamageSource source, float amount, CallbackInfoReturnable<Boolean> callback) {
        LivingEntity livingEntity = LivingEntity.class.cast(this);

        if (livingEntity instanceof PlayerEntity player) {
            HorrorSMPEvents.SHIELD_BLOCKED.invoker().shieldBlocked(player, source, amount);
        }
    }
}
