package com.dndMod.dnd5e;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = DND5E.MODID, name = DND5E.NAME, version = DND5E.VERSION)
public class DND5E
{
    public static final String MODID = "dnd5e";
    public static final String NAME = "DnD 5e";
    public static final String VERSION = "0.1";

    private static Logger logger; 

    //MOD Global Variables
    public static ToolMaterial myToolMaterial;
    public static Item mySword;
    //---------------------

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        
        myToolMaterial = EnumHelper.addToolMaterial("MAT NAME", 4, 1000000, 20.0F, 100.0F, 30);

        mySword = new CustomSword();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
    }
}
