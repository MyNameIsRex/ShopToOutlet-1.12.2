package data.milktea.sto;

import data.milktea.sto.inits.ModBlocks;
import data.milktea.sto.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.MC_VERSION)
public class ShopToOutlet
{
    @Mod.Instance
    public static ShopToOutlet instance;

    public static final CreativeTabs STO_TAB = new TabShopToOutlet("tab_" + Reference.MODID);

    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    public static class TabShopToOutlet extends CreativeTabs
    {
        public TabShopToOutlet(String label)
        {
            super("tab_milkteasto");
            this.setBackgroundImageName("milkteasto.png");
        }

        @Override
        public ItemStack getTabIconItem()
        {
            return new ItemStack(Item.getItemFromBlock(ModBlocks.PIPE));
        }
    }
}
