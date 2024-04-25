package net.erin.soj.mixin;

import net.erin.soj.SpiritsOfJapan;
import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftServer.class)
public class ExampleMixin {
	@Inject(at = @At("HEAD"), method = "loadWorld")
	private void init(CallbackInfo info) {
		SpiritsOfJapan.LOGGER.info("Success!");
		// This code is injected into the start of MinecraftServer.loadWorld()V
	}
}