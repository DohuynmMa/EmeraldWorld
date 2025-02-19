package top.nurlme.emeraldworld.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import top.nurlme.emeraldworld.EmeraldWorld;


public class ModEffects {
    public static final StatusEffect CHANGE_GRAVITY = new ChangeGravityEffect();
    public static StatusEffect registerEffect(String effectName, StatusEffect effect){
        return Registry.register(Registries.STATUS_EFFECT,new Identifier(EmeraldWorld.modName,effectName),effect);
    }
}
