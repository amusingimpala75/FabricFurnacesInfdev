package com.github.amusingimpala75.fabricFurnacesInfdev;

import com.github.amusingimpala75.fabricFurnacesInfdev.block.*;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class FabricFurnaces implements ModInitializer {
    public static Block IRON_FURNACE;
    public static Block IRON_FURNACE_LIT;
    public static Item IRON_FURNACE_ITEM;
    public static Block FABRIC_FURNACE;
    public static Block FABRIC_FURNACE_LIT;
    public static Item FABRIC_FURNACE_ITEM;
    public static Block GOLD_FURNACE;
    public static Block GOLD_FURNACE_LIT;
    public static Item GOLD_FURNACE_ITEM;
    public static Block DIAMOND_FURNACE;
    public static Block DIAMOND_FURNACE_LIT;
    public static Item DIAMOND_FURNACE_ITEM;
    public static Block OBSIDIAN_FURNACE;
    public static Block OBSIDIAN_FURNACE_LIT;
    public static Item OBSIDIAN_FURNACE_ITEM;
    @Override
    public void onInitialize() {
        IRON_FURNACE = new IronFurnace(100, 161, 100, 101);
        IRON_FURNACE_LIT = new IronFurnaceLit(101, 161, 100, 101);
        IRON_FURNACE_ITEM = registerBlockItem(IRON_FURNACE);
        FABRIC_FURNACE = new FabricFurnace(102, 163, 102, 103);
        FABRIC_FURNACE_LIT = new FabricFurnaceLit(103, 163, 102, 103);
        FABRIC_FURNACE_ITEM = registerBlockItem(FABRIC_FURNACE);
        GOLD_FURNACE = new GoldFurnace(104, 165, 104, 105);
        GOLD_FURNACE_LIT = new GoldFurnaceLit(105, 165, 104, 105);
        GOLD_FURNACE_ITEM = registerBlockItem(GOLD_FURNACE);
        DIAMOND_FURNACE = new DiamondFurnace(106, 167, 106, 107);
        DIAMOND_FURNACE_LIT = new DiamondFurnaceLit(107, 167, 106, 107);
        DIAMOND_FURNACE_ITEM = registerBlockItem(DIAMOND_FURNACE);
        OBSIDIAN_FURNACE = new ObsidianFurnace(108, 169, 108, 109);
        OBSIDIAN_FURNACE_LIT = new ObsidianFurnaceLit(109, 169, 108, 109);
        OBSIDIAN_FURNACE_ITEM = registerBlockItem(OBSIDIAN_FURNACE);
    }

    public static BlockItem registerBlockItem(Block block) {
        int var2 = block.id;
        if (Block.BLOCKS[var2] != null) {
            Item.ITEMS[var2] = new BlockItem(var2 - 256);
            return (BlockItem) Item.ITEMS[var2];
        }
        return null;
    }
}
