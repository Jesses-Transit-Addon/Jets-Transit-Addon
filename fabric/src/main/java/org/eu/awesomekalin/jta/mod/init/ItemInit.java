package org.eu.awesomekalin.jta.mod.init;

import org.eu.awesomekalin.jta.mod.Init;
import org.eu.awesomekalin.jta.mod.blocks.GreekPlatformEnd;
import org.eu.awesomekalin.jta.mod.blocks.WallSignBase;
import org.eu.awesomekalin.jta.mod.blocks.directional.*;
import org.eu.awesomekalin.jta.mod.items.RadioItem;
import org.eu.awesomekalin.jta.mod.items.ShieldItem;
import org.eu.awesomekalin.jta.mod.util.DyeColor;
import org.mtr.mapping.holder.Block;
import org.mtr.mapping.holder.Identifier;
import org.mtr.mapping.holder.Item;
import org.mtr.mapping.holder.ItemSettings;
import org.mtr.mapping.mapper.BlockExtension;
import org.mtr.mapping.mapper.BlockHelper;
import org.mtr.mapping.mapper.ItemExtension;
import org.mtr.mapping.mapper.SlabBlockExtension;
import org.mtr.mapping.registry.BlockRegistryObject;
import org.mtr.mapping.registry.ItemRegistryObject;

public class ItemInit {
    public static final ItemRegistryObject RIOT_SHIELD = Init.REGISTRY.registerItem(new Identifier(Init.MOD_ID, "riot_shield"), (a) -> new Item(new ShieldItem()), CreativeTabInit.JTA_ITEMS);
    public static final ItemRegistryObject AXON_BODY_3 = Init.REGISTRY.registerItem(new Identifier(Init.MOD_ID, "axon_body_3"), (a) -> new Item(new ItemSettings()), CreativeTabInit.JTA_ITEMS);
    public static final ItemRegistryObject MET_POLICE_RADIO = Init.REGISTRY.registerItem(new Identifier(Init.MOD_ID, "met_police_radio"), (a) -> new Item(new RadioItem()), CreativeTabInit.JTA_ITEMS);
    public static final ItemRegistryObject FIVE_POUND_NOTE = Init.REGISTRY.registerItem(new Identifier(Init.MOD_ID, "5_pound_note"), (a) -> new Item(new ItemSettings().maxCount(64)), CreativeTabInit.JTA_ITEMS);
    public static final ItemRegistryObject TEN_POUND_NOTE = Init.REGISTRY.registerItem(new Identifier(Init.MOD_ID, "10_pound_note"), (a) -> new Item(new ItemSettings().maxCount(64)), CreativeTabInit.JTA_ITEMS);
    public static final ItemRegistryObject TWENTY_POUND_NOTE = Init.REGISTRY.registerItem(new Identifier(Init.MOD_ID, "20_pound_note"), (a) -> new Item(new ItemSettings().maxCount(64)), CreativeTabInit.JTA_ITEMS);
    public static final ItemRegistryObject FIFTY_POUND_NOTE = Init.REGISTRY.registerItem(new Identifier(Init.MOD_ID, "50_pound_note"), (a) -> new Item(new ItemSettings().maxCount(64)), CreativeTabInit.JTA_ITEMS);
    public static final BlockRegistryObject HANDHELD_GO_SIGN = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "handheld_go_sign"), () -> new Block(new HandheldSignBase()), CreativeTabInit.JTA_ITEMS);
    public static final BlockRegistryObject HANDHELD_STOP_SIGN = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "handheld_stop_sign"), () -> new Block(new HandheldSignBase()), CreativeTabInit.JTA_ITEMS);
    public static final BlockRegistryObject HANDHELD_STOP_CHILDREN_SIGN = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "handheld_stop_children_sign"), () -> new Block(new HandheldSignBase()), CreativeTabInit.JTA_ITEMS);

    public static void INIT() {
        Init.LOGGER.debug("Registering JTA Items");
    }
}
