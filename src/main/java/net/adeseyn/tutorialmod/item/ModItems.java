package net.adeseyn.tutorialmod.item;

import net.adeseyn.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item JESUS_FEET = registerItem("jesus_feet", new Item(new Item.Settings()));
    public static final Item CRUCIFIX = registerItem("crucifix", new Item(new Item.Settings()));
    public static final Item HOLY_DROP = registerItem("holy_drop", new Item(new Item.Settings()));
    public static final Item CURSED_DROP = registerItem("cursed_drop", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(JESUS_FEET);
            fabricItemGroupEntries.add(CRUCIFIX);
            fabricItemGroupEntries.add(HOLY_DROP);
            fabricItemGroupEntries.add(CURSED_DROP);
        });

    }
}
