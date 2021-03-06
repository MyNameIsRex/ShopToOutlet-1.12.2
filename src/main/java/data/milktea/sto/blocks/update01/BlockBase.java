package data.milktea.sto.blocks.update01;

import data.milktea.sto.ShopToOutlet;
import data.milktea.sto.inits.ModBlocks;
import data.milktea.sto.inits.ModItems;
import data.milktea.sto.utils.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{
    public BlockBase(String name, Material material)
    {
        super(material);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(ShopToOutlet.STO_TAB);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels()
    {
        ShopToOutlet.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
