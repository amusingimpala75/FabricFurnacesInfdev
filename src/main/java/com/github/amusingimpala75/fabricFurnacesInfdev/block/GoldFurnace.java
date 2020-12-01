package com.github.amusingimpala75.fabricFurnacesInfdev.block;

import com.github.amusingimpala75.fabricFurnacesInfdev.mixin.TileEntityRegisterInvoker;

public class GoldFurnace extends BasicFabricFurnace {
    public GoldFurnace(int id, int textureIndex, int replaceIdUnlit, int replaceIdLit) {
        super(id, false, 3.0F, 2.0F, "Gold Furnace", textureIndex, replaceIdUnlit, replaceIdLit);
        //TileEntityRegisterInvoker.invokeRegister(this.getClass(), "gold_furnace");
    }
}
