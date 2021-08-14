package data.milktea.sto.items;

import data.milktea.sto.ShopToOutlet;
import data.milktea.sto.inits.ModItems;
import data.milktea.sto.proxy.ClientProxy;
import data.milktea.sto.utils.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
    public ItemBase(String name)
    {
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(CreativeTabs.FOOD);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels()
    {
        ShopToOutlet.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
