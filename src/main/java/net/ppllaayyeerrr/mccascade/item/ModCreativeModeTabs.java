package net.ppllaayyeerrr.mccascade.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.ppllaayyeerrr.mccascade.MCCascade;
import net.ppllaayyeerrr.mccascade.block.ModBlocks;

public class ModCreativeModeTabs {
public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MCCascade.java);

public static final RegistryObject<CreativeModeTab> CASCADE_TAB = CREATIVE_MODE_TABS.register("cascade_tab",
        () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.JADE.get()))
                .title(Component.translatable("creativetab.cascade_tab"))
                .displayItems((itemDisplayParameters, output) -> {
                    output.accept(ModItems.JADE.get());
                    output.accept(ModItems.LOTUS_STEM.get());
                    output.accept(ModBlocks.MOSAIC_TILES.get());
                    output.accept(ModBlocks.COLD_MOSAIC_TILES.get());
                    output.accept(ModBlocks.WARM_MOSAIC_TILES.get());
                    output.accept(ModBlocks.BLOCK_OF_JADE.get());
                    output.accept(ModBlocks.JADE_ORE.get());
                    output.accept(ModBlocks.DEEPSLATE_JADE_ORE.get());

                    output.accept(ModBlocks.DARK_PRISMARINE_MOTHER_OF_PEARL_INLAY.get());
                    output.accept(ModBlocks.DARK_PRISMARINE_MOTHER_OF_PEARL_INLAY_STAIRS.get());
                    output.accept(ModBlocks.DARK_PRISMARINE_MOTHER_OF_PEARL_INLAY_SLAB.get());
                    output.accept(ModBlocks.CHISELED_DARK_PRISMARINE_MOTHER_OF_PEARL_INLAY.get());

                    output.accept(ModBlocks.SHULKER_SHELL_INLAY.get());
                    output.accept(ModBlocks.SHULKER_SHELL_INLAY_STAIRS.get());
                    output.accept(ModBlocks.SHULKER_SHELL_INLAY_SLAB.get());
                    output.accept(ModBlocks.CHISELED_SHULKER_SHELL_INLAY.get());

                    output.accept(ModBlocks.MIXED_COBBLESTONE.get());
                    output.accept(ModBlocks.MIXED_COBBLESTONE_STAIRS.get());
                    output.accept(ModBlocks.MIXED_COBBLESTONE_SLAB.get());
                    output.accept(ModBlocks.MIXED_COBBLESTONE_WALL.get());

                    output.accept(ModBlocks.POLISHED_GLOWSTONE.get());
                    output.accept(ModBlocks.GILDED_BLACKSTONE_BRICKS.get());
                    output.accept(ModBlocks.GILDED_BLACKSTONE_BRICK_STAIRS.get());
                    output.accept(ModBlocks.GILDED_BLACKSTONE_BRICK_SLAB.get());
                    output.accept(ModBlocks.CHISELED_GILDED_BLACKSTONE.get());

                    output.accept(ModBlocks.PETRIFIED_PLANKS.get());
                    output.accept(ModBlocks.PETRIFIED_STAIRS.get());
                    output.accept(ModBlocks.PETRIFIED_SLAB.get());
                    output.accept(ModBlocks.PETRIFIED_WALL.get());
                    output.accept(ModBlocks.PETRIFIED_FENCE.get());
                    output.accept(ModBlocks.PETRIFIED_FENCE_GATE.get());

                    output.accept(ModBlocks.WALNUT_PLANKS.get());
                    output.accept(ModBlocks.WALNUT_STAIRS.get());
                    output.accept(ModBlocks.WALNUT_SLAB.get());
                    output.accept(ModBlocks.WALNUT_FENCE.get());
                    output.accept(ModBlocks.WALNUT_FENCE_GATE.get());
                    output.accept(ModBlocks.WALNUT_DOOR.get());
                    output.accept(ModBlocks.WALNUT_TRAPDOOR.get());

                    output.accept(ModBlocks.FLAXEN_PLANKS.get());
                    output.accept(ModBlocks.FLAXEN_STAIRS.get());
                    output.accept(ModBlocks.FLAXEN_SLAB.get());
                    output.accept(ModBlocks.FLAXEN_FENCE.get());
                    output.accept(ModBlocks.FLAXEN_FENCE_GATE.get());
                    output.accept(ModBlocks.FLAXEN_DOOR.get());
                    output.accept(ModBlocks.FLAXEN_TRAPDOOR.get());
                    output.accept(ModBlocks.FLAXEN_BUTTON.get());
                    output.accept(ModBlocks.FLAXEN_PRESSURE_PLATE.get());

                    output.accept(ModBlocks.ZINNIA.get());
                    output.accept(ModBlocks.DAFFODIL.get());
                    output.accept(ModBlocks.COLUMBINE.get());
                    output.accept(ModBlocks.WHITE_CLOVER.get());
                    output.accept(ModBlocks.UMBRAL_ORCHID.get());
                })
                .build());

public static void register(IEventBus eventBus) {
    CREATIVE_MODE_TABS.register(eventBus);
}
}
