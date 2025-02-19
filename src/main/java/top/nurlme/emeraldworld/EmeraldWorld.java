package top.nurlme.emeraldworld;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import top.nurlme.emeraldworld.effect.ModEffects;
import top.nurlme.emeraldworld.item.ModItems;

public class EmeraldWorld implements ModInitializer {
    public static String modName = "emeraldworld";
    @Override
    public void onInitialize(){
        registerItems();
        registerEffects();
        registerBlocks();
    }
    private static void registerItems(){
        ModItems.registerItem("emerald_apple",ModItems.EMERALD_APPLE);
        ModItems.registerItem("emerald_sword",ModItems.EMERALD_SWORD);
        ModItems.registerItem("emerald_axe",ModItems.EMERALD_AXE);
        ModItems.registerItem("emerald_pickaxe",ModItems.EMERALD_PICKAXE);
        ModItems.registerItem("emerald_shovel",ModItems.EMERALD_SHOVEL);
        ModItems.registerItem("emerald_hoe",ModItems.EMERALD_HOE);
        ModItems.registerItem("emerald_helmet",ModItems.EMERALD_HELMET);
        ModItems.registerItem("emerald_chestplate",ModItems.EMERALD_CHESTPLATE);
        ModItems.registerItem("emerald_leggings",ModItems.EMERALD_LEGGINGS);
        ModItems.registerItem("emerald_boots",ModItems.EMERALD_BOOTS);
        ModItems.addModItemToGroups();
    }
    private static void registerEffects(){
        ModEffects.registerEffect("change_gravity",ModEffects.CHANGE_GRAVITY);
    }
    private static void registerBlocks(){
    }
}
