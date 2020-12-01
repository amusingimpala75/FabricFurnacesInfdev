package com.github.amusingimpala75.fabricFurnacesInfdev.block;

import com.github.amusingimpala75.fabricFurnacesInfdev.mixin.TileEntityRegisterInvoker;

public class GoldFurnaceLit extends BasicFabricFurnace {
    public GoldFurnaceLit(int id, int textureIndex, int replaceIdUnlit, int replaceIdLit) {
        super(id, true, 3.0F, 2.0F, "Gold Furnace", textureIndex, replaceIdUnlit, replaceIdLit);
        //TileEntityRegisterInvoker.invokeRegister(this.getClass(), "gold_furnace_lit");

    }
}
