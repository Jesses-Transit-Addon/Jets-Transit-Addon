package org.eu.awesomekalin.jta.mod.mixin;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import org.eu.awesomekalin.jta.mod.init.ItemInit;
import org.eu.awesomekalin.jta.mod.init.SoundInit;
import org.eu.awesomekalin.jta.mod.util.RadioUtil;
import org.mtr.mapping.holder.SoundCategory;
import org.mtr.mapping.mapper.ItemExtension;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(net.minecraft.server.network.ServerPlayNetworkHandler.class)
public class ServerPlayNetworkHandler {
	@Shadow public ServerPlayerEntity player;

	@Inject(method = "onPlayerAction", at = @At(value = "INVOKE", target = "Lnet/minecraft/server/network/ServerPlayerEntity;getStackInHand(Lnet/minecraft/util/Hand;)Lnet/minecraft/item/ItemStack;"), cancellable = true)
	public void onPlayerAction(PlayerActionC2SPacket packet, CallbackInfo ci) {
		if (packet.getAction() != PlayerActionC2SPacket.Action.SWAP_ITEM_WITH_OFFHAND)
			return;
		ItemStack stack = player.getStackInHand(Hand.MAIN_HAND);
		if (!stack.getTranslationKey().equals(ItemInit.MET_POLICE_RADIO.get().getTranslationKey()))
			return;
		boolean isTransmitting = RadioUtil.isRadioTransmitting(new org.mtr.mapping.holder.ItemStack(stack));
		RadioUtil.setRadioTransmitting(new org.mtr.mapping.holder.ItemStack(stack), !isTransmitting);
		int channel = RadioUtil.getRadioChannel(new org.mtr.mapping.holder.ItemStack(stack));
		player.sendMessage(Text.of(!isTransmitting ? "Transmitting." : "Transmission Stopped"), true);

		if (!isTransmitting) {
			player.getWorld().playSound(null, player.getBlockPos(), SoundInit.MET_POLICE_RADIO_IN.get().data, SoundCategory.VOICE.data, 1f, 1f);
		} else {
			player.getWorld().playSound(null, player.getBlockPos(), SoundInit.MET_POLICE_RADIO_OUT.get().data, SoundCategory.VOICE.data, 1f, 1f);
		}
		ci.cancel();
	}
}