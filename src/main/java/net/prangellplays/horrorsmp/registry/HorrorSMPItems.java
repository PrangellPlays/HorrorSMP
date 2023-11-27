package net.prangellplays.horrorsmp.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.prangellplays.horrorsmp.HorrorSMP;
import net.prangellplays.horrorsmp.item.*;

public class HorrorSMPItems {
    public static final Item THERMOSTATIC_STEEL_SCYTHE = registerItem("thermostatic_steel_scythe", new ThermostaticSteelScytheItem(HorrorSMPToolMaterials.THERMOSTATIC_STEEL, 8, -2.8f, new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));
    public static final Item PLASMYTHIC_SCYTHE = registerItem("plasmythic_scythe", new PlasmythicScytheItem(HorrorSMPToolMaterials.PLASMYTHIC, 8, -2.8f, new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));
    public static final Item THERMOSTATIC_STEEL = registerItem("thermostatic_steel", new Item(new FabricItemSettings().fireproof()));
    public static final Item CODE_BLADE = registerItem("code_blade", new CodeBladeItem(HorrorSMPToolMaterials.CODE, 20, 4, new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));
    public static final Item CPV2 = registerItem("cpv2", new CPV2Item(new FabricItemSettings().maxDamage(0).maxCount(1).fireproof().rarity(Rarity.EPIC)));

    private static void addItemsToBuildingItemGroup(FabricItemGroupEntries entries){
    }
    private static void addItemsToColoredItemGroup(FabricItemGroupEntries entries){
    }
    private static void addItemsToNaturalItemGroup(FabricItemGroupEntries entries){
    }
    private static void addItemsToFunctionalItemGroup(FabricItemGroupEntries entries){
    }
    private static void addItemsToRedstoneItemGroup(FabricItemGroupEntries entries){
    }
    private static void addItemsToToolsItemGroup(FabricItemGroupEntries entries) {
    }
    private static void addItemsToCombatItemGroup(FabricItemGroupEntries entries){
        entries.add(THERMOSTATIC_STEEL_SCYTHE);
        entries.add(PLASMYTHIC_SCYTHE);
    }
    private static void addItemsToFoodItemGroup(FabricItemGroupEntries entries){
    }
    private static void addItemsToIngredientsItemGroup(FabricItemGroupEntries entries){
        entries.add(THERMOSTATIC_STEEL);
    }
    private static void addItemsToSpawnItemGroup(FabricItemGroupEntries entries){
    }
    private static void addItemsToOperatorItemGroup(FabricItemGroupEntries entries){
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(HorrorSMP.MOD_ID, name), item);
    }

    public static void registerHorrorSMPItems() {
        HorrorSMP.LOGGER.info("Registering Mod Items for " + HorrorSMP.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(HorrorSMPItems::addItemsToBuildingItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(HorrorSMPItems::addItemsToColoredItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(HorrorSMPItems::addItemsToNaturalItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(HorrorSMPItems::addItemsToFunctionalItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(HorrorSMPItems::addItemsToRedstoneItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(HorrorSMPItems::addItemsToToolsItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(HorrorSMPItems::addItemsToCombatItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(HorrorSMPItems::addItemsToFoodItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(HorrorSMPItems::addItemsToIngredientsItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(HorrorSMPItems::addItemsToSpawnItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.OPERATOR).register(HorrorSMPItems::addItemsToOperatorItemGroup);
    }
}
