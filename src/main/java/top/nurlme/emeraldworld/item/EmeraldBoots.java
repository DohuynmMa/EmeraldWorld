package top.nurlme.emeraldworld.item;

import net.minecraft.item.ArmorItem;
import top.nurlme.emeraldworld.item.materials.EmeraldArmorMaterial;

public class EmeraldBoots extends ArmorItem {

    public EmeraldBoots() {
        super(EmeraldArmorMaterial.instance, Type.BOOTS,new Settings().maxCount(1));
    }

}
