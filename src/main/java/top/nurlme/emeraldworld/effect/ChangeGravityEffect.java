package top.nurlme.emeraldworld.effect;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;
import top.nurlme.emeraldworld.Utils;

public class ChangeGravityEffect extends StatusEffect {
    protected ChangeGravityEffect() {
        super(StatusEffectCategory.BENEFICIAL, 0xFF0000);
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        super.applyUpdateEffect(entity, amplifier);
        if (entity instanceof PlayerEntity player) {
            var nearEntities = Utils.getEntitiesNear(player, 3);
            if(nearEntities == null) return;
            for (int i = 0; i < nearEntities.size(); i++) {
                var nearEntity = nearEntities.get(i);
                var v = nearEntity.getVelocity();
                nearEntity.setVelocity(v.x, v.y + 0.16f * (amplifier + 1), v.z);
            }
        }
    }
    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}
