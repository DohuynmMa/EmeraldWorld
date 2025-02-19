package top.nurlme.emeraldworld.item.materials;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class EmeraldToolMaterial implements ToolMaterial {
    public static EmeraldToolMaterial instance = new EmeraldToolMaterial();
    @Override
    public int getDurability() {
        return 1865;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 50;
    }

    @Override
    public float getAttackDamage() {
        return 3;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 30;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.EMERALD);
    }
}
