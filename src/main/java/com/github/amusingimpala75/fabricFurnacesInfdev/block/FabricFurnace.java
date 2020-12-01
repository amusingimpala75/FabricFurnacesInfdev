package com.github.amusingimpala75.fabricFurnacesInfdev.block;

import com.github.amusingimpala75.fabricFurnacesInfdev.mixin.TileEntityRegisterInvoker;

public class FabricFurnace extends BasicFabricFurnace {
    public FabricFurnace(int id, int textureIndex, int replaceIdUnlit, int replaceIdLit) {
        super(id, false, 1.5F, 1.5F, "Fabric Furnace", textureIndex, replaceIdUnlit, replaceIdLit);
        //TileEntityRegisterInvoker.invokeRegister(this.getClass(), "fabric_furnace");
    }
}
