package data.milktea.sto.items;

import data.milktea.sto.ShopToOutlet;

public class ItemTeaEgg extends ItemBase
{
    public ItemTeaEgg(String name)
    {
        super(name);
    }

    @Override
    public void registerModels()
    {
        ShopToOutlet.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
