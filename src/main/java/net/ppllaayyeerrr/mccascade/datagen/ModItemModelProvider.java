package net.ppllaayyeerrr.mccascade.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ppllaayyeerrr.mccascade.MCCascade;
import net.ppllaayyeerrr.mccascade.block.ModBlocks;
import net.ppllaayyeerrr.mccascade.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MCCascade.java, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.JADE);
        simpleItem(ModItems.LOTUS_STEM);

        fenceItem(ModBlocks.PETRIFIED_FENCE, ModBlocks.PETRIFIED_PLANKS);
        fenceItem(ModBlocks.WALNUT_FENCE, ModBlocks.WALNUT_PLANKS);
        fenceItem(ModBlocks.FLAXEN_FENCE, ModBlocks.FLAXEN_PLANKS);
        wallItem(ModBlocks.PETRIFIED_WALL, ModBlocks.PETRIFIED_PLANKS);
        wallItem(ModBlocks.MIXED_COBBLESTONE_WALL, ModBlocks.MIXED_COBBLESTONE);
        buttonItem(ModBlocks.FLAXEN_BUTTON, ModBlocks.FLAXEN_PLANKS);

        simpleBlockItemBlockTexture(ModBlocks.DAFFODIL);
        simpleBlockItemBlockTexture(ModBlocks.COLUMBINE);
        simpleBlockItemBlockTexture(ModBlocks.ZINNIA);
        simpleBlockItemBlockTexture(ModBlocks.UMBRAL_ORCHID);
        simpleBlockItemBlockTexture(ModBlocks.WHITE_CLOVER);

        simpleBlockItem(ModBlocks.FLAXEN_DOOR);

        evenSimplerBlockItem(ModBlocks.MIXED_COBBLESTONE_STAIRS);
        evenSimplerBlockItem(ModBlocks.MIXED_COBBLESTONE_SLAB);
        evenSimplerBlockItem(ModBlocks.DARK_PRISMARINE_MOTHER_OF_PEARL_INLAY_STAIRS);
        evenSimplerBlockItem(ModBlocks.DARK_PRISMARINE_MOTHER_OF_PEARL_INLAY_SLAB);
        evenSimplerBlockItem(ModBlocks.SHULKER_SHELL_INLAY_STAIRS);
        evenSimplerBlockItem(ModBlocks.SHULKER_SHELL_INLAY_SLAB);
        evenSimplerBlockItem(ModBlocks.GILDED_BLACKSTONE_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.GILDED_BLACKSTONE_BRICK_SLAB);
        evenSimplerBlockItem(ModBlocks.PETRIFIED_STAIRS);
        evenSimplerBlockItem(ModBlocks.PETRIFIED_SLAB);
        evenSimplerBlockItem(ModBlocks.WALNUT_STAIRS);
        evenSimplerBlockItem(ModBlocks.WALNUT_SLAB);
        evenSimplerBlockItem(ModBlocks.FLAXEN_STAIRS);
        evenSimplerBlockItem(ModBlocks.FLAXEN_SLAB);
        evenSimplerBlockItem(ModBlocks.PETRIFIED_FENCE_GATE);
        evenSimplerBlockItem(ModBlocks.WALNUT_FENCE_GATE);
        evenSimplerBlockItem(ModBlocks.FLAXEN_FENCE_GATE);
        evenSimplerBlockItem(ModBlocks.FLAXEN_PRESSURE_PLATE);

        trapdoorItem(ModBlocks.FLAXEN_TRAPDOOR);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MCCascade.java, "item/" + item.getId().getPath()));
    }
    public void evenSimplerBlockItem(RegistryObject<Block> block){
        this.withExistingParent(MCCascade.java + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }
    public void trapdoorItem(RegistryObject<Block> block){
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }

    private ItemModelBuilder simpleBlockItemBlockTexture(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MCCascade.java, "block/" + item.getId().getPath()));
    }
    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture", new ResourceLocation(MCCascade.java, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }
    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture", new ResourceLocation(MCCascade.java, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }
        public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
            this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                    .texture("wall", new ResourceLocation(MCCascade.java, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }
    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MCCascade.java, "item/" + item.getId().getPath()));
    }
}
