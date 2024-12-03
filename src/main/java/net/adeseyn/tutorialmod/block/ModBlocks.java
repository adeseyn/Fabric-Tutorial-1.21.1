package net.adeseyn.tutorialmod.block;

import net.adeseyn.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {


    public static final Block HOLY_BLOCK = registerBlock("holy_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(6)
                    .requiresTool()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK).
                    luminance(state -> 15)));

    public static final Block CURSED_BLOCK = registerBlock("cursed_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(6)
                    .requiresTool()
                    .sounds(BlockSoundGroup.HEAVY_CORE)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(TutorialMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        TutorialMod.LOGGER.info("Registering Mod Blocks for " + TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.HOLY_BLOCK);
            fabricItemGroupEntries.add(ModBlocks.CURSED_BLOCK);
        });

    }
}
