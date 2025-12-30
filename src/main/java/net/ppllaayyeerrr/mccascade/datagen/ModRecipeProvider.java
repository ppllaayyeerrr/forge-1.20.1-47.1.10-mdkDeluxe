package net.ppllaayyeerrr.mccascade.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.ppllaayyeerrr.mccascade.MCCascade;
import net.ppllaayyeerrr.mccascade.block.ModBlocks;
import net.ppllaayyeerrr.mccascade.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> JADE_SMELTABLES =List.of(
            ModBlocks.JADE_ORE.get(), ModBlocks.DEEPSLATE_JADE_ORE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        oreBlasting(pWriter, JADE_SMELTABLES, RecipeCategory.MISC, ModItems.JADE.get(), 0.7f, 100,
                "jade");
        oreSmelting(pWriter, JADE_SMELTABLES, RecipeCategory.MISC, ModItems.JADE.get(), 0.7f, 200,
                "jade");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_PRISMARINE_MOTHER_OF_PEARL_INLAY.get(), 8)
                .pattern("ppp")
                .pattern("p#p")
                .pattern("ppp")
                .define('#', Items.NAUTILUS_SHELL)
                .define('p', Items.DARK_PRISMARINE)
                .unlockedBy(getHasName(Items.NAUTILUS_SHELL), has(Items.NAUTILUS_SHELL))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SHULKER_SHELL_INLAY.get(), 8)
                .pattern("eee")
                .pattern("e#e")
                .pattern("eee")
                .define('#', Items.SHULKER_SHELL)
                .define('e', Items.END_STONE_BRICKS)
                .unlockedBy(getHasName(Items.SHULKER_SHELL), has(Items.SHULKER_SHELL))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLOCK_OF_JADE.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.JADE.get())
                .unlockedBy(getHasName(ModItems.JADE.get()), has(ModItems.JADE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GILDED_BLACKSTONE_BRICKS.get(), 8)
                .pattern("###")
                .pattern("#g#")
                .pattern("###")
                .define('#', Items.POLISHED_BLACKSTONE_BRICKS)
                .define('g', Items.GOLD_NUGGET)
                .unlockedBy(getHasName(Items.POLISHED_BLACKSTONE_BRICKS), has(Items.POLISHED_BLACKSTONE_BRICKS))
                .save(pWriter);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.JADE.get(), 9)
                .requires(ModBlocks.BLOCK_OF_JADE.get())
                .unlockedBy(getHasName(ModBlocks.BLOCK_OF_JADE.get()), has(ModBlocks.BLOCK_OF_JADE.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.YELLOW_DYE)
                .requires(ModBlocks.DAFFODIL.get())
                .unlockedBy(getHasName(ModBlocks.DAFFODIL.get()), has(ModBlocks.DAFFODIL.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.PURPLE_DYE)
                .requires(ModBlocks.COLUMBINE.get())
                .unlockedBy(getHasName(ModBlocks.COLUMBINE.get()), has(ModBlocks.COLUMBINE.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.ORANGE_DYE)
                .requires(ModBlocks.ZINNIA.get())
                .unlockedBy(getHasName(ModBlocks.ZINNIA.get()), has(ModBlocks.ZINNIA.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.BLACK_DYE)
                .requires(ModBlocks.UMBRAL_ORCHID.get())
                .unlockedBy(getHasName(ModBlocks.UMBRAL_ORCHID.get()), has(ModBlocks.UMBRAL_ORCHID.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.WHITE_DYE)
                .requires(ModBlocks.WHITE_CLOVER.get())
                .unlockedBy(getHasName(ModBlocks.WHITE_CLOVER.get()), has(ModBlocks.WHITE_CLOVER.get()))
                .save(pWriter);

    }
    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                    pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer,  MCCascade.java + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }
}
