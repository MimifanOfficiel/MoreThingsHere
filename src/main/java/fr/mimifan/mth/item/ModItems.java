package fr.mimifan.mth.item;

import fr.mimifan.mth.Main;
import fr.mimifan.mth.item.custom.fuels.AlphaCoal;
import fr.mimifan.mth.item.custom.fuels.BetaCoal;
import fr.mimifan.mth.item.custom.fuels.OmegaCoal;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);

    public static final RegistryObject<Item> CUTTING_KNIFE = ITEMS.register("cutting_knife", () ->
            new Item(new Item.Properties().tab(MTHCreativeModeTab.toolsTab)));

    public static final RegistryObject<Item> BREAD_SLICE = ITEMS.register("bread_slice", () ->
            new Item(new Item.Properties().tab(MTHCreativeModeTab.foodTab).food(ModFoods.BREAD_SLICE)));

    public static final RegistryObject<Item> OMEGA_COAL = ITEMS.register("omega_coal", () ->
            new OmegaCoal(new Item.Properties().tab(MTHCreativeModeTab.fuelTab)));

    public static final RegistryObject<Item> BETA_COAL = ITEMS.register("beta_coal", () ->
            new BetaCoal(new Item.Properties().tab(MTHCreativeModeTab.fuelTab)));

    public static final RegistryObject<Item> ALPHA_COAL = ITEMS.register("alpha_coal", () ->
            new AlphaCoal(new Item.Properties().tab(MTHCreativeModeTab.fuelTab)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
