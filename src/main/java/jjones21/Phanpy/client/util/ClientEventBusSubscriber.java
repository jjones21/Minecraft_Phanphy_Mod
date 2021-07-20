package jjones21.Phanpy.client.util;

import jjones21.Phanpy.Reference;
import jjones21.Phanpy.client.render.PancakeRender;
import jjones21.Phanpy.core.init.EntityTypeInit;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponent;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientEventBusSubscriber {

	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void clientSetup(FMLClientSetupEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(EntityTypeInit.PANCAKE.get(), PancakeRender::new);
	}
	
	
	
}
