package top.nurlme.emeraldworld.item;

import net.minecraft.item.PickaxeItem;
import top.nurlme.emeraldworld.item.materials.EmeraldToolMaterial;

public class EmeraldPickaxe extends PickaxeItem {

    public EmeraldPickaxe() {
        super(EmeraldToolMaterial.instance, 1,-3.2f,new Settings().maxCount(1));
    }
}
