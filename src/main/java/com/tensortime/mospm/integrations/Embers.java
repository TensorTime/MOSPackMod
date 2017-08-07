package com.tensortime.mospm.integrations;

import net.minecraft.item.ItemStack;
import teamroots.embers.RegistryManager;

public class Embers {

	
	public  static void integrate()
	{
		ItemStack caminiteBrick = new ItemStack(RegistryManager.brick_caminite);
		ItemStack caminiteBrickBlend = new ItemStack(RegistryManager.blend_caminite);

		ItemStack caminitePlateRaw = new ItemStack(RegistryManager.plate_caminite_raw);
		ItemStack caminitePlate = new ItemStack(RegistryManager.plate_caminite);
		
		ItemStack stampPlateRaw= new ItemStack(RegistryManager.stamp_plate_raw);
		ItemStack stampPlate= new ItemStack(RegistryManager.stamp_plate);
		
		ItemStack stampBarRaw= new ItemStack(RegistryManager.stamp_bar_raw);
		ItemStack stampBar= new ItemStack(RegistryManager.stamp_bar);
		
		ItemStack stampFlatRaw= new ItemStack(RegistryManager.stamp_flat_raw);
		ItemStack stampFlat= new ItemStack(RegistryManager.stamp_flat);
		
		TConstructHelper.addDryingRecipe(caminiteBrickBlend, caminiteBrick, 120);
		TConstructHelper.addDryingRecipe(caminitePlateRaw, caminitePlate, 120);
		TConstructHelper.addDryingRecipe(stampPlateRaw, stampPlate, 240);
		TConstructHelper.addDryingRecipe(stampBarRaw, stampBar, 240);
		TConstructHelper.addDryingRecipe(stampFlatRaw, stampFlat, 240);

	}
	

}
