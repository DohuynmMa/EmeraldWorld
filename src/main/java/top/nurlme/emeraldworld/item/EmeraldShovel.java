package top.nurlme.emeraldworld.item;

import net.minecraft.item.ShovelItem;
import top.nurlme.emeraldworld.item.materials.EmeraldToolMaterial;

public class EmeraldShovel extends ShovelItem {

    public EmeraldShovel() {
        super(EmeraldToolMaterial.instance, 1,-3.2f,new Settings().maxCount(1));
    }
}
