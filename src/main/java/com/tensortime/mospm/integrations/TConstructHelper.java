package com.tensortime.mospm.integrations;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.event.FMLInterModComms;
import slimeknights.tconstruct.library.Util;
import teamroots.embers.RegistryManager;

public class TConstructHelper 
{
	public static void addDryingRecipe (ItemStack input, ItemStack output, int seconds)
	{
		NBTTagCompound tagCompound = new NBTTagCompound();
		tagCompound.setTag("input", input.writeToNBT(new NBTTagCompound()));
		tagCompound.setTag("output", output.writeToNBT(new NBTTagCompound()));
		tagCompound.setInteger("time", seconds);
		FMLInterModComms.sendMessage(Util.MODID, "addDryingRecipe", tagCompound);
	}
	
}
