package com.johanappeltaart.biologie.items;

import com.johanappeltaart.biologie.Biologie;
import net.minecraft.item.Item;

public class ItemBase extends Item{
    public ItemBase() {
        super(new Item.Properties().tab(Biologie.TAB));
    }

}
