package top.nurlme.emeraldworld.item;

import net.minecraft.item.HoeItem;
import top.nurlme.emeraldworld.item.materials.EmeraldToolMaterial;

public class EmeraldHoe extends HoeItem {

    public EmeraldHoe() {
        super(EmeraldToolMaterial.instance, 1,-3.2f,new Settings().maxCount(1));
    }
}
