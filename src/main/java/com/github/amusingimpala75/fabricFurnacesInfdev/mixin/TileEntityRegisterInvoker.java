package com.github.amusingimpala75.fabricFurnacesInfdev.mixin;

import net.minecraft.block.tile.TileEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(TileEntity.class)
public interface TileEntityRegisterInvoker {
    @Invoker
    static void invokeRegister(Class klass, String mapping) {
        throw new AssertionError();
    }
}
