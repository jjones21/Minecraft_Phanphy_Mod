package jjones21.Phanpy.client.render;

import jjones21.Phanpy.Reference;
import jjones21.Phanpy.client.model.PancakeModel;
import jjones21.Phanpy.common.entities.PancakeEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class PancakeRender extends MobRenderer<PancakeEntity,PancakeModel>{

	protected static final ResourceLocation TEXTURE = new ResourceLocation(Reference.MOD_ID,
			"pancake.png");
	
	public PancakeRender(EntityRendererManager renderManagerIn) {
		super(renderManagerIn, new PancakeModel(), 0.5f);
	}
	
	public ResourceLocation getEntityTexture(PancakeEntity entity) {
		return TEXTURE;
	}

	@Override
	public ResourceLocation getTextureLocation(PancakeEntity p_110775_1_) {
		// TODO Auto-generated method stub
		return TEXTURE;
	}
}
