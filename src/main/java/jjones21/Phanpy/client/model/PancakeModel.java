package jjones21.Phanpy.client.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import jjones21.Phanpy.common.entities.PancakeEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.9.1
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class PancakeModel extends EntityModel<PancakeEntity> {
	private final ModelRenderer root;
	private final ModelRenderer frleg;
	private final ModelRenderer flleg;
	private final ModelRenderer blleg;
	private final ModelRenderer brleg;
	private final ModelRenderer upper;
	private final ModelRenderer RightEar;
	private final ModelRenderer LeftEar;
	private final ModelRenderer Nose;
	private final ModelRenderer Tail;
	private final ModelRenderer tail_r1;
	private final ModelRenderer Body;

	public PancakeModel() {
		texWidth = 64;
		texHeight = 64;

		root = new ModelRenderer(this);
		root.setPos(0.0F, 24.0F, 0.0F);
		

		frleg = new ModelRenderer(this);
		frleg.setPos(0.0F, 0.0F, 0.0F);
		root.addChild(frleg);
		frleg.texOffs(25, 31).addBox(-4.0F, -3.0F, -4.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		flleg = new ModelRenderer(this);
		flleg.setPos(0.0F, 0.0F, 0.0F);
		root.addChild(flleg);
		flleg.texOffs(0, 33).addBox(1.0F, -3.0F, -4.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		blleg = new ModelRenderer(this);
		blleg.setPos(0.0F, 0.0F, 0.0F);
		root.addChild(blleg);
		blleg.texOffs(12, 33).addBox(1.0F, -3.0F, 1.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		brleg = new ModelRenderer(this);
		brleg.setPos(0.0F, 0.0F, 0.0F);
		root.addChild(brleg);
		brleg.texOffs(34, 34).addBox(-4.0F, -3.0F, 1.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		upper = new ModelRenderer(this);
		upper.setPos(0.0F, -5.0F, 0.0F);
		root.addChild(upper);
		

		RightEar = new ModelRenderer(this);
		RightEar.setPos(-5.0F, -6.0F, -0.5F);
		upper.addChild(RightEar);
		setRotationAngle(RightEar, 0.0F, 0.0F, 0.1309F);
		RightEar.texOffs(0, 20).addBox(-1.0F, -1.0F, -2.5F, 2.0F, 8.0F, 5.0F, 0.0F, false);
		RightEar.texOffs(0, 6).addBox(-1.0F, 5.0F, -2.0F, 2.0F, 2.0F, 1.0F, 0.2F, false);
		RightEar.texOffs(0, 3).addBox(-1.0F, 5.0F, 1.0F, 2.0F, 2.0F, 1.0F, 0.2F, false);

		LeftEar = new ModelRenderer(this);
		LeftEar.setPos(5.0F, -6.0F, -0.5F);
		upper.addChild(LeftEar);
		setRotationAngle(LeftEar, 0.0F, 0.0F, -0.1309F);
		LeftEar.texOffs(14, 20).addBox(-1.0F, -1.0F, -2.5F, 2.0F, 8.0F, 5.0F, 0.0F, false);
		LeftEar.texOffs(23, 20).addBox(-1.0F, 5.0F, -2.0F, 2.0F, 2.0F, 1.0F, 0.2F, false);
		LeftEar.texOffs(9, 20).addBox(-1.0F, 5.0F, 1.0F, 2.0F, 2.0F, 1.0F, 0.2F, false);

		Nose = new ModelRenderer(this);
		Nose.setPos(0.0F, -6.0F, -5.0F);
		upper.addChild(Nose);
		setRotationAngle(Nose, -0.4363F, 0.0F, 0.0F);
		Nose.texOffs(28, 20).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 8.0F, 3.0F, 0.0F, false);
		Nose.texOffs(0, 0).addBox(-2.0F, 4.0F, 0.0F, 4.0F, 2.0F, 1.0F, 0.2F, false);

		Tail = new ModelRenderer(this);
		Tail.setPos(0.0F, -4.0F, 3.5F);
		upper.addChild(Tail);
		

		tail_r1 = new ModelRenderer(this);
		tail_r1.setPos(0.0F, 0.0F, 0.0F);
		Tail.addChild(tail_r1);
		setRotationAngle(tail_r1, 0.3491F, 0.0F, 0.0F);
		tail_r1.texOffs(30, 0).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setPos(0.0F, -2.0F, 0.0F);
		upper.addChild(Body);
		Body.texOffs(0, 0).addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		root.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}

	@Override
	public void setupAnim(PancakeEntity p_225597_1_, float p_225597_2_, float p_225597_3_, float p_225597_4_,
			float p_225597_5_, float p_225597_6_) {
		// TODO Auto-generated method stub
		
	}
}