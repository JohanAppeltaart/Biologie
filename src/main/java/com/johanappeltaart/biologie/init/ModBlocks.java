package com.johanappeltaart.biologie.init;

import com.johanappeltaart.biologie.Biologie;
import com.johanappeltaart.biologie.blocks.DnaBlock;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Biologie.MOD_ID);

    //Blocks
    public static final RegistryObject<Block> DNA_BLOCK = BLOCKS.register("dna_block", DnaBlock::new);
}
