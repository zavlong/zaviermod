package com.zavier.zavmod;

//Import libs
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

//Declare program as mod
@Mod(modid = ZavierMod.MODID, version = ZavierMod.VERSION)
//Declares ZavierMod Class and contains methods
public class ZavierMod
{
    public static final String MODID = "zaviermod";
    public static final String VERSION = "0.2.4";
    
    //Item declarations
    
    // Conure feather
    public static Item confeather;
    // Ruby
    public static Item ruby;
    public static Item obsdust;
    public static Item obsbrick;
    // Ruby pickaxe
    public static Item rubypickaxe;
    // Ruby axe
    public static Item rubyaxe;
    // Ruby sword
    public static Item rubysword;
    // Ruby shovel
    public static Item rubyspade;
    // Obsidian tools
    public static Item obspickaxe;
    public static Item obsaxe;
    public static Item obssword;
    public static Item obsspade;
    //Emerald tools
    public static Item empickaxe;
    public static Item emspade;
    public static Item emaxe;
    public static Item emsword;
    //armor
    public static Item rubyhelmet;
    public static Item rubychest;
    public static Item rubyleggings;
    public static Item rubyboots;
    public static Item emhelmet;
    public static Item emchest;
    public static Item emleggings;
    public static Item emboots;
    //Block declarations
    // Ruby ore
    public static Block rubyore;
    // Ruby Block
    public static Block rubyblock;
    public static Block comobs;
    public static Block obsbricks;
    public static Block obspillar;
    public static Block obssmooth;
    public static Block obschisel;
    ZavierEventHandler handler = new ZavierEventHandler();
    //Tool material declarations
    // Ruby material (for tools)
    ToolMaterial rubytool = EnumHelper.addToolMaterial("rubytool", 3, 2500, 10, 3, 9);
    // Obsidian material (for tools)
    ToolMaterial obstool = EnumHelper.addToolMaterial("obstool", 3, 5000, 12, 7, 7);
    ToolMaterial emtool = EnumHelper.addToolMaterial("emtool", 3, 3000, 10, 4, 10);
    //Armor material
    ArmorMaterial rubyarmor = EnumHelper.addArmorMaterial("rubyarmor", 20, new int[] { 3, 7, 6, 3}, 9);
    ArmorMaterial emarmor = EnumHelper.addArmorMaterial("emarmor", 20, new int[] { 4, 8, 7, 4}, 10);
    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
    	
    	// Initialize items
    	// Conure feather
    	confeather = new ItemConfeather();
    	// Ruby
    	ruby = new ItemRuby();
    	obsdust = new ItemObsDust();
    	obsbrick = new ItemObsBrick();
    	// Ruby pickaxe
    	
    	rubypickaxe = new ItemRubyPickaxe(rubytool, "rubypickaxe");
    	//And more items, ruby axe etc.
    	rubyaxe = new ItemRubyAxe(rubytool, "rubyaxe");
    	
    	rubysword = new ItemRubySword(rubytool, "rubysword");

    	rubyspade = new ItemRubySpade(rubytool, "rubyspade");
    	obspickaxe = new ItemObsPickaxe(obstool, "obspickaxe");
    	obsaxe = new ItemObsAxe(obstool, "obsaxe");
    	obssword = new ItemObsSword(obstool, "obssword");
    	obsspade = new ItemObsSpade(obstool, "obsspade");
    	empickaxe = new ItemEmPickaxe(emtool, "empickaxe");
    	emspade = new ItemEmSpade(emtool, "emspade");
    	emaxe = new ItemEmAxe(emtool, "emaxe");
    	emsword = new ItemEmSword(emtool, "emsword");
    	rubyhelmet = new ItemRubyArmor(rubyarmor, 0, "rubyhelmet");
    	rubychest = new ItemRubyArmor(rubyarmor, 1, "rubychest");
    	rubyleggings = new ItemRubyArmor(rubyarmor, 2, "rubyleggings");
    	rubyboots = new ItemRubyArmor(rubyarmor, 3, "rubyboots");
    	emhelmet = new ItemEmArmor(emarmor, 0, "emhelmet");
    	emchest = new ItemEmArmor(emarmor, 1, "emchest");
    	emleggings = new ItemEmArmor(emarmor, 2, "emleggings");
    	emboots = new ItemEmArmor(emarmor, 3, "emboots");
    	rubyore = new BlockRubyOre();

    	rubyblock = new BlockRubyBlock();
    	comobs = new BlockComObs();
    	obsbricks = new BlockObsBricks();
    	obspillar = new BlockObsPillar();
    	obssmooth = new BlockObsSmooth();
    	obschisel = new BlockObsChisel();
    	// Register items

    	GameRegistry.registerItem(confeather, "ConureFeather");

    	GameRegistry.registerItem(ruby, "Ruby");
    	GameRegistry.registerItem(obsdust, "ObsDust");
    	GameRegistry.registerItem(obsbrick, "ObsBrick");
    	GameRegistry.registerItem(rubypickaxe, "RubyPick");
    	
