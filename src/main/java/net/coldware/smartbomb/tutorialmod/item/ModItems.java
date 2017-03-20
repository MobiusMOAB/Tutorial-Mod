package net.coldware.smartbomb.tutorialmod.item;

import net.coldware.smartbomb.tutorialmod.TutorialMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by MobiusMOAB on 3/19/2017.
 */
public class ModItems {

    public static Item tutorialItem;

    public static void preInit() {

        tutorialItem = new Item().setUnlocalizedName("tutorial_item").setCreativeTab(TutorialMod.tabTutorial);

        registerItems();
    }

    public static void registerItems() {
        GameRegistry.register(tutorialItem, new ResourceLocation(TutorialMod.MODID, "tutorial_item"));
    }

    public static void registerRenders() {
        registerRender(tutorialItem);
    }

    public static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(TutorialMod.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
