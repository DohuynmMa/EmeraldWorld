package top.nurlme.emeraldworld;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;

import java.util.List;

public class Utils {
    public static List<Entity> getEntitiesNear(PlayerEntity player, double radius) {
        Vec3d playerPosition = player.getPos();
        Box box = new Box(playerPosition.subtract(radius, 255, radius), playerPosition.add(radius, 255, radius));
        var nearbyEntities = player.world.getEntitiesByClass(Entity.class, box, entity -> true);
        nearbyEntities.removeIf(entity -> entity.equals(player));
        return nearbyEntities;
    }

}
