package net.coldware.smartbomb.tutorialmod.proxy;

import net.coldware.smartbomb.tutorialmod.item.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by MobiusMOAB on 3/19/2017.
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Override
    public void init(FMLInitializationEvent event) {
        ModItems.registerRenders();
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {

    }

}
