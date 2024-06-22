package org.eu.awesomekalin.jta.mod.init;

import org.eu.awesomekalin.jta.mod.Init;
import org.eu.awesomekalin.jta.mod.blocks.*;
import org.eu.awesomekalin.jta.mod.blocks.directional.*;
import org.eu.awesomekalin.jta.mod.wallsigns.WallSignBase;
import org.mtr.mapping.holder.Block;
import org.mtr.mapping.holder.BlockSettings;
import org.mtr.mapping.holder.Identifier;
import org.mtr.mapping.mapper.BlockExtension;
import org.mtr.mapping.mapper.BlockHelper;
import org.mtr.mapping.registry.BlockRegistryObject;

public class BlockInit {
    public static final BlockRegistryObject LIME_BRICKS = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "lime_bricks"), () -> new Block(new BlockExtension(BlockHelper.createBlockSettings(false).strength(4.0f).nonOpaque().dynamicBounds())), CreativeTabInit.JTA_BLOCKS);
    public static final BlockRegistryObject GREEK_PLATFORM_END = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "greek_platform_end"), () -> new Block(new GreekPlatformEnd()), CreativeTabInit.JTA_BLOCKS);
    public static final BlockRegistryObject BRITISH_TRASH_BIN = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "british_trash_bin"), () -> new Block(new BritishTrashBin()), CreativeTabInit.JTA_BLOCKS);
    public static final BlockRegistryObject METROLINK_TICKET_MACHINE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "metrolink_ticket_machine"), () -> new Block(new MetrolinkTicketMachine()), CreativeTabInit.JTA_BLOCKS);
    public static final BlockRegistryObject METROLINK_CONTACTLESS_READER = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "metrolink_contactless_reader"), () -> new Block(new MetrolinkContactactlessReader()), CreativeTabInit.JTA_BLOCKS);
    public static final BlockRegistryObject RUSTY_POLE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "rusty_pole"), () -> new Block(new RustyPoleBase()), CreativeTabInit.JTA_SIGNS);
    public static final BlockRegistryObject RUSTY_POLE_NO_TRESPASS = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "rusty_no_trespass"), () -> new Block(new RustyPoleBase()), CreativeTabInit.JTA_SIGNS);
    public static final BlockRegistryObject WALL_NO_TRESPASS = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "wall_no_trespass"), () -> new Block(new WallSignBase()), CreativeTabInit.JTA_SIGNS);
    public static final BlockRegistryObject RUSTY_POLE_STOP_LOOK_LISTEN = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "rusty_stop_look_listen"), () -> new Block(new RustyPoleBase()), CreativeTabInit.JTA_SIGNS);
    public static final BlockRegistryObject WALL_STOP_LOOK_LISTEN = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "wall_stop_look_listen"), () -> new Block(new WallSignBase()), CreativeTabInit.JTA_SIGNS);
    public static final BlockRegistryObject RUSTY_POLE_ELECTRIC_SHOCK = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "rusty_electric_shock"), () -> new Block(new RustyPoleBase()), CreativeTabInit.JTA_SIGNS);
    public static final BlockRegistryObject WALL_ELECTRIC_SHOCK = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "wall_electric_shock"), () -> new Block(new WallSignBase()), CreativeTabInit.JTA_SIGNS);
    public static final BlockRegistryObject RUSTY_POLE_LEVEL_CROSSING = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "rusty_level_crossing"), () -> new Block(new RustyPoleBase()), CreativeTabInit.JTA_SIGNS);
    public static final BlockRegistryObject WALL_LEVEL_CROSSING = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "wall_level_crossing"), () -> new Block(new WallSignBase()), CreativeTabInit.JTA_SIGNS);
    public static final BlockRegistryObject RUSTY_POLE_NO_PAVEMENT_PARKING = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "rusty_no_pavement_parking"), () -> new Block(new RustyPoleBase()), CreativeTabInit.JTA_SIGNS);
    public static final BlockRegistryObject WALL_NO_PAVEMENT_PARKING = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "wall_no_pavement_parking"), () -> new Block(new WallSignBase()), CreativeTabInit.JTA_SIGNS);
    public static final BlockRegistryObject RUSTY_POLE_DO_NOT_CROSS = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "rusty_do_not_cross"), () -> new Block(new RustyPoleBase()), CreativeTabInit.JTA_SIGNS);
    public static final BlockRegistryObject WALL_DO_NOT_CROSS = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "wall_do_not_cross"), () -> new Block(new WallSignBase()), CreativeTabInit.JTA_SIGNS);
    public static final BlockRegistryObject AVANTI_WEST_COAST_STATION_SIGN = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "avanti_west_coast_sign"), () -> new Block(new UKBritishRailStationSignSimple()), CreativeTabInit.JTA_SIGNS);
    public static final BlockRegistryObject NORTHERN_STATION_SIGN = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "northern_sign"), () -> new Block(new UKBritishRailStationSignSimple()), CreativeTabInit.JTA_SIGNS);
    public static final BlockRegistryObject MERSEYRAIL_STATION_SIGN = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "merseyrail_sign"), () -> new Block(new UKBritishRailStationSignSimple()), CreativeTabInit.JTA_SIGNS);
    public static final BlockRegistryObject BRITISH_RAIL_STATION_SIGN_SIMPLE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "uk_british_rail_sign_simple"), () -> new Block(new UKBritishRailStationSignSimple()), CreativeTabInit.JTA_SIGNS);
    public static final BlockRegistryObject BRITISH_RAIL_STATION_SIGN_TRI = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "uk_british_rail_sign_tri"), () -> new Block(new UKBritishRailStationSignTri()), CreativeTabInit.JTA_SIGNS);
    public static void INIT() {
        Init.LOGGER.debug("Registering JTA Blocks");
    }
}
