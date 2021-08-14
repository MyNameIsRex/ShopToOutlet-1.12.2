package data.milktea.sto.blocks;

import data.milktea.sto.ShopToOutlet;
import data.milktea.sto.inits.ModBlocks;
import data.milktea.sto.inits.ModItems;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockPipe extends BlockBase
{
    public BlockPipe(String name)
    {
        super(name, Material.CLAY);
    }

    @Override
    public void registerModels()
    {
        ShopToOutlet.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
