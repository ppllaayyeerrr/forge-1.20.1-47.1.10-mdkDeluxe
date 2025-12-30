package net.ppllaayyeerrr.mccascade.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;
import net.ppllaayyeerrr.mccascade.block.ModBlocks;
import net.ppllaayyeerrr.mccascade.item.ModItems;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.MOSAIC_TILES.get());

        this.dropSelf(ModBlocks.MIXED_COBBLESTONE.get());
        this.dropSelf(ModBlocks.MIXED_COBBLESTONE_STAIRS.get());
        this.add(ModBlocks.MIXED_COBBLESTONE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.MIXED_COBBLESTONE_SLAB.get()));
        this.dropSelf(ModBlocks.MIXED_COBBLESTONE_WALL.get());

        this.dropSelf(ModBlocks.BLOCK_OF_JADE.get());
        this.dropSelf(ModBlocks.WARM_MOSAIC_TILES.get());
        this.dropSelf(ModBlocks.COLD_MOSAIC_TILES.get());
        this.dropSelf(ModBlocks.POLISHED_GLOWSTONE.get());

        this.dropSelf(ModBlocks.DARK_PRISMARINE_MOTHER_OF_PEARL_INLAY.get());
        this.dropSelf(ModBlocks.DARK_PRISMARINE_MOTHER_OF_PEARL_INLAY_STAIRS.get());
        this.add(ModBlocks.DARK_PRISMARINE_MOTHER_OF_PEARL_INLAY_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.DARK_PRISMARINE_MOTHER_OF_PEARL_INLAY_SLAB.get()));
        this.dropSelf(ModBlocks.CHISELED_DARK_PRISMARINE_MOTHER_OF_PEARL_INLAY.get());

        this.dropSelf(ModBlocks.SHULKER_SHELL_INLAY.get());
        this.dropSelf(ModBlocks.SHULKER_SHELL_INLAY_STAIRS.get());
        this.add(ModBlocks.SHULKER_SHELL_INLAY_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.SHULKER_SHELL_INLAY_SLAB.get()));
        this.dropSelf(ModBlocks.CHISELED_SHULKER_SHELL_INLAY.get());

        this.dropSelf(ModBlocks.GILDED_BLACKSTONE_BRICKS.get());
        this.dropSelf(ModBlocks.GILDED_BLACKSTONE_BRICK_STAIRS.get());
        this.add(ModBlocks.GILDED_BLACKSTONE_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.GILDED_BLACKSTONE_BRICK_SLAB.get()));
        this.dropSelf(ModBlocks.CHISELED_GILDED_BLACKSTONE.get());

        this.dropSelf(ModBlocks.PETRIFIED_PLANKS.get());
        this.dropSelf(ModBlocks.PETRIFIED_STAIRS.get());
        this.add(ModBlocks.PETRIFIED_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.PETRIFIED_SLAB.get()));
        this.dropSelf(ModBlocks.PETRIFIED_WALL.get());
        this.dropSelf(ModBlocks.PETRIFIED_FENCE.get());
        this.dropSelf(ModBlocks.PETRIFIED_FENCE_GATE.get());

        this.dropSelf(ModBlocks.WALNUT_PLANKS.get());
        this.dropSelf(ModBlocks.WALNUT_STAIRS.get());
        this.add(ModBlocks.WALNUT_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.WALNUT_SLAB.get()));
        this.dropSelf(ModBlocks.WALNUT_FENCE.get());
        this.dropSelf(ModBlocks.WALNUT_FENCE_GATE.get());

        this.dropSelf(ModBlocks.FLAXEN_PLANKS.get());
        this.dropSelf(ModBlocks.FLAXEN_STAIRS.get());
        this.add(ModBlocks.FLAXEN_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.FLAXEN_SLAB.get()));
        this.add(ModBlocks.FLAXEN_DOOR.get(),
                block -> createDoorTable(ModBlocks.FLAXEN_DOOR.get()));
        this.dropSelf(ModBlocks.FLAXEN_FENCE.get());
        this.dropSelf(ModBlocks.FLAXEN_FENCE_GATE.get());
        this.dropSelf(ModBlocks.FLAXEN_TRAPDOOR.get());
        this.dropSelf(ModBlocks.FLAXEN_BUTTON.get());
        this.dropSelf(ModBlocks.FLAXEN_PRESSURE_PLATE.get());

        this.add(ModBlocks.JADE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.JADE_ORE.get(), ModItems.JADE.get()));
        this.add(ModBlocks.DEEPSLATE_JADE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_JADE_ORE.get(), ModItems.JADE.get()));

        this.dropSelf(ModBlocks.DAFFODIL.get());
        this.add(ModBlocks.POTTED_DAFFODIL.get(), createPotFlowerItemTable(ModBlocks.DAFFODIL.get()));
        this.dropSelf(ModBlocks.COLUMBINE.get());
        this.add(ModBlocks.POTTED_COLUMBINE.get(), createPotFlowerItemTable(ModBlocks.COLUMBINE.get()));
        this.dropSelf(ModBlocks.ZINNIA.get());
        this.add(ModBlocks.POTTED_ZINNIA.get(), createPotFlowerItemTable(ModBlocks.ZINNIA.get()));
        this.dropSelf(ModBlocks.UMBRAL_ORCHID.get());
        this.add(ModBlocks.POTTED_UMBRAL_ORCHID.get(), createPotFlowerItemTable(ModBlocks.UMBRAL_ORCHID.get()));
        this.dropSelf(ModBlocks.WHITE_CLOVER.get());
        this.add(ModBlocks.POTTED_WHITE_CLOVER.get(), createPotFlowerItemTable(ModBlocks.WHITE_CLOVER.get()));
    }

    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

}
