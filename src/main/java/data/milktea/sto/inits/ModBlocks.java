package data.milktea.sto.inits;

import data.milktea.sto.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks
{
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    //Update 0.1
    public static final Block PIPE = new BlockPipe("pipe");
    public static final Block ALUMINUM_FRAME = new BlockAluminumFrame("aluminum_frame");
    public static final Block ALUMINUM_WINDOW = new BlockAluminumWindow("aluminum_framed_window");
    public static final Block SLIDING_DOOR = new BlockSlidingDoor("sliding_door");
    public static final Block CASHIER = new BlockCashier("cashier");
    public static final Block CASHIER_TABLE = new BlockCashierTable("cashier_desk");
    public static final Block METAL_SHELF = new BlockMetalShelf("metal_shelf");
    public static final Block STEAM_SHELF = new BlockSteamShelf("steam_shelf");
    public static final Block HOT_DOG_STAND = new BlockHotDogStand("hot_dog_stand");
    public static final Block TEA_EGG_POT = new BlockTeaEggPot("tea_egg_pot");
    public static final Block ODEN_COOKER = new BlockOdenCooker("oden_cooker");
    public static final Block BEVERAGE_STAND = new BlockBeverageStand("beverage_stand");
    public static final Block CEILING_FAN = new BlockCeilingFan("ceiling_fan");
    public static final Block A_C = new BlockAirConditioner("ac");
    public static final Block MAGAZINE_SHELF = new BlockMagazineShelf("magazine_shelf");
    public static final Block SWEET_POTATO_STAND = new BlockSweetPotatoStand("sweet_potato_stand");
    public static final Block COFFEE_MACHINE = new BlockCoffeeMachine("coffee_machine");
    public static final Block MAILBOX = new BlockMailBox("mailbox");
    public static final Block WATERING_MACHINE = new BlockWaterMachine("water_machine");
    public static final Block MICROWAVE = new BlockMicrowave("microwave");
    public static final Block SHOPPING_BASKET = new BlockShoppingBasket("shopping_basket");
}
