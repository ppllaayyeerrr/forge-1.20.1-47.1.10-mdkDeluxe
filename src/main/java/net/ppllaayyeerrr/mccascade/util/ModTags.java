package net.ppllaayyeerrr.mccascade.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.ppllaayyeerrr.mccascade.MCCascade;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> POTTERY_VIABLE = tag("pottery_viable");

        private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(MCCascade.java, name));
        }
    }

    public static class Items {

    }
}
