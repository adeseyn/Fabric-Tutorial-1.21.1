package net.adeseyn.tutorialmod.item;

import net.adeseyn.tutorialmod.TutorialMod;
import net.adeseyn.tutorialmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup JESUS_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "jesus_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.JESUS_FEET))
                    .displayName(Text.translatable("itemgroup.tutorialmod.jesus_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.JESUS_FEET);
                        entries.add(ModItems.CRUCIFIX);

                    }).build());
    public static final ItemGroup JESUS_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "jesus_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.HOLY_BLOCK))
                    .displayName(Text.translatable("itemgroup.tutorialmod.jesus_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.HOLY_BLOCK);
                        entries.add(ModBlocks.CURSED_BLOCK);

                    }).build());

    public static void registerItemGroups(){
        TutorialMod.LOGGER.info("Registering Item Groups for " + TutorialMod.MOD_ID);
    }
}
