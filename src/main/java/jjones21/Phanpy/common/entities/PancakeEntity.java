package jjones21.Phanpy.common.entities;

import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class PancakeEntity extends AnimalEntity{

	private FollowOwnerGoal follow;
	private int pancakeTimer;
	
	public PancakeEntity(EntityType<? extends PancakeEntity> type, World worldIn) {
		super(type, worldIn);
		this.noCulling = true;
		// TODO Auto-generated constructor stub
	}

//	@Override
//	public AgeableEntity getBreedOffspring(ServerWorld p_241840_1_, AgeableEntity p_241840_2_) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(0, new WaterAvoidingRandomWalkingGoal(this, 1.0D));
		this.goalSelector.addGoal(1, new LookRandomlyGoal(this));
		this.goalSelector.addGoal(2, new LookAtGoal(this, PlayerEntity.class, 6.0F));
	}

@Override
public AgeableEntity getBreedOffspring(ServerWorld p_241840_1_, AgeableEntity p_241840_2_) {
	return null;
}
	

	
//	protected void registerAttributes() {
//		super.registerAttributes();
//		this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(16.0D);
//		this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.20D);
//	}

}
