package com.carystanley.cookedeggs.common;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;

public class ItemCookedEgg extends ItemFood {
    public ItemCookedEgg(int id, int foodAmount, float sat, boolean isWolfMeat) {
    	super(id, foodAmount, sat, isWolfMeat);
    }
        
    @Override
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon("cookedeggs:cookedegg");
    }

}
