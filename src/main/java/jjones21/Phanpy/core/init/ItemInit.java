package jjones21.Phanpy.core.init;

import jjones21.Phanpy.PhanpyMod;
import jjones21.Phanpy.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);
	
//	public static final RegistryObject<Item> MONADO = ITEMS.register("monado", 
//			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));
	public static final RegistryObject<Item> PANCAKE = ITEMS.register("pancake", 
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));
}
