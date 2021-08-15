package data.milktea.sto.blocks;

import data.milktea.sto.ShopToOutlet;
import data.milktea.sto.inits.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockPipe extends BlockBase
{
    public static final AxisAlignedBB PIPE_AABB = new AxisAlignedBB(0D, (double) 5 / 16, (double) 5 / 16, 1D, (double) 11 / 16, (double) 11 / 16);
    public static final AxisAlignedBB PIPE_AABB_WE = new AxisAlignedBB((double) 5 / 16, (double) 5 / 16, 0D, (double) 11 / 16, (double) 11 / 16, 1D);
    public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);

    public BlockPipe(String name)
    {
        super(name, Material.CLAY);

        this.setDefaultState(blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
    }

    @Override
    public IBlockState getStateFromMeta(int meta)
    {
        EnumFacing facing = EnumFacing.getFront(meta);

        if(facing.getAxis() == EnumFacing.Axis.Y)
            facing = EnumFacing.NORTH;

        return this.getDefaultState().withProperty(FACING, facing);
    }

    @Override
    public int getMetaFromState(IBlockState state)
    {
        return ((EnumFacing) state.getValue(FACING)).getIndex();
    }

    @Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[]{FACING});
    }

    @Override
    public IBlockState getStateForPlacement(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer, EnumHand hand)
    {
        return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
    }

    @Override
    public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos)
    {

    }

    @Override
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.CUTOUT;
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
        return ((EnumFacing) state.getValue(FACING)) == EnumFacing.SOUTH ? PIPE_AABB : ((EnumFacing) state.getValue(FACING)) == EnumFacing.NORTH ? PIPE_AABB : PIPE_AABB_WE;
    }
}
