package top.nurlme.emeraldworld.item;

import net.minecraft.item.ArmorItem;
import top.nurlme.emeraldworld.item.materials.EmeraldArmorMaterial;

public class EmeraldChestplate extends ArmorItem {

    public EmeraldChestplate() {
        super(EmeraldArmorMaterial.instance, Type.CHESTPLATE,new Settings().maxCount(1));
    }

}
