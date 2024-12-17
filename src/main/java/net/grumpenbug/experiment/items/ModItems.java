package net.grumpenbug.experiment.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.grumpenbug.experiment.Experiment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

// item registration
public class ModItems {
    public static final Item POISON_COOKIE = registerItem("poison_cookie", new Item(new FabricItemSettings()));
    public static final Item ARSENIC = registerItem("arsenic", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(POISON_COOKIE);
        entries.add(ARSENIC);
    }





// function used to help register items
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Experiment.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Experiment.LOGGER.info("Registering mod items for " + Experiment.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
