package net.prangellplays.horrorsmp.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.prangellplays.horrorsmp.HorrorSMP;

public class HorrorSMPEffects {

    public static StatusEffect CPV2;
    public static StatusEffect BLEED;
    public static StatusEffect BURN;

    public static StatusEffect registerCPV2Effect(String name){
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(HorrorSMP.MOD_ID, name),
                new CPV2Effect(StatusEffectCategory.BENEFICIAL, 1476624));
    }
    public static StatusEffect registerBleedEffect(String name){
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(HorrorSMP.MOD_ID, name),
                new BleedEffect(StatusEffectCategory.HARMFUL, 13500416));
    }
    public static StatusEffect registerBurnEffect(String name){
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(HorrorSMP.MOD_ID, name),
                new BleedEffect(StatusEffectCategory.HARMFUL, 13500416));
    }

    public static void registerEffects(){
        CPV2 = registerCPV2Effect("cpv2");
        BLEED = registerBleedEffect("bleed");
        BURN = registerBurnEffect("burn");
    }

}