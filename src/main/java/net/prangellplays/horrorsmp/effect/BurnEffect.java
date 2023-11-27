package net.prangellplays.horrorsmp.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class BurnEffect extends StatusEffect {
    protected BurnEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }
    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        this.addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, "7fd4a1f4-61ba-4dba-a569-08fb9be88f94",
                -1, EntityAttributeModifier.Operation.ADDITION);
    }


    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}

