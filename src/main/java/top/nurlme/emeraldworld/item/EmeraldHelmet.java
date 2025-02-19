package top.nurlme.emeraldworld.item;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Equipment;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import top.nurlme.emeraldworld.effect.ModEffects;
import top.nurlme.emeraldworld.item.materials.EmeraldArmorMaterial;
import top.nurlme.emeraldworld.item.materials.EmeraldToolMaterial;

public class EmeraldHelmet extends ArmorItem {

    public EmeraldHelmet() {
        super(EmeraldArmorMaterial.instance, Type.HELMET,new Settings().maxCount(1));
    }

}
