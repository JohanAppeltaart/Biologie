package com.johanappeltaart.biologie.init;

import com.johanappeltaart.biologie.Biologie;
import com.johanappeltaart.biologie.items.BlockItemBase;
import com.johanappeltaart.biologie.items.ItemBase;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Biologie.MOD_ID);

    public static final RegistryObject<Item> DNA = ITEMS.register("dna", ItemBase::new);


    //Block Items
    public static final RegistryObject<BlockItem>DNA_BLOCK_ITEM = ITEMS.register("dna_block",
            () -> new BlockItemBase(ModBlocks.DNA_BLOCK.get()));
}
