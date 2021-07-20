package jjones21.Phanpy.core.init;

import jjones21.Phanpy.Reference;
import jjones21.Phanpy.common.entities.PancakeEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntityType.IFactory;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityTypeInit {
	
	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, Reference.MOD_ID);
	
	//public static final RegistryObject<EntityType<PancakeEntity>> PANCAKE = buildEntity(PancakeEntity::new, PancakeEntity.class, 0.5,0.5);
	
	public static final RegistryObject<EntityType<PancakeEntity>> PANCAKE = ENTITY_TYPES.register("pancake", 
			()-> EntityType.Builder.of(PancakeEntity::new, EntityClassification.CREATURE)
			.sized(0.9f, 0.9f)
			.build(PancakeEntity.class.getSimpleName().toLowerCase()));
	
}
