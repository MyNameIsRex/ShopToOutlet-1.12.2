package data.milktea.sto.blocks.update01;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockPipeCrossed extends BlockBase
{
    public BlockPipeCrossed(String name)
    {
        super(name, Material.CLAY);
    }

    @Override
    public boolean isFullCube(IBlockState state)
    {
        return false
    }

    @Override
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return new AxisAlignedBB(0D, (double) 5 / 16, 0D, 1D, (double) 11 / 16, 1D);
    }
}
