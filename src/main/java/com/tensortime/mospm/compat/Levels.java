package com.tensortime.mospm.compat;

import com.thexfactor117.levels.config.Config;
import com.thexfactor117.levels.util.NBTHelper;
import com.thexfactor117.levels.util.WeaponHelper;
import com.thexfactor117.levels.event.*;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemShield;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.Phase;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class Levels {

		public static void init ()
		{
			
		}
	
		@SubscribeEvent
		public void onCreateWeapon (PlayerTickEvent weaponEvent)
		{
			if (!weaponEvent.player.getEntityWorld().isRemote)
			{
				if (weaponEvent.phase == Phase.START)
				{
					for (ItemStack stack : weaponEvent.player.inventory.mainInventory)
					{
						if (stack != null && (stack.getItem() instanceof ItemSword || stack.getItem() instanceof ItemBow || stack.getItem() instanceof ItemArmor || stack.getItem() instanceof ItemShield))
						{

						} else create(stack, weaponEvent.player);
						
					}
				}
			}
		}
		
		/**
		 * Sets up a weapon with customized values.
		 * @param stack
		 */
		private void create(ItemStack stack, EntityPlayer player)
		{
			NBTTagCompound nbt = NBTHelper.loadStackNBT(stack);
			
			if (nbt != null)
			{
				for (int j = 0; j < Config.itemBlacklist.length; j++)
				{
					if (Config.itemBlacklist[j].equals(stack.getItem().getRegistryName().getResourceDomain() + ":" + stack.getItem().getRegistryName().getResourcePath()))
					{
						return;
					}
				}
				
				WeaponHelper.create(stack, player);
			}
		}
	}
