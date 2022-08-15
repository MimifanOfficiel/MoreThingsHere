package fr.mimifan.mth.item;

import fr.mimifan.mth.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class MTHCreativeModeTab {

    public static final CreativeModeTab toolsTab = new CreativeModeTab("mth_tools") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CUTTING_KNIFE.get());
        }
    };

    public static final CreativeModeTab foodTab = new CreativeModeTab("mth_foods") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BREAD_SLICE.get());
        }
    };

    public static final CreativeModeTab fuelTab = new CreativeModeTab("mth_fuels") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.OMEGA_COAL.get());
        }
    };

    public static final CreativeModeTab blockTab = new CreativeModeTab("mth_blocks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.test.get());
        }
    };

    public static final CreativeModeTab machineTab = new CreativeModeTab("mth_machines") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.infusion_machine.get());
        }
    };

}
