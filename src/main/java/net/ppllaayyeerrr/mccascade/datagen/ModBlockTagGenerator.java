package net.ppllaayyeerrr.mccascade.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.ppllaayyeerrr.mccascade.MCCascade;
import net.ppllaayyeerrr.mccascade.block.ModBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MCCascade.java, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.JADE_ORE.get(),
                    ModBlocks.BLOCK_OF_JADE.get(),
                    ModBlocks.DEEPSLATE_JADE_ORE.get(),

                    ModBlocks.PETRIFIED_PLANKS.get(),
                    ModBlocks.PETRIFIED_STAIRS.get(),
                    ModBlocks.PETRIFIED_SLAB.get(),
                    ModBlocks.PETRIFIED_WALL.get(),
                    ModBlocks.PETRIFIED_FENCE.get(),
                    ModBlocks.PETRIFIED_FENCE_GATE.get(),

                    ModBlocks.MOSAIC_TILES.get(),
                    ModBlocks.WARM_MOSAIC_TILES.get(),
                    ModBlocks.COLD_MOSAIC_TILES.get(),

                    ModBlocks.MIXED_COBBLESTONE.get(),
                    ModBlocks.MIXED_COBBLESTONE_STAIRS.get(),
                    ModBlocks.MIXED_COBBLESTONE_SLAB.get(),
                    ModBlocks.MIXED_COBBLESTONE_WALL.get(),

                    ModBlocks.GILDED_BLACKSTONE_BRICKS.get(),
                    ModBlocks.GILDED_BLACKSTONE_BRICK_STAIRS.get(),
                    ModBlocks.GILDED_BLACKSTONE_BRICK_SLAB.get(),
                    ModBlocks.CHISELED_GILDED_BLACKSTONE.get(),

                    ModBlocks.DARK_PRISMARINE_MOTHER_OF_PEARL_INLAY.get(),
                    ModBlocks.DARK_PRISMARINE_MOTHER_OF_PEARL_INLAY_STAIRS.get(),
                    ModBlocks.DARK_PRISMARINE_MOTHER_OF_PEARL_INLAY_SLAB.get(),

                    ModBlocks.SHULKER_SHELL_INLAY.get(),
                    ModBlocks.SHULKER_SHELL_INLAY_STAIRS.get(),
                    ModBlocks.SHULKER_SHELL_INLAY_SLAB.get(),
                    ModBlocks.CHISELED_SHULKER_SHELL_INLAY.get()
                );


        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.JADE_ORE.get(),
                ModBlocks.BLOCK_OF_JADE.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.DEEPSLATE_JADE_ORE.get());

        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL);


        this.tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.WALNUT_PLANKS.get(),
                        ModBlocks.FLAXEN_PLANKS.get()
                );

        this.tag(BlockTags.FENCES)
                .add(ModBlocks.PETRIFIED_FENCE.get(),
                ModBlocks.WALNUT_FENCE.get(),
                ModBlocks.FLAXEN_FENCE.get());
        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.PETRIFIED_FENCE_GATE.get(),
                        ModBlocks.WALNUT_FENCE_GATE.get(),
                        ModBlocks.FLAXEN_FENCE_GATE.get());
        this.tag(BlockTags.WALLS)
                .add(ModBlocks.PETRIFIED_WALL.get(),
                ModBlocks.MIXED_COBBLESTONE_WALL.get());
        this.tag(BlockTags.BUTTONS)
                .add(ModBlocks.FLAXEN_BUTTON.get()
                        );
        this.tag(BlockTags.PLANKS)
                .add(ModBlocks.FLAXEN_PLANKS.get(),
                ModBlocks.WALNUT_PLANKS.get(),
                ModBlocks.PETRIFIED_PLANKS.get()
                );
    }
}
