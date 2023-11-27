package net.prangellplays.horrorsmp.item;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.prangellplays.horrorsmp.registry.HorrorSMPItems;

import java.util.function.Supplier;

public enum HorrorSMPToolMaterials implements ToolMaterial {
    THERMOSTATIC_STEEL(5, 0, 6.5f, 3.0f, 26,() -> Ingredient.ofItems(HorrorSMPItems.THERMOSTATIC_STEEL)),
    PLASMYTHIC(5, 0, 6.5f, 3.0f, 26,() -> Ingredient.ofItems(Items.AIR)),
    CODE(5, 0, 6.5f, 3.0f, 26,()-> Ingredient.ofItems(Items.AIR));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    HorrorSMPToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}