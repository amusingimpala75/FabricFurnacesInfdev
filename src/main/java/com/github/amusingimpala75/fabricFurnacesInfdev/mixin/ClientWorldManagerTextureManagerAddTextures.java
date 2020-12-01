package com.github.amusingimpala75.fabricFurnacesInfdev.mixin;

import com.github.amusingimpala75.fabricFurnacesInfdev.resource.BasicCustomTexture;
import net.minecraft.client.resource.TextureManager;
import net.minecraft.world.ClientWorldManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ClientWorldManager.class)
public class ClientWorldManagerTextureManagerAddTextures {
    @Shadow private TextureManager textureManager;
    @Inject(at=@At("TAIL"), method = "<init>")
    public void addTextures(CallbackInfo info) {
        textureManager.registerDynamicTexture(new BasicCustomTexture(160, "/assets/fabricfurnaces/iron_furnace_front.png"));
        textureManager.registerDynamicTexture(new BasicCustomTexture(161, "/assets/fabricfurnaces/iron_furnace_side.png"));
        textureManager.registerDynamicTexture(new BasicCustomTexture(177, "/assets/fabricfurnaces/iron_furnace_lit.png"));
        textureManager.registerDynamicTexture(new BasicCustomTexture(176, "/assets/fabricfurnaces/iron_furnace_top.png"));
        textureManager.registerDynamicTexture(new BasicCustomTexture(162, "/assets/fabricfurnaces/fabric_furnace_front.png"));
        textureManager.registerDynamicTexture(new BasicCustomTexture(163, "/assets/fabricfurnaces/fabric_furnace_side.png"));
        textureManager.registerDynamicTexture(new BasicCustomTexture(179, "/assets/fabricfurnaces/fabric_furnace_lit.png"));
        textureManager.registerDynamicTexture(new BasicCustomTexture(178, "/assets/fabricfurnaces/fabric_furnace_top.png"));
        textureManager.registerDynamicTexture(new BasicCustomTexture(164, "/assets/fabricfurnaces/gold_furnace_front.png"));
        textureManager.registerDynamicTexture(new BasicCustomTexture(165, "/assets/fabricfurnaces/gold_furnace_side.png"));
        textureManager.registerDynamicTexture(new BasicCustomTexture(181, "/assets/fabricfurnaces/gold_furnace_lit.png"));
        textureManager.registerDynamicTexture(new BasicCustomTexture(180, "/assets/fabricfurnaces/gold_furnace_top.png"));
        textureManager.registerDynamicTexture(new BasicCustomTexture(166, "/assets/fabricfurnaces/diamond_furnace_front.png"));
        textureManager.registerDynamicTexture(new BasicCustomTexture(167, "/assets/fabricfurnaces/diamond_furnace_side.png"));
        textureManager.registerDynamicTexture(new BasicCustomTexture(183, "/assets/fabricfurnaces/diamond_furnace_lit.png"));
        textureManager.registerDynamicTexture(new BasicCustomTexture(182, "/assets/fabricfurnaces/diamond_furnace_top.png"));
        textureManager.registerDynamicTexture(new BasicCustomTexture(168, "/assets/fabricfurnaces/obsidian_furnace_front.png"));
        textureManager.registerDynamicTexture(new BasicCustomTexture(169, "/assets/fabricfurnaces/obsidian_furnace_side.png"));
        textureManager.registerDynamicTexture(new BasicCustomTexture(185, "/assets/fabricfurnaces/obsidian_furnace_lit.png"));
        textureManager.registerDynamicTexture(new BasicCustomTexture(184, "/assets/fabricfurnaces/obsidian_furnace_top.png"));
    }
}
