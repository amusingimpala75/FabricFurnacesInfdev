package com.github.amusingimpala75.fabricFurnacesInfdev.block.entity;

import com.github.amusingimpala75.fabricFurnacesInfdev.mixin.FurnaceAccessors;
import com.github.amusingimpala75.fabricFurnacesInfdev.mixin.TileEntityRegisterInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.tile.Furnace;
import net.minecraft.block.tile.TileEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.World;

public class BasicFabricFuranceEntity extends Furnace {

    protected float speedMultiplier;
    protected float fuelMultiplier;
    protected String name;
    protected int replaceIdUnlit;
    protected int replaceIdLit;

    public BasicFabricFuranceEntity(float speedMultiplier, float fuelMultiplier, String name, int replaceIdUnlit, int replaceIdLit) {
        this.speedMultiplier = speedMultiplier;
        this.fuelMultiplier = fuelMultiplier;
        this.name = name;
        this.replaceIdLit = replaceIdLit;
        this.replaceIdUnlit = replaceIdUnlit;
        TileEntityRegisterInvoker.invokeRegister(this.getClass(), "base_fabric_furnace");
    }

    //@Override
    //public int size() {
    //    return super.size();
    //}

    //@Override
    //public ItemStack get(int i) {
    //    return super.get(i);
    //}

    //@Override
    //public ItemStack damage(int slot, int amount) {
    //    return super.damage(slot, amount);
    //}

    //@Override
    //public void set(int slot, ItemStack stack) {
    //    super.set(slot, stack);
    //}

    @Override
    public String getName() {
        return name;
    }

    //@Override
    //public void deserialize(CompoundTag tag) {
    //    super.deserialize(tag);
    //}

    //@Override
    //public void serialize(CompoundTag tag) {
    //    super.serialize(tag);
    //}

    //@Override
    //public int method_294() {
    //    return super.method_294();
    //}

    //@Override
    //public int method_77(int i) {
    //    return super.method_77(i);
    //}

    //@Override
    //public int method_78(int i) {
    //    return super.method_78(i);
    //}

    //@Override
    //public boolean method_80() {
    //    return super.method_80();
    //}

    @Override
    public void tick() {
        boolean var1 = ((FurnaceAccessors)this).getField_80() > 0;

        //Decreasing burn time remaining
        if (((FurnaceAccessors)this).getField_80() > 0) {
            if (((FurnaceAccessors)this).getField_80() > 1*fuelMultiplier) {
                ((FurnaceAccessors)this).setField_80((int) (((FurnaceAccessors)this).getField_80()-(1*fuelMultiplier)));
            } else {
                ((FurnaceAccessors)this).setField_80(0);
            }
        }

        //Setting the burn time if item is there and the furnace had not been burning and there is still output space
        if (((FurnaceAccessors)this).getField_80() == 0 && this.method_81()) {
            ((FurnaceAccessors)this).setField_81(getBurnTime(this.stacks[1]));
            ((FurnaceAccessors)this).setField_80(getBurnTime(this.stacks[1]));
            if (((FurnaceAccessors)this).getField_80() > 0 && this.stacks[1] != null) {
                --this.stacks[1].count;
                if (this.stacks[1].count == 0) {
                    this.stacks[1] = null;
                }
            }
        }

        if (this.method_80() && this.method_81()) {
             if (((FurnaceAccessors)this).getField_82()+(1*speedMultiplier) < 200) {
                 ((FurnaceAccessors)this).setField_82((int) (((FurnaceAccessors)this).getField_82()+(1*speedMultiplier)));
             } else {
                 ((FurnaceAccessors)this).setField_82(200);
             }
            if (((FurnaceAccessors)this).getField_82() == 200) {
                ((FurnaceAccessors)this).setField_82(0);
                if (this.method_81()) {
                    int var3 = getSmeltedId(this.stacks[0].asItem().id);
                    if (this.stacks[2] == null) {
                        this.stacks[2] = new ItemStack(var3, 1);
                    } else if (this.stacks[2].id == var3) {
                        ++this.stacks[2].count;
                    }

                    --this.stacks[0].count;
                    if (this.stacks[0].count <= 0) {
                        this.stacks[0] = null;
                    }
                }
            }
        } else {
            ((FurnaceAccessors)this).setField_82(0);
        }

        if (var1 != ((FurnaceAccessors)this).getField_80() > 0) {
            boolean var10 = ((FurnaceAccessors)this).getField_80() > 0;
            int var5 = this.z;
            int var4 = this.y;
            int var8 = this.x;
            World var9 = this.world;
            boolean var2 = var10;
            int var6 = var9.getBlockMeta(var8, var4, var5);
            TileEntity var7 = var9.getTileEntity(var8, var4, var5);
            if (var2) {
                var9.method_258(var8, var4, var5, replaceIdLit);
            } else {
                var9.method_258(var8, var4, var5, replaceIdUnlit);
            }

            var9.setBlockMeta(var8, var4, var5, var6);
            var9.setTileEntity(var8, var4, var5, var7);
        }

        this.world.markDirty(this.x, this.y, this.z);
    }

    //@Override
    //protected boolean method_81() {
    //    return super.method_81();
    //}

    //@Override
    //public void method_73() {
    //    super.method_73();
    //}

    //@Override
    //protected static int getSmeltedId(int originalId) {
    //    if (originalId == Block.IRON_ORE.id) {
    //        return Item.IRON_INGOT.id;
    //    } else if (originalId == Block.GOLD_ORE.id) {
    //        return Item.GOLD_INGOT.id;
    //    } else if (originalId == Block.DIAMOND_ORE.id) {
    //        return Item.DIAMOND.id;
    //    } else if (originalId == Block.SAND.id) {
    //        return Block.GLASS.id;
    //    } else if (originalId == Item.RAW_PORKCHOP.id) {
    //        return Item.COOKED_PORKCHOP.id;
    //    } else {
    //        return originalId == Block.COBBLESTONE.id ? Block.STONE.id : -1;
    //    }
    //}

    //@Override
    //protected static int getBurnTime(ItemStack stack) {
    //    if (stack == null) {
    //        return 0;
    //    } else {
    //        int stackInt;
    //        if ((stackInt = stack.asItem().id) < 256 && Block.BLOCKS[stackInt].material == Material.WOOD) {
    //            return 300;
    //        } else if (stackInt == Item.STICK.id) {
    //            return 100;
    //        } else {
    //            return stackInt == Item.COAL.id ? 1600 : 0;
    //        }
    //    }
    //}
}
