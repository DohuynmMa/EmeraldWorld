package top.nurlme.emeraldworld.item;
import net.minecraft.item.*;
import top.nurlme.emeraldworld.item.materials.EmeraldToolMaterial;

public class EmeraldSword extends SwordItem {

    public EmeraldSword() {
        super(EmeraldToolMaterial.instance, 6,-2.4f,new Settings().maxCount(1));
    }
}
