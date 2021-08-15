package data.milktea.sto.blocks.update01;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockPipeCorner extends BlockPipe
{
    public static final AxisAlignedBB PIPE_CORNER_AABB_SE, PIPE_CORNER_AABB_SW, PIPE_CORNER_AABB_NW, PIPE_CORNER_AABB_NE;

    static
    {
        PIPE_CORNER_AABB_SE = new AxisAlignedBB((double) 5 / 16, (double) 5 / 16, (double) 5 / 16, 1D, (double) 11 / 16, 1D);
        PIPE_CORNER_AABB_SW = new AxisAlignedBB(0, (double) 5 / 16, (double) 5 / 16, (double) 11 / 16, (double) 11 / 16, 1D);
        PIPE_CORNER_AABB_NW = new AxisAlignedBB(0D, (double) 5 / 16, 0D, (double) 11 / 16, (double) 11 / 16, (double) 11 / 16);
        PIPE_CORNER_AABB_NE = new AxisAlignedBB((double) 5 / 16, (double) 5 / 16, 0D, 1D, (double) 11 / 16, (double) 11 / 16);
    }

    public BlockPipeCorner(String name)
    {
        super(name);
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        switch((EnumFacing) state.getValue(FACING))
        {
            case EAST:
                return PIPE_CORNER_AABB_SE;
            case SOUTH:
                return PIPE_CORNER_AABB_SW;
            case WEST:
                return PIPE_CORNER_AABB_NW;
            default:
                return PIPE_CORNER_AABB_NE;
        }
    }
}
