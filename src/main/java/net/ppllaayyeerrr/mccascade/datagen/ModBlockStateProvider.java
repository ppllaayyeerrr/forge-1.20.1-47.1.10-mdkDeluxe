package net.ppllaayyeerrr.mccascade.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.ppllaayyeerrr.mccascade.MCCascade;
import net.ppllaayyeerrr.mccascade.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MCCascade.java, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.BLOCK_OF_JADE);
        blockWithItem(ModBlocks.JADE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_JADE_ORE);

        blockWithItem(ModBlocks.MIXED_COBBLESTONE);
        stairsBlock(((StairBlock) ModBlocks.MIXED_COBBLESTONE_STAIRS.get()), blockTexture(ModBlocks.MIXED_COBBLESTONE.get()));
        slabBlock(((SlabBlock) ModBlocks.MIXED_COBBLESTONE_SLAB.get()), blockTexture(ModBlocks.MIXED_COBBLESTONE.get()), blockTexture(ModBlocks.MIXED_COBBLESTONE.get()));
        wallBlock(((WallBlock) ModBlocks.MIXED_COBBLESTONE_WALL.get()), blockTexture(ModBlocks.MIXED_COBBLESTONE.get()));

        blockWithItem(ModBlocks.MOSAIC_TILES);
        blockWithItem(ModBlocks.COLD_MOSAIC_TILES);
        blockWithItem(ModBlocks.WARM_MOSAIC_TILES);

        blockWithItem(ModBlocks.DARK_PRISMARINE_MOTHER_OF_PEARL_INLAY);
        stairsBlock(((StairBlock) ModBlocks.DARK_PRISMARINE_MOTHER_OF_PEARL_INLAY_STAIRS.get()), blockTexture(ModBlocks.DARK_PRISMARINE_MOTHER_OF_PEARL_INLAY.get()));
        slabBlock(((SlabBlock) ModBlocks.DARK_PRISMARINE_MOTHER_OF_PEARL_INLAY_SLAB.get()), blockTexture(ModBlocks.DARK_PRISMARINE_MOTHER_OF_PEARL_INLAY.get()), blockTexture(ModBlocks.DARK_PRISMARINE_MOTHER_OF_PEARL_INLAY.get()));
        blockWithItem(ModBlocks.CHISELED_DARK_PRISMARINE_MOTHER_OF_PEARL_INLAY);

        blockWithItem(ModBlocks.SHULKER_SHELL_INLAY);
        stairsBlock(((StairBlock) ModBlocks.SHULKER_SHELL_INLAY_STAIRS.get()), blockTexture(ModBlocks.SHULKER_SHELL_INLAY.get()));
        slabBlock(((SlabBlock) ModBlocks.SHULKER_SHELL_INLAY_SLAB.get()), blockTexture(ModBlocks.SHULKER_SHELL_INLAY.get()), blockTexture(ModBlocks.SHULKER_SHELL_INLAY.get()));
        blockWithItem(ModBlocks.CHISELED_SHULKER_SHELL_INLAY);

        blockWithItem(ModBlocks.POLISHED_GLOWSTONE);

        blockWithItem(ModBlocks.GILDED_BLACKSTONE_BRICKS);
        stairsBlock(((StairBlock) ModBlocks.GILDED_BLACKSTONE_BRICK_STAIRS.get()), blockTexture(ModBlocks.GILDED_BLACKSTONE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.GILDED_BLACKSTONE_BRICK_SLAB.get()), blockTexture(ModBlocks.GILDED_BLACKSTONE_BRICKS.get()), blockTexture(ModBlocks.GILDED_BLACKSTONE_BRICKS.get()));
        blockWithItem(ModBlocks.CHISELED_GILDED_BLACKSTONE);

        blockWithItem(ModBlocks.PETRIFIED_PLANKS);
        wallBlock(((WallBlock) ModBlocks.PETRIFIED_WALL.get()), blockTexture(ModBlocks.PETRIFIED_PLANKS.get()));
        stairsBlock(((StairBlock) ModBlocks.PETRIFIED_STAIRS.get()), blockTexture(ModBlocks.PETRIFIED_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.PETRIFIED_SLAB.get()), blockTexture(ModBlocks.PETRIFIED_PLANKS.get()), blockTexture(ModBlocks.PETRIFIED_PLANKS.get()));
        fenceBlock(((FenceBlock) ModBlocks.PETRIFIED_FENCE.get()), blockTexture(ModBlocks.PETRIFIED_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.PETRIFIED_FENCE_GATE.get()), blockTexture(ModBlocks.PETRIFIED_PLANKS.get()));

        blockWithItem(ModBlocks.WALNUT_PLANKS);
        stairsBlock(((StairBlock) ModBlocks.WALNUT_STAIRS.get()), blockTexture(ModBlocks.WALNUT_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.WALNUT_SLAB.get()), blockTexture(ModBlocks.WALNUT_PLANKS.get()), blockTexture(ModBlocks.WALNUT_PLANKS.get()));
        fenceBlock(((FenceBlock) ModBlocks.WALNUT_FENCE.get()), blockTexture(ModBlocks.WALNUT_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.WALNUT_FENCE_GATE.get()), blockTexture(ModBlocks.WALNUT_PLANKS.get()));
        doorBlockWithRenderType(((DoorBlock) ModBlocks.WALNUT_DOOR.get()), modLoc("block/walnut_door_bottom"), modLoc("block/walnut_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.WALNUT_TRAPDOOR.get()), modLoc("block/walnut_trapdoor"), true, "cutout");

        blockWithItem(ModBlocks.FLAXEN_PLANKS);
        stairsBlock(((StairBlock) ModBlocks.FLAXEN_STAIRS.get()), blockTexture(ModBlocks.FLAXEN_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.FLAXEN_SLAB.get()), blockTexture(ModBlocks.FLAXEN_PLANKS.get()), blockTexture(ModBlocks.FLAXEN_PLANKS.get()));
        fenceBlock(((FenceBlock) ModBlocks.FLAXEN_FENCE.get()), blockTexture(ModBlocks.FLAXEN_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.FLAXEN_FENCE_GATE.get()), blockTexture(ModBlocks.FLAXEN_PLANKS.get()));
        doorBlockWithRenderType(((DoorBlock) ModBlocks.FLAXEN_DOOR.get()), modLoc("block/flaxen_door_bottom"), modLoc("block/flaxen_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.FLAXEN_TRAPDOOR.get()), modLoc("block/flaxen_trapdoor"), true, "cutout");
        buttonBlock(((ButtonBlock) ModBlocks.FLAXEN_BUTTON.get()), blockTexture(ModBlocks.FLAXEN_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.FLAXEN_PRESSURE_PLATE.get()), blockTexture(ModBlocks.FLAXEN_PLANKS.get()));

        simpleBlockWithItem(ModBlocks.DAFFODIL.get(), models().cross(blockTexture(ModBlocks.DAFFODIL.get()).getPath(),
                blockTexture(ModBlocks.DAFFODIL.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_DAFFODIL.get(), models().singleTexture("potted_daffodil", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.DAFFODIL.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.COLUMBINE.get(), models().cross(blockTexture(ModBlocks.COLUMBINE.get()).getPath(),
                blockTexture(ModBlocks.COLUMBINE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_COLUMBINE.get(), models().singleTexture("potted_columbine", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.COLUMBINE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.ZINNIA.get(), models().cross(blockTexture(ModBlocks.ZINNIA.get()).getPath(),
                blockTexture(ModBlocks.ZINNIA.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_ZINNIA.get(), models().singleTexture("potted_zinnia", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.ZINNIA.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.UMBRAL_ORCHID.get(), models().cross(blockTexture(ModBlocks.UMBRAL_ORCHID.get()).getPath(),
                blockTexture(ModBlocks.UMBRAL_ORCHID.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_UMBRAL_ORCHID.get(), models().singleTexture("potted_umbral_orchid", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.UMBRAL_ORCHID.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.WHITE_CLOVER.get(), models().cross(blockTexture(ModBlocks.WHITE_CLOVER.get()).getPath(),
                blockTexture(ModBlocks.WHITE_CLOVER.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_WHITE_CLOVER.get(), models().singleTexture("potted_white_clover", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.WHITE_CLOVER.get())).renderType("cutout"));




    }
    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
