package com.github.mnesikos.leadablepandas.mixin;

import net.minecraft.entity.passive.PandaEntity;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PandaEntity.class)
public class LeadableMixin {
	@Inject(at = @At("RETURN"), method = "canBeLeashedBy")
	private boolean canBeLeashedBy(PlayerEntity playerEntity, CallbackInfoReturnable info) {
		return true;
	}
}