    	GameRegistry.registerItem(rubyaxe, "RubyAxe");
    	
    	GameRegistry.registerItem(rubysword, "RubySword");

    	GameRegistry.registerItem(rubyspade, "RubySpade");
    	
    	GameRegistry.registerItem(obspickaxe, "ObsPick");
    	GameRegistry.registerItem(obsaxe, "ObsAxe");
    	GameRegistry.registerItem(obssword, "ObsSword");
    	GameRegistry.registerItem(obsspade, "ObsSpade");
    	GameRegistry.registerItem(empickaxe, "EmeraldPick");
    	GameRegistry.registerItem(emspade, "EmeraldSpade");
    	GameRegistry.registerItem(emaxe, "EmeraldAxe");
    	GameRegistry.registerItem(emsword, "EmeraldSword");
    	GameRegistry.registerItem(rubyhelmet, "RubyHelmet");
    	GameRegistry.registerItem(rubychest, "RubyChest");
    	GameRegistry.registerItem(rubyleggings, "RubyLeggings");
    	GameRegistry.registerItem(rubyboots, "RubyBoots");
    	GameRegistry.registerItem(emhelmet, "EmHelmet");
    	GameRegistry.registerItem(emchest, "EmChest");
    	GameRegistry.registerItem(emleggings, "EmLeggings");
    	GameRegistry.registerItem(emboots, "EmBoots");
    	//block registry
    	GameRegistry.registerBlock(rubyore, ItemRubyOre.class, "RubyOre");
    	
