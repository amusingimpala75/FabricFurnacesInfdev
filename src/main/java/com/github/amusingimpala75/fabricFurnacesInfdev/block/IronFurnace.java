package com.github.amusingimpala75.fabricFurnacesInfdev.block;

import com.github.amusingimpala75.fabricFurnacesInfdev.mixin.TileEntityRegisterInvoker;

public class IronFurnace extends BasicFabricFurnace {
    public IronFurnace(int id, int textureIndex, int replaceIdUnlit, int replaceIdLit) {
        super(id, false, 2.0F, 2.0F, "Iron Furnace", textureIndex, replaceIdUnlit, replaceIdLit);
        //TileEntityRegisterInvoker.invokeRegister(this.getClass(), "iron_furnace");
    }
}
