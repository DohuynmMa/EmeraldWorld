package top.nurlme.emeraldworld.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import top.nurlme.emeraldworld.EmeraldWorld;


public class ModItems {
    public static final Item EMERALD_APPLE = new EmeraldApple();
    public static Item EMERALD_SWORD = new EmeraldSword();
    public static Item EMERALD_AXE = new EmeraldAxe();
    public static Item EMERALD_PICKAXE = new EmeraldPickaxe();
    public static Item EMERALD_SHOVEL = new EmeraldShovel();
    public static Item EMERALD_HOE = new EmeraldHoe();
    public static Item EMERALD_HELMET = new EmeraldHelmet();
    public static Item EMERALD_CHESTPLATE = new EmeraldChestplate();
    public static Item EMERALD_LEGGINGS = new EmeraldLeggings();
    public static Item EMERALD_BOOTS = new EmeraldBoots();

    public static Item registerItem(String itemName, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(EmeraldWorld.modName, itemName), item);
    }
    public static void addModItemToGroups(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
            content.add(EMERALD_SWORD);
            content.add(EMERALD_HELMET);
            content.add(EMERALD_CHESTPLATE);
            content.add(EMERALD_LEGGINGS);
            content.add(EMERALD_BOOTS);

        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {
            content.add(EMERALD_AXE);
            content.add(EMERALD_PICKAXE);
            content.add(EMERALD_SHOVEL);
            content.add(EMERALD_HOE);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(content -> {
            content.add(EMERALD_APPLE);
        });
    }
}