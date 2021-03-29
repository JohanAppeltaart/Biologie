package com.johanappeltaart.biologie.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class DnaBlock extends Block {
    public DnaBlock() {
        super(AbstractBlock.Properties.of(Material.CLAY)
                        .strength(1.0f)
                        .sound(SoundType.CROP)
                        .harvestLevel(0)
                        .harvestTool(ToolType.HOE)
        );
    }

}