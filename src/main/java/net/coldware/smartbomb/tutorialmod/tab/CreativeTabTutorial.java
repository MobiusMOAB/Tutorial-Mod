package net.coldware.smartbomb.tutorialmod.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * Created by MobiusMOAB on 3/19/2017.
 */
public class CreativeTabTutorial extends CreativeTabs {

    public CreativeTabTutorial(int index, String label) {
        super(index, label);
    }

    @Override
    public Item getTabIconItem() {
        return Items.ITEM_FRAME;
    }
}
