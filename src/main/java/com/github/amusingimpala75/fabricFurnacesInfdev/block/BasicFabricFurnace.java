package com.github.amusingimpala75.fabricFurnacesInfdev.block;

import com.github.amusingimpala75.fabricFurnacesInfdev.block.entity.BasicFabricFuranceEntity;
import net.minecraft.block.FurnaceBlock;
import net.minecraft.block.tile.TileEntity;
import net.minecraft.world.World;

import java.util.Random;

public class BasicFabricFurnace extends FurnaceBlock {
    protected float speedMultiplier;
    protected float fuelMultiplier;
    protected String name;
    protected int replaceIdLit;
    protected int replaceIdUnlit;

    public BasicFabricFurnace(int id, boolean lit, float speedMultiplier, float fuelMultiplier, String name, int textureIndex, int replaceIdUnlit, int replaceIdLit) {
        super(id, lit);
        this.fuelMultiplier = fuelMultiplier;
        this.speedMultiplier = speedMultiplier;
        this.name = name;
        this.textureIndex = textureIndex;
        this.replaceIdLit = replaceIdLit;
        this.replaceIdUnlit = replaceIdUnlit;
    }

    @Override
    protected TileEntity createTileEntity() {
        return new BasicFabricFuranceEntity(speedMultiplier, fuelMultiplier, name, replaceIdUnlit, replaceIdLit);
    }

    @Override
    public int getMetaTextureIndex(World world, int x, int y, int z, int side) {
        if (side == 1) {
            return this.textureIndex  + 15;
        } else if (side == 0) {
            return this.textureIndex  + 15;
        } else {
            int var6;
            if ((var6 = world.getBlockMeta(x, y, z)) == 0) {
                method_153(world, x, y, z);
                var6 = world.getBlockMeta(x, y, z);
            }

            if (side != var6) {
                return this.textureIndex;
            } else {
                return this.list ? this.textureIndex + 16 : this.textureIndex - 1;
            }
        }    }

    @Override
    public int getTextureIndex(int side) {
        if (side == 1) {
            return this.textureIndex + 15;
        } else if (side == 0) {
            return this.textureIndex + 15;
        } else {
            return side == 3 ? this.textureIndex - 1 : this.textureIndex;
        }
    }

    @Override
    public void onPlace(World world, int i, int i1, int i2) {
        super.onPlace(world, i, i1, i2);
    }

    @Override
    public void randomDisplayTick(World world, int x, int y, int z, Random rand) {
        super.randomDisplayTick(world, x, y, z, rand);
    }


}
