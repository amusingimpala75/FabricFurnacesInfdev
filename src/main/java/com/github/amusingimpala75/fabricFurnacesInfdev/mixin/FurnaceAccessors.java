package com.github.amusingimpala75.fabricFurnacesInfdev.mixin;

import net.minecraft.block.tile.Furnace;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(Furnace.class)
public interface FurnaceAccessors {
    @Accessor("field_80")
    int getField_80();
    @Accessor("field_80")
    void setField_80(int i);
    @Accessor("field_81")
    int getField_81();
    @Accessor("field_81")
    void setField_81(int i);
    @Accessor("field_82")
    int getField_82();
    @Accessor("field_82")
    void setField_82(int i);
}
