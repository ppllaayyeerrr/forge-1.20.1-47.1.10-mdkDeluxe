package net.ppllaayyeerrr.mccascade;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.ppllaayyeerrr.mccascade.block.ModBlocks;
import net.ppllaayyeerrr.mccascade.item.ModCreativeModeTabs;
import net.ppllaayyeerrr.mccascade.item.ModItems;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MCCascade.java)
public class MCCascade
{
    // Define mod id in a common place for everything to reference
    public static final String java = "mccascade";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    public MCCascade()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);

        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);


        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);


    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.DAFFODIL.getId(), ModBlocks.POTTED_DAFFODIL);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.COLUMBINE.getId(), ModBlocks.POTTED_COLUMBINE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.ZINNIA.getId(), ModBlocks.POTTED_ZINNIA);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.UMBRAL_ORCHID.getId(), ModBlocks.POTTED_UMBRAL_ORCHID);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.WHITE_CLOVER.getId(), ModBlocks.POTTED_WHITE_CLOVER);
        });

    }

    // Add the example block item to the building blocks tab
     private void addCreative(BuildCreativeModeTabContentsEvent event)
     {
     //   if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
     //       event.accept(ModItems.JADE);
     //       event.accept(ModItems.LOTUS_STEM);
     //   }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = java, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
