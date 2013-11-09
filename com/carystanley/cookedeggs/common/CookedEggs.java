package com.carystanley.cookedeggs.common;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

import com.carystanley.cookedeggs.common.ItemCookedEgg;

@Mod(modid = "carystanley_cookedeggs", name = "CookedEggs", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)


public class CookedEggs {
	@SidedProxy(clientSide = "com.carystanley.cookedeggs.common.ClientProxyCookedEggs", serverSide = "com.carystanley.cookedeggs.common.CommonProxyCookedEggs")
	public static CommonProxyCookedEggs proxy;

	public static Item cookedEgg = new ItemCookedEgg(5557, 4, 0.8f, false).setUnlocalizedName("cookedEgg");
	
	@Init
	public void load(FMLInitializationEvent event) {
		GameRegistry.addSmelting(Item.egg.itemID, new ItemStack(CookedEggs.cookedEgg), 0.5f);
		LanguageRegistry.addName(CookedEggs.cookedEgg, "Cooked Egg");
	}

}
