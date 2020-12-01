package com.github.amusingimpala75.fabricFurnacesInfdev.mixin;

import com.github.amusingimpala75.fabricFurnacesInfdev.FabricFurnaces;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.RecipeDispatcher;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(RecipeDispatcher.class)
public abstract class RecipeMixin {

    @Shadow abstract void addShapedRecipe(ItemStack output, Object... args);

    @Inject(at=@At("TAIL"), method = "<init>")
    public void addRecipes(CallbackInfo info) {
        addShapedRecipe(new ItemStack(FabricFurnaces.IRON_FURNACE, 1), "###", "#@#", "###", '#', Item.IRON_INGOT, '@', Block.FURNACE);
        addShapedRecipe(new ItemStack(FabricFurnaces.FABRIC_FURNACE, 1), "###", "#$#", "###", '#', Block.WHITE_WOOL, '$', Block.FURNACE);
        addShapedRecipe(new ItemStack(FabricFurnaces.GOLD_FURNACE, 1), "###", "#@#", "###", '#', Item.GOLD_INGOT, '@', FabricFurnaces.IRON_FURNACE);
        addShapedRecipe(new ItemStack(FabricFurnaces.DIAMOND_FURNACE, 1), "###", "#@#", "###", '#', Item.DIAMOND, '@', FabricFurnaces.GOLD_FURNACE);
        addShapedRecipe(new ItemStack(FabricFurnaces.OBSIDIAN_FURNACE, 1), "###", "#@#", "###", '#', Block.OBSIDIAN, '@', FabricFurnaces.DIAMOND_FURNACE);
        //TODO: CONVENIENCE ONLY!! REMOVE IN PRODUCTION
        //addShapedRecipe(new ItemStack(Item.IRON_INGOT, 8), "###", "###", "###", '#', Item.STICK);;;
        //addShapedRecipe(new ItemStack(Block.WHITE_WOOL, 8), "# #", " # ", "# #", '#', Item.STICK);
        //addShapedRecipe(new ItemStack(Item.GOLD_INGOT, 8), "###", '#', Item.STICK);
        //addShapedRecipe(new ItemStack(Item.DIAMOND, 8), "#  ", "#  ", "#  ", '#', Item.STICK);
        //addShapedRecipe(new ItemStack(Block.OBSIDIAN, 8), "#  ", " # ", "  #", '#', Item.STICK);
        //addShapedRecipe(new ItemStack(FabricFurnaces.IRON_FURNACE, 2), "#", '#', FabricFurnaces.IRON_FURNACE);
        //addShapedRecipe(new ItemStack(FabricFurnaces.FABRIC_FURNACE, 2), "#", '#', FabricFurnaces.FABRIC_FURNACE);
        //addShapedRecipe(new ItemStack(FabricFurnaces.GOLD_FURNACE, 2), "#", '#', FabricFurnaces.GOLD_FURNACE);
        //addShapedRecipe(new ItemStack(FabricFurnaces.DIAMOND_FURNACE, 2), "#", '#', FabricFurnaces.DIAMOND_FURNACE);
        //addShapedRecipe(new ItemStack(FabricFurnaces.OBSIDIAN_FURNACE, 2), "#", '#', FabricFurnaces.OBSIDIAN_FURNACE);
    }
}
