package net.ppllaayyeerrr.mccascade.block;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ppllaayyeerrr.mccascade.MCCascade;
import net.ppllaayyeerrr.mccascade.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MCCascade.java);



    public static final RegistryObject<Block> MOSAIC_TILES = registerBlock("mosaic_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> COLD_MOSAIC_TILES = registerBlock("cold_mosaic_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> WARM_MOSAIC_TILES = registerBlock("warm_mosaic_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> BLOCK_OF_JADE = registerBlock("block_of_jade",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK).sound(SoundType.CALCITE)));

    public static final RegistryObject<Block> JADE_ORE = registerBlock("jade_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE)
                    .requiresCorrectToolForDrops(), UniformInt.of(3,5)));

    public static final RegistryObject<Block> DEEPSLATE_JADE_ORE = registerBlock("deepslate_jade_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_LAPIS_ORE)
                    .requiresCorrectToolForDrops(), UniformInt.of(3,5)));

    public static final RegistryObject<Block> DARK_PRISMARINE_MOTHER_OF_PEARL_INLAY = registerBlock("dark_prismarine_mother_of_pearl_inlay",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PRISMARINE)));
    public static final RegistryObject<Block> DARK_PRISMARINE_MOTHER_OF_PEARL_INLAY_STAIRS = registerBlock("dark_prismarine_mother_of_pearl_inlay_stairs",
            () -> new StairBlock(() -> ModBlocks.DARK_PRISMARINE_MOTHER_OF_PEARL_INLAY.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));
    public static final RegistryObject<Block> DARK_PRISMARINE_MOTHER_OF_PEARL_INLAY_SLAB = registerBlock("dark_prismarine_mother_of_pearl_inlay_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));

    public static final RegistryObject<Block> SHULKER_SHELL_INLAY = registerBlock("shulker_shell_inlay",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS)));
    public static final RegistryObject<Block> SHULKER_SHELL_INLAY_STAIRS = registerBlock("shulker_shell_inlay_stairs",
            () -> new StairBlock(() -> ModBlocks.DARK_PRISMARINE_MOTHER_OF_PEARL_INLAY.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS)));
    public static final RegistryObject<Block> SHULKER_SHELL_INLAY_SLAB = registerBlock("shulker_shell_inlay_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS)));

    public static final RegistryObject<Block> GILDED_BLACKSTONE_BRICKS = registerBlock("gilded_blackstone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final RegistryObject<Block> GILDED_BLACKSTONE_BRICK_STAIRS = registerBlock("gilded_blackstone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.GILDED_BLACKSTONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final RegistryObject<Block> GILDED_BLACKSTONE_BRICK_SLAB = registerBlock("gilded_blackstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)));

    public static final RegistryObject<Block> CHISELED_GILDED_BLACKSTONE = registerBlock("chiseled_gilded_blackstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_POLISHED_BLACKSTONE)));

    public static final RegistryObject<Block> MIXED_COBBLESTONE = registerBlock("mixed_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

    public static final RegistryObject<Block> MIXED_COBBLESTONE_STAIRS = registerBlock("mixed_cobblestone_stairs",
            () -> new StairBlock(() -> ModBlocks.MIXED_COBBLESTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> MIXED_COBBLESTONE_SLAB = registerBlock("mixed_cobblestone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> MIXED_COBBLESTONE_WALL = registerBlock("mixed_cobblestone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));


    public static final RegistryObject<Block> POLISHED_GLOWSTONE = registerBlock("polished_glowstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE)));

    public static final RegistryObject<Block> PETRIFIED_PLANKS = registerBlock("petrified_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> PETRIFIED_FENCE = registerBlock("petrified_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> PETRIFIED_FENCE_GATE = registerBlock("petrified_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.BONE_BLOCK), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> PETRIFIED_WALL = registerBlock("petrified_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> PETRIFIED_STAIRS = registerBlock("petrified_stairs",
            () -> new StairBlock(() -> ModBlocks.PETRIFIED_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> PETRIFIED_SLAB = registerBlock("petrified_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.BONE_BLOCK)));

    public static final RegistryObject<Block> WALNUT_PLANKS = registerBlock("walnut_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));
    public static final RegistryObject<Block> WALNUT_FENCE = registerBlock("walnut_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));
    public static final RegistryObject<Block> WALNUT_FENCE_GATE = registerBlock("walnut_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> WALNUT_STAIRS = registerBlock("walnut_stairs",
            () -> new StairBlock(() -> ModBlocks.WALNUT_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));
    public static final RegistryObject<Block> WALNUT_SLAB = registerBlock("walnut_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));

    //public static final RegistryObject<Block> FLAXEN_LOG = registerBlock("flaxen_log",
    //        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LOG)));
    public static final RegistryObject<Block> FLAXEN_PLANKS = registerBlock("flaxen_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> FLAXEN_FENCE = registerBlock("flaxen_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> FLAXEN_FENCE_GATE = registerBlock("flaxen_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS), SoundEvents.CHERRY_WOOD_FENCE_GATE_OPEN, SoundEvents.CHERRY_WOOD_FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> FLAXEN_STAIRS = registerBlock("flaxen_stairs",
            () -> new StairBlock(() -> ModBlocks.FLAXEN_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> FLAXEN_SLAB = registerBlock("flaxen_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> FLAXEN_DOOR = registerBlock("flaxen_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).noOcclusion(), BlockSetType.CHERRY));
    public static final RegistryObject<Block> FLAXEN_TRAPDOOR = registerBlock("flaxen_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).noOcclusion(), BlockSetType.CHERRY));
    public static final RegistryObject<Block> FLAXEN_BUTTON = registerBlock("flaxen_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_BUTTON),
                    BlockSetType.CHERRY, 15, true));
    public static final RegistryObject<Block> FLAXEN_PRESSURE_PLATE = registerBlock("flaxen_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.CHERRY_PRESSURE_PLATE),
                    BlockSetType.CHERRY));




    public static final RegistryObject<Block> DAFFODIL = registerBlock("daffodil",
            () -> new FlowerBlock(() -> MobEffects.POISON, 3,
                    BlockBehaviour.Properties.copy(Blocks.BLUE_ORCHID).noOcclusion().noCollission()));
    public static final RegistryObject<Block> POTTED_DAFFODIL = BLOCKS.register("potted_daffodil",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.DAFFODIL,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_BLUE_ORCHID).noOcclusion()));

    public static final RegistryObject<Block> COLUMBINE = registerBlock("columbine",
            () -> new FlowerBlock(() -> MobEffects.SLOW_FALLING, 10,
                    BlockBehaviour.Properties.copy(Blocks.BLUE_ORCHID).noOcclusion().noCollission()));
    public static final RegistryObject<Block> POTTED_COLUMBINE = BLOCKS.register("potted_columbine",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.COLUMBINE,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_BLUE_ORCHID).noOcclusion()));

    public static final RegistryObject<Block> ZINNIA = registerBlock("zinnia",
            () -> new FlowerBlock(() -> MobEffects.INVISIBILITY, 8,
                    BlockBehaviour.Properties.copy(Blocks.BLUE_ORCHID).noOcclusion().noCollission()));
    public static final RegistryObject<Block> POTTED_ZINNIA = BLOCKS.register("potted_zinnia",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.ZINNIA,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_BLUE_ORCHID).noOcclusion()));

    public static final RegistryObject<Block> UMBRAL_ORCHID = registerBlock("umbral_orchid",
            () -> new FlowerBlock(() -> MobEffects.DARKNESS, 15,
                    BlockBehaviour.Properties.copy(Blocks.BLUE_ORCHID).noOcclusion().noCollission()));
    public static final RegistryObject<Block> POTTED_UMBRAL_ORCHID = BLOCKS.register("potted_umbral_orchid",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.UMBRAL_ORCHID,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_BLUE_ORCHID).noOcclusion()));

    public static final RegistryObject<Block> WHITE_CLOVER = registerBlock("white_clover",
            () -> new FlowerBlock(() -> MobEffects.SATURATION, 1,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION).noOcclusion().noCollission()));
    public static final RegistryObject<Block> POTTED_WHITE_CLOVER = BLOCKS.register("potted_white_clover",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.WHITE_CLOVER,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }



    private static  <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
