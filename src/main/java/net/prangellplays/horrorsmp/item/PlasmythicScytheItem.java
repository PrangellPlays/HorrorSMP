package net.prangellplays.horrorsmp.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.prangellplays.horrorsmp.effect.HorrorSMPEffects;

public class PlasmythicScytheItem extends SwordItem {
    public PlasmythicScytheItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }
    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.setStatusEffect(new StatusEffectInstance(HorrorSMPEffects.BURN, 100, 0, false, true), target);
        target.setOnFireFor(7);
        return super.postHit(stack, target, attacker);
    }
}
