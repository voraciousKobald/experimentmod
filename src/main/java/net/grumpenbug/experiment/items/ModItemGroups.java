package net.grumpenbug.experiment.items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.grumpenbug.experiment.Experiment;
import net.grumpenbug.experiment.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup POISONS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Experiment.MOD_ID, "poisons"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.poison"))
                    .icon(() -> new ItemStack(ModItems.ARSENIC)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ARSENIC);
                        entries.add(ModItems.POISON_COOKIE);
                        entries.add(ModBlocks.ARSENOPYRITE);

                    }).build());


    public static void registerItemGroups() {
        Experiment.LOGGER.info("Registering Item Groups for " + Experiment.MOD_ID);
    }
}
