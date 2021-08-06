package jjones21.Phanpy.common.util;

import jjones21.Phanpy.Reference;
import jjones21.Phanpy.core.init.EntityTypeInit;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.util.text.TextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.loading.FMLLoader;
import software.bernie.example.GeckoLibMod;
import software.bernie.example.registry.EntityRegistry;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonEventBusSubscriber {

//	@SubscribeEvent
//    public void pickupItem(EntityItemPickupEvent event) {
//        System.out.println("Item picked up!");
//        TextComponent textcomponent = new TranslationTextComponent("hey");
//        event.getPlayer().sendMessage(textcomponent,event.getPlayer().getUUID());
//    }
	
	@SubscribeEvent
	public static void registerEntityAttributes(EntityAttributeCreationEvent event) {
		event.put(EntityTypeInit.PANCAKE.get(),
				MobEntity.createMobAttributes().add(Attributes.MAX_HEALTH, 1.0D).build());
	}
	
}
