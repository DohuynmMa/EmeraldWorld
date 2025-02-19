package top.nurlme.emeraldworld.item.materials;

import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class EmeraldArmorMaterial implements ArmorMaterial {
    public static EmeraldArmorMaterial instance = new EmeraldArmorMaterial();
    @Override
    public int getDurability(ArmorItem.Type type) {
        return 628;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return 8;
    }

    @Override
    public int getEnchantability() {
        return 30;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.EMERALD);
    }

    @Override
    public String getName() {
        return "emeraldworld:emerald";
    }

    @Override
    public float getToughness() {
        return 3;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}
