package data.milktea.sto.blocks.update01;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockPipeSided extends BlockPipe
{
    public static final AxisAlignedBB NORTH, SOUTH, EAST, WEST;

    static
    {
        NORTH = new AxisAlignedBB(0D, (double) 5 / 16, 0D, 1D, (double) 11 / 16, (double) 11 / 16);
        EAST = new AxisAlignedBB((double) 5 / 16, (double) 5 / 16, 0D, 1D, (double) 11 / 16, 1D);
        SOUTH = new AxisAlignedBB(0D, (double) 5 / 16, (double) 5 / 16, 1D, (double) 11 / 16, 1D);
        WEST = new AxisAlignedBB(0D, (double) 5 / 16, 0D, (double) 11 / 16, (double) 11 / 16, 1D);
    }

    public BlockPipeSided(String name)
    {
        super(name);
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        switch((EnumFacing) state.getValue(FACING))
        {
            case EAST:
                return EAST;
            case SOUTH:
                return SOUTH;
            case WEST:
                return WEST;
            default:
                return NORTH;
        }
    }
}
