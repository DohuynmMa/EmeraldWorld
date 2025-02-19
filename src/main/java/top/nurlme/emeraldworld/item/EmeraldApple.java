package top.nurlme.emeraldworld.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import top.nurlme.emeraldworld.effect.ModEffects;

public class EmeraldApple extends Item {

    public EmeraldApple() {
        super(new Item.Settings().food((new FoodComponent.Builder()).hunger(4).alwaysEdible().statusEffect(new StatusEffectInstance(ModEffects.CHANGE_GRAVITY, 3600, 0), 1.0F).build()).maxCount(64));
    }

}
