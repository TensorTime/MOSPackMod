
package com.tensortime.mospm;

import com.tensortime.mospm.integrations.Embers;
import com.tensortime.mospm.integrations.Levels;
import com.tensortime.mospm.integrations.TConstructHelper;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInterModComms;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import slimeknights.tconstruct.TConstruct;
import slimeknights.tconstruct.library.Util;
import teamroots.embers.RegistryManager;


@Mod(modid = "mospm", name = "MOSPack Mod", version = "0.6", dependencies = "required-after:crafttweaker;required-after:ftbl;required-after:tconstruct;required-after:levels;required-after:embers", useMetadata = false)

public class MOSPM {
	
	@Instance
	public static MOSPM instance;
	
    @SidedProxy(clientSide="com.tensortime.mospm.ClientProxy", serverSide="com.tensortime.mospm.ServerProxy")
    public static CommonProxy proxy;
    
    
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	Embers.integrate();
        Levels.init();    	
    	
    
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	
    }
    
}