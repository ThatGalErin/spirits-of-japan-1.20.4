package net.erin.soj.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.BowItem;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.erin.soj.SpiritsOfJapan;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;


public class ModItems {
    public static final Item CHOCHINOBAKE = registerItem("chochinobake", new Item(new FabricItemSettings()));
    public static final Item LONGBOW = registerItem("longbow", new BowItem(new FabricItemSettings().maxDamage(300)));
    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {

        //entries.add(CHOCHINOBAKE);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SpiritsOfJapan.MOD_ID, name), item);
    }
    public static void registerModItems() {
            SpiritsOfJapan.LOGGER.info("Register mod items for " + SpiritsOfJapan.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);

    }
}
