package top.nurlme.emeraldworld.item;

import net.minecraft.item.ArmorItem;
import top.nurlme.emeraldworld.item.materials.EmeraldArmorMaterial;

public class EmeraldLeggings extends ArmorItem {

    public EmeraldLeggings() {
        super(EmeraldArmorMaterial.instance, Type.LEGGINGS,new Settings().maxCount(1));
    }

}
