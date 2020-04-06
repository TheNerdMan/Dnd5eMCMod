package com.dndMod.dnd5e;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class CustomSword extends ItemSword {

    public CustomSword() {
        super(DND5E.myToolMaterial);
        
        this.setRegistryName("my_sword");
        this.setUnlocalizedName("my_sword");
        this.setCreativeTab(CreativeTabs.COMBAT);
    }

}