    	GameRegistry.registerBlock(rubyblock, "RubyBlock");
    	GameRegistry.registerBlock(comobs, "ComObs");
    	GameRegistry.registerBlock(obsbricks, "ObsBricks");
    	GameRegistry.registerBlock(obspillar, "ObsPillar");
    	GameRegistry.registerBlock(obssmooth, "ObsSmooth");
    	GameRegistry.registerBlock(obschisel, "ObsChisel");
    	GameRegistry.registerWorldGenerator(handler, 0);
    	
    
    }
    
    //Initialize recipes
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	//Crafting recipes
    	// Crafting : Turns 2 blaze powder into 1 blaze rod
		GameRegistry.addRecipe(new ItemStack(Items.blaze_rod),
				" X",
				" X",
				'X', Items.blaze_powder
				);
		//Obsidian tool recipes
		GameRegistry.addRecipe(new ItemStack(ZavierMod.obspickaxe),
				"XXX",
				" Y ",
				" Y ",
				'X', Blocks.obsidian, 'Y', Items.stick
				);
		GameRegistry.addRecipe(new ItemStack(ZavierMod.obsaxe),
				"XX ",
				"XY ",
				" Y ",
				'X', Blocks.obsidian, 'Y', Items.stick
				);
		GameRegistry.addRecipe(new ItemStack(ZavierMod.obssword),
				" X ",
				" X ",
				" Y ",
				'X', Blocks.obsidian, 'Y', Items.stick
				);
		GameRegistry.addRecipe(new ItemStack(ZavierMod.obsspade),
				" X ",
				" Y ",
				" Y ",
				'X', Blocks.obsidian, 'Y', Items.stick
				);
		GameRegistry.addRecipe(new ItemStack(ZavierMod.comobs),
				"XXX",
				"XXX",
				"XXX",
				'X', Blocks.obsidian
				);
		//Ruby tool recipes
		GameRegistry.addRecipe(new ItemStack(ZavierMod.rubypickaxe),
				"XXX",
				" Y ",
				" Y ",
				'X', ZavierMod.ruby, 'Y', Items.stick
				);
		GameRegistry.addRecipe(new ItemStack(ZavierMod.rubyaxe),
				"XX ",
				"XY ",
				" Y ",
				'X', ZavierMod.ruby, 'Y', Items.stick
				);
		GameRegistry.addRecipe(new ItemStack(ZavierMod.rubysword),
				" X ",
				" X ",
				" Y ",
				'X', ZavierMod.ruby, 'Y', Items.stick
				);
		GameRegistry.addRecipe(new ItemStack(ZavierMod.rubyspade),
				" X ",
				" Y ",
				" Y ",
				'X', ZavierMod.ruby, 'Y', Items.stick
				);
		GameRegistry.addRecipe(new ItemStack(ZavierMod.rubyblock),
				"XXX",
				"XXX",
				"XXX",
				'X', ZavierMod.ruby
				);
		GameRegistry.addRecipe(new ItemStack(ZavierMod.empickaxe),
				"XXX",
				" Y ",
				" Y ",
				'X', Items.emerald, 'Y', Items.stick
				);
		GameRegistry.addRecipe(new ItemStack(ZavierMod.emaxe),
				"XX ",
				"XY ",
				" Y ",
				'X', Items.emerald, 'Y', Items.stick
				);
		GameRegistry.addRecipe(new ItemStack(ZavierMod.emsword),
				" X ",
				" X ",
				" Y ",
				'X', Items.emerald, 'Y', Items.stick
				);
		GameRegistry.addRecipe(new ItemStack(ZavierMod.emspade),
				" X ",
				" Y ",
				" Y ",
				'X', Items.emerald, 'Y', Items.stick
				);
		// Crafting: Turns 1 blaze powder & a stick into 12 torches
		GameRegistry.addRecipe(new ItemStack(Blocks.torch, 12),
				" X",
				" Y",
				'X', Items.blaze_powder, 'Y', Items.stick
				);
		GameRegistry.addRecipe(new ItemStack(ZavierMod.obsbricks),
				"XX",
				"XX",
				'X', ZavierMod.obsbrick
				);
		GameRegistry.addRecipe(new ItemStack(ZavierMod.obspillar, 2),
				"X",
				"X",
				'X', ZavierMod.obsbricks
				);
		GameRegistry.addRecipe(new ItemStack(ZavierMod.obssmooth, 4),
				"XX",
				"XX",
				'X', Blocks.obsidian
				);
		// Crafting: Turns 1 glowstone dust & a stick into 6 torches
		GameRegistry.addRecipe(new ItemStack(Blocks.torch, 6),
				" X",
				" Y",
				'X', Items.glowstone_dust, 'Y', Items.stick
				);
		// Crafting: Turns a brick and a bucket of water into 2 clay balls
		GameRegistry.addShapelessRecipe(new ItemStack(Items.clay_ball, 2),
					Items.brick, Items.water_bucket
				);
		// Turns a piece of blaze powder into 2 glowstone dust
		GameRegistry.addShapelessRecipe(new ItemStack(Items.glowstone_dust, 2),
				Items.blaze_powder
				);
		GameRegistry.addShapelessRecipe(new ItemStack(ZavierMod.ruby, 9),
				ZavierMod.rubyblock
				);
		// what type of recipe is this and what does it do?
		GameRegistry.addShapelessRecipe(new ItemStack(Items.lava_bucket),
				Items.blaze_powder, Items.water_bucket
				);	
		// Turns a piece of glowstone dust and a lava bucket into 1 plaze powder
		GameRegistry.addShapelessRecipe(new ItemStack(Items.blaze_powder),
				Items.glowstone_dust, Items.lava_bucket
				);
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.obsidian, 9),
				ZavierMod.comobs
				);
		//Ore recipes
		GameRegistry.addRecipe(new ItemStack(Blocks.diamond_ore, 5), 
				"XYX",
				"YXY",
				"XYX",
				'X', Items.diamond, 'Y', Blocks.stone
				);
		GameRegistry.addRecipe(new ItemStack(Blocks.gold_ore, 5), 
				"XYX",
				"YXY",
				"XYX",
				'X', Items.gold_ingot, 'Y', Blocks.stone
				);
		GameRegistry.addRecipe(new ItemStack(Blocks.iron_ore, 5), 
				"XYX",
				"YXY",
				"XYX",
				'X', Items.iron_ingot, 'Y', Blocks.stone
				);
		GameRegistry.addRecipe(new ItemStack(Blocks.coal_ore, 5), 
				"XYX",
				"YXY",
				"XYX",
				'X', Items.coal, 'Y', Blocks.stone
				);
		GameRegistry.addRecipe(new ItemStack(Blocks.quartz_ore, 5), 
				"XYX",
				"YXY",
				"XYX",
				'X', Items.quartz, 'Y', Blocks.netherrack
				);
		GameRegistry.addRecipe(new ItemStack(Blocks.redstone_ore, 5), 
				"XYX",
				"YXY",
				"XYX",
				'X', Items.redstone, 'Y', Blocks.stone
				);
		GameRegistry.addRecipe(new ItemStack(Blocks.emerald_ore, 5), 
				"XYX",
				"YXY",
				"XYX",
				'X', Items.emerald, 'Y', Blocks.stone
				);
		GameRegistry.addRecipe(new ItemStack(ZavierMod.rubyore, 5), 
				"XYX",
				"YXY",
				"XYX",
				'X', ZavierMod.ruby, 'Y', Blocks.stone
				);
				
				
				
						
				
		//Smelting recipes	
		// Smelting: Turns a water bucket into an empty bucket
		GameRegistry.addSmelting(Items.water_bucket, new ItemStack(Items.bucket), 0.1F);
		GameRegistry.addSmelting(Blocks.obsidian, new ItemStack(ZavierMod.obsdust), 1F);
		GameRegistry.addSmelting(ZavierMod.obsdust, new ItemStack(ZavierMod.obsbrick), 0.1F);
		GameRegistry.addSmelting(ZavierMod.rubyore, new ItemStack(ZavierMod.ruby), 1F);
		// Turns a block of ice into a bucket of water
		GameRegistry.addSmelting(Blocks.ice, new ItemStack(Items.water_bucket), 0.5F);
    }
}
