package net.prangellplays.horrorsmp.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.prangellplays.horrorsmp.effect.HorrorSMPEffects;

public class ThermostaticSteelScytheItem extends SwordItem {
    public ThermostaticSteelScytheItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }
    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.setStatusEffect(new StatusEffectInstance(HorrorSMPEffects.BLEED, 100, 0, false, true), target);
        return super.postHit(stack, target, attacker);
    }
}
