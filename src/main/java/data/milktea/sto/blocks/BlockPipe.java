package data.milktea.sto.blocks;

import data.milktea.sto.ShopToOutlet;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockPipe extends BlockBase
{
    public static final AxisAlignedBB PIPE_AABB = new AxisAlignedBB(0D, (double) 3 / 16, (double) 5 / 16, 1D, (double) 10 / 16, (double) 11 / 16);

    public BlockPipe(String name)
    {
        super(name, Material.CLAY);
    }

    @Override
    public void registerModels()
    {
        ShopToOutlet.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }

    @Override
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state)
    {
        return false;
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return PIPE_AABB;
    }
}
