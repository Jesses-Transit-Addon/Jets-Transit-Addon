package org.eu.awesomekalin.jta.mod;

import org.eu.awesomekalin.jta.mod.init.BlockEntityTypeInit;
import org.eu.awesomekalin.jta.mod.init.BlockInit;
import org.eu.awesomekalin.jta.mod.init.ItemInit;
import org.eu.awesomekalin.jta.mod.render.*;
import org.eu.awesomekalin.jta.mod.screen.FirstLoadScreen;
import org.mtr.mapping.holder.RenderLayer;
import org.mtr.mapping.holder.Style;
import org.mtr.mapping.registry.RegistryClient;

public final class InitClient {
    public static final RegistryClient REGISTRY_CLIENT = new RegistryClient(Init.REGISTRY);

    public static void init() {
        REGISTRY_CLIENT.registerBlockEntityRenderer(
                BlockEntityTypeInit.MANCHESTER_SIGN_SQUARE,
                dispatcher -> new ManchesterSignSquareRender<>(
                        dispatcher,
                        14 / 16F,
                        0.2F / 8,
                        0,
                        0F,
                        .5F,
                        0,
                        0xFFFFFFFF,
                        Style.getDefaultFontIdMapped()
                ));
        REGISTRY_CLIENT.registerBlockEntityRenderer(
                BlockEntityTypeInit.MERSEYSIDE_SIGN_SQUARE,
                dispatcher -> new MerseysideSignSquareRender<>(
                        dispatcher,
                        14 / 16F,
                        0.2F / 8,
                        0,
                        -.25F,
                        .5F,
                        0,
                        0xFFFFFFFF,
                        Style.getDefaultFontIdMapped()
                ));
        REGISTRY_CLIENT.registerBlockEntityRenderer(
                BlockEntityTypeInit.BEE_BUS_STOP,
                dispatcher -> new BeeBusStopSignRender<>(
                        dispatcher,
                        8 / 16F,
                        0.2F / 8,
                        -.025f,
                        -0.05f,
                        .005F,
                        0,
                        0xFF0F0F0F,
                        Style.getDefaultFontIdMapped()
                ));
        REGISTRY_CLIENT.registerBlockEntityRenderer(
                BlockEntityTypeInit.LONDON_BUS_STOP,
                dispatcher -> new LondonBusStopSignRender<>(
                        dispatcher,
                        8 / 16F,
                        0.2F / 8,
                        -.025f,
                        -0.05f,
                        .005F,
                        0,
                        0xFF0F0F0F,
                        Style.getDefaultFontIdMapped()
                ));
        REGISTRY_CLIENT.registerBlockEntityRenderer(
                BlockEntityTypeInit.METROLINK_SIGN_ENTITY,
                dispatcher -> new MetrolinkSignRender<>(
                        dispatcher,
                        16 / 16F,
                        0.2F / 8,
                        .8f,
                        1.325f,
                        .08F,
                        0,
                        0xFF0F0F0F,
                        true,
                        Style.getDefaultFontIdMapped()
                ));
        REGISTRY_CLIENT.registerBlockEntityRenderer(
                BlockEntityTypeInit.BEE_STATION_SIGN_ENTITY,
                dispatcher -> new BeeStationRender<>(
                        dispatcher,
                        8 / 16F,
                        0.2F / 8,
                        0,
                        -.1f,
                        .1F,
                        0,
                        0xFF0F0F0F,
                        true,
                        Style.getDefaultFontIdMapped()
                ));
        REGISTRY_CLIENT.registerBlockEntityRenderer(
                BlockEntityTypeInit.DISPATCH_SIGNAL,
                dispatcher -> new DispatchSignalRender<>(
                        dispatcher,
                        32 / 16F,
                        0.2F / 6,
                        0,
                        .05F,
                        -0.10F,
                        0,
                        0xFFFFFFFF,
                        Style.getDefaultFontIdMapped()
                ));
        REGISTRY_CLIENT.registerBlockEntityRenderer(
                BlockEntityTypeInit.PEDESTRIAN_SIGNAL,
                dispatcher -> new PedestrianSignalRender<>(
                        dispatcher,
                        false,
                        0x90EE90
                ));
        REGISTRY_CLIENT.registerBlockEntityRenderer(
                BlockEntityTypeInit.BRITISH_RAIL_STATION_SIGN_SIMPLE,
                dispatcher -> new SimpleStationSignRender<>(
                        dispatcher,
                        14 / 16F,
                        0.2F / 8,
                        0,
                        -.4F,
                        0.2F,
                        0,
                        0xFF0F0F0F,
                        true,
                        Style.getDefaultFontIdMapped()
                ));
        REGISTRY_CLIENT.registerBlockEntityRenderer(
                BlockEntityTypeInit.BRITISH_RAIL_STATION_SIGN_SIMPLE_WALL,
                dispatcher -> new SimpleStationSignRenderWall<>(
                        dispatcher,
                        14 / 16F,
                        0.2F / 8,
                        0,
                        -.3F,
                        -.1F,
                        0,
                        0xFF0F0F0F,
                        Style.getDefaultFontIdMapped()
                ));
        REGISTRY_CLIENT.registerBlockEntityRenderer(
                BlockEntityTypeInit.UK_BRITISH_OPERATOR_STATION_SIGN_BASE,
                dispatcher -> new SimpleStationOperatorSignRender<>(
                        dispatcher,
                        32 / 16F,
                        0.2F / 8,
                        0,
                        1F,
                        .05F,
                        0,
                        0xFF0F0F0F,
                        true,
                        Style.getDefaultFontIdMapped()
                ));
        REGISTRY_CLIENT.registerBlockEntityRenderer(
                BlockEntityTypeInit.UK_BRITISH_OPERATOR_STATION_SIGN_BASE_WHITE,
                dispatcher -> new SimpleStationOperatorSignRenderWhite<>(
                        dispatcher,
                        32 / 16F,
                        0.2F / 8,
                        0,
                        1F,
                        .05F,
                        0,
                        0xFFFFFFFF,
                        true,
                        Style.getDefaultFontIdMapped()
                ));
        REGISTRY_CLIENT.registerBlockEntityRenderer(
                BlockEntityTypeInit.UK_BRITISH_OPERATOR_STATION_SIGN_BASE_BLUE,
                dispatcher -> new SimpleStationOperatorSignRenderBlue<>(
                        dispatcher,
                        32 / 16F,
                        0.2F / 8,
                        0,
                        1F,
                        .05F,
                        0,
                        0x132E6A,
                        true,
                        Style.getDefaultFontIdMapped()
                ));
        REGISTRY_CLIENT.registerBlockEntityRenderer(
                BlockEntityTypeInit.RUSTY_UK_BRITISH_OPERATOR_STATION_SIGN_BASE,
                dispatcher -> new SimpleStationOperatorSignRustyRender<>(
                        dispatcher,
                        32 / 16F,
                        0.2F / 8,
                        0,
                        .05F,
                        0,
                        0,
                        0xFF0F0F0F,
                        true,
                        Style.getDefaultFontIdMapped()
                ));
        REGISTRY_CLIENT.registerBlockEntityRenderer(
                BlockEntityTypeInit.RUSTY_UK_BRITISH_OPERATOR_STATION_SIGN_BASE_WHITE,
                dispatcher -> new SimpleStationOperatorSignRustyRenderWhite<>(
                        dispatcher,
                        32 / 16F,
                        0.2F / 8,
                        0,
                        .05F,
                        0,
                        0,
                        0xFFFFFFFF,
                        true,
                        Style.getDefaultFontIdMapped()
                ));
        REGISTRY_CLIENT.registerBlockEntityRenderer(
                BlockEntityTypeInit.RUSTY_UK_BRITISH_OPERATOR_STATION_SIGN_BASE_BLUE,
                dispatcher -> new SimpleStationOperatorSignRustyRenderBlue<>(
                        dispatcher,
                        32 / 16F,
                        0.2F / 8,
                        0,
                        .05F,
                        0,
                        0,
                        0x132E6A,
                        true,
                        Style.getDefaultFontIdMapped()
                ));
        REGISTRY_CLIENT.registerBlockEntityRenderer(
                BlockEntityTypeInit.WALL_UK_BRITISH_OPERATOR_STATION_SIGN_BASE,
                dispatcher -> new SimpleStationOperatorSignWallRender<>(
                        dispatcher,
                        32 / 16F,
                        0.2F / 8,
                        0,
                        -.4F,
                        0,
                        0,
                        0xFF0F0F0F,
                        Style.getDefaultFontIdMapped()
                ));
        REGISTRY_CLIENT.registerBlockEntityRenderer(
                BlockEntityTypeInit.WALL_UK_BRITISH_OPERATOR_STATION_SIGN_BASE_WHITE,
                dispatcher -> new SimpleStationOperatorSignWallRenderWhite<>(
                        dispatcher,
                        32 / 16F,
                        0.2F / 8,
                        0,
                        -.4F,
                        0,
                        0,
                        0xFFFFFFFF,
                        Style.getDefaultFontIdMapped()
                ));
        REGISTRY_CLIENT.registerBlockEntityRenderer(
                BlockEntityTypeInit.WALL_UK_BRITISH_OPERATOR_STATION_SIGN_BASE_BLUE,
                dispatcher -> new SimpleStationOperatorSignWallRenderBlue<>(
                        dispatcher,
                        32 / 16F,
                        0.2F / 8,
                        0,
                        -.4F,
                        0,
                        0,
                        0x132E6A,
                        Style.getDefaultFontIdMapped()
                ));

        REGISTRY_CLIENT.registerBlockEntityRenderer(
                BlockEntityTypeInit.NSE_CLOCK,
                dispatcher -> new NSERoofClockRender<>(
                        dispatcher,
                        20 / 16F,
                        0.2F / 8,
                        0,
                        -.005f,
                        .2F,
                        0,
                        0xBED058,
                        true,
                        Style.getDefaultFontIdMapped()
                ));

        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.MERSEYSIDE_SIGN_SQUARE_RAIL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.DRAIN);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.DRAIN_ALT);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.DRAIN_CIRCLE);

        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.AMAZON_PARCEL_COLLECTION_LOCKER);

        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), BlockInit.ADT_ALARM);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), BlockInit.WALL_DEFIBRILATOR);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), BlockInit.WHITE_GARAGE_DOOR_WINDOW);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), BlockInit.BLACK_GARAGE_DOOR);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), BlockInit.STEEL_GARAGE_DOOR_WINDOW);

        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), BlockInit.WHITE_WINDOW);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), BlockInit.WHITE_WINDOW_FULL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), BlockInit.WHITE_WINDOW_SQUARE);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), BlockInit.WHITE_WINDOW_TOP);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), BlockInit.WHITE_WINDOW_SEGMENTED);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), BlockInit.WHITE_WINDOW_SEGMENTED_TOP);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), BlockInit.CREAMY_ENGLISH_BRICKS_WHITE_WINDOW_4_POINT_EXTRU);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), BlockInit.DARK_ENGLISH_BRICKS_WHITE_WINDOW_4_POINT_EXTRU);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), BlockInit.ENGLISH_BRICKS_WHITE_WINDOW_4_POINT_EXTRU);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), BlockInit.LARGE_DARK_GRAY_BRICKS_WHITE_WINDOW_4_POINT_EXTRU);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), BlockInit.LARGE_SLATE_BRICKS_WHITE_WINDOW_4_POINT_EXTRU);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), BlockInit.SANDY_BRICKS_WHITE_WINDOW_4_POINT_EXTRU);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), BlockInit.SILTY_BRICKS_WHITE_WINDOW_4_POINT_EXTRU);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), BlockInit.LIME_BRICKS_WHITE_WINDOW_4_POINT_EXTRU);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), BlockInit.SMOOTH_MIXED_STONE_WHITE_WINDOW_4_POINT_EXTRU);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), BlockInit.STONE_PAVER_WHITE_WINDOW_4_POINT_EXTRU);

        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), BlockInit.BLACK_BUS_SHELTER_LEFT_RED);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), BlockInit.BLACK_BUS_SHELTER_LEFT_LONG_RED);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), BlockInit.BLACK_BUS_SHELTER_LEFT_YELLOW);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), BlockInit.BLACK_BUS_SHELTER_LEFT_LONG_YELLOW);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), BlockInit.BLACK_BUS_SHELTER_RIGHT_RED);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), BlockInit.BLACK_BUS_SHELTER_RIGHT_WITH_ADVERT_RED);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), BlockInit.BLACK_BUS_SHELTER_RIGHT_WITH_ADVERT_YELLOW);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), BlockInit.BLACK_BUS_SHELTER_RIGHT_YELLOW);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), BlockInit.BLACK_BUS_SHELTER_RIGHT_WITH_ADVERT_OPEN_RED);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), BlockInit.BLACK_BUS_SHELTER_RIGHT_WITH_ADVERT_OPEN_YELLOW);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), BlockInit.GRAY_BUS_SHELTER_LEFT_RED);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), BlockInit.GRAY_BUS_SHELTER_LEFT_LONG_RED);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), BlockInit.GRAY_BUS_SHELTER_LEFT_YELLOW);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), BlockInit.GRAY_BUS_SHELTER_LEFT_LONG_YELLOW);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), BlockInit.GRAY_BUS_SHELTER_RIGHT_RED);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), BlockInit.GRAY_BUS_SHELTER_RIGHT_WITH_ADVERT_RED);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), BlockInit.GRAY_BUS_SHELTER_RIGHT_WITH_ADVERT_YELLOW);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), BlockInit.GRAY_BUS_SHELTER_RIGHT_YELLOW);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), BlockInit.GRAY_BUS_SHELTER_RIGHT_WITH_ADVERT_OPEN_RED);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), BlockInit.GRAY_BUS_SHELTER_RIGHT_WITH_ADVERT_OPEN_YELLOW);

        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), BlockInit.STREET_LIGHT);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), BlockInit.STREET_LIGHT_OFF);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), BlockInit.STREET_LIGHT_FLICKER);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), BlockInit.LED_STREET_LIGHT);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), BlockInit.LED_STREET_LIGHT_OFF);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), BlockInit.LED_STREET_LIGHT_FLICKER);

        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.METROLINK_SIGN);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.BEE_BUS_STOP);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.BEE_BUS_STATION_SIGN);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.BEE_INTERCHANGE_STATION_SIGN);


        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SPEED_110_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_NO_SITTING_HALF);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_JUNCTION_ON_BEND_AHEAD_RIGHT_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_MINIMUM_SPEED_40_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_CAUTION_LIVE_RAILWAY_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_NOSMOKINGVAPING_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_DOUBLE_BEND_TO_LEFT_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_ZEBRA_CROSSING_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_NO_STOPPING_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TURN_LEFT_AHEAD_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_T_JUNCTION_WITH_PRIORITY_LEFT_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_ROAD_NARROWS_RIGHT_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_OUT_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_6_8_CAR_STOP_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_S_CAR_STOP_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_ZEBRA_CROSSING_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_9_12_CAR_STOP_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_DIRECTION_UNDERGROUND_RAIL_CYCLE_PEDESTRIAN_RIGHT_LARGE);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_DANGER_HIGH_VOLTAGE_HALF);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_DIVERTED_TRAFFIC_RIGHT_LARGE);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_NO_RIGHT_TURN_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_3_CAR_STOP_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_DUAL_CARRIAGEWAY_ENDS_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_NO_THROUGH_ROAD_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TRAFFIC_CONGESTION_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_PART_TIME_SIGNALS_HALF);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SPEED_40_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_FALLING_ROCKS_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_NO_OVERTAKING_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_NO_WAITING_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SPEED_30_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_NO_OVERTAKING_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SPEED_70_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_STOP_POLICE_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_ONE_WAY_ARROW_LEFT_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TRAM_SPEED_45_RED_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_ROAD_NARROWS_LEFT_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_ROAD_NARROWS_BOTH_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TRAM_SPEED_20_RED_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SINGLE_FILE_TRAFFIC_HALF);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_VEHICLES_PASS_EITHER_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_PRIORITY_OVER_ONCOMING_HALF);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_DANGER_ELECTRIC_SHOCK_HALF);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_CONTROLLED_CONGESTION_ZONE_LARGE);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_MINIMUM_SPEED_40_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_QUEUES_LIKELY_HALF);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_JUNCTION_ON_BEND_AHEAD_LEFT_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SPEED_15_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TRAM_SPEED_20_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_BRIDGE_RAIL_AUTHORITY_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_24_HOUR_CCTV_IN_OPERATION_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_STOP_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TURN_RIGHT_AHEAD_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TUNNEL_AHEAD_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_DUAL_CARRIAGEWAY_ENDS_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_PARKING_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_CYCLE_ROUTE_AHEAD_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SPEED_20_ZONE_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_6_7_CAR_STOP_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_ROAD_NARROWS_LEFT_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TURN_RIGHT_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TRAM_SPEED_30_RED_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_ULEZ_CAMERAS_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_LIMITED_CLEARANCE_WARNING_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_ROUNDABOUT_BLUE_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SPEED_140_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TRAM_SPEED_50_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_VEHICLES_PASS_EITHER_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_MOTORWAY_END_2_LARGE);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_6_CAR_STOP_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_LIMITED_CLEARANCE_SQUARE_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_NO_PARKING_HALF);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_LEVEL_CROSSING_LARGE);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TRAM_SPEED_10_RED_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_PARK_AND_RIDE_BUS_LEFT_LARGE);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_CYCLE_LANE_LOOK_LEFT_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_ONE_WAY_ARROW_RIGHT_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_LIMITED_CLEARANCE_SQUARE_RUSTY_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_CONTROLLED_PARKING_ZONE_LARGE);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_NO_STOPPING_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_URBAN_CLEARWAY_LARGE);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SPEED_110_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_STOP_CHILDREN_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SPEED_80_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_PEDESTRIANS_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SPEED_LEFT_HALF);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_BIKES_PEDESTRIANS_SEPERATED_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TRAIN_CROSSING_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_AVERAGE_SPEED_CAMERAS_LARGE);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_MINIMUM_SPEED_30_ENDS_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TRAM_CROSSING_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_POLICE_SPEED_CHECK_AREA_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_DIRECTION_RAIL_CYCLE_PEDESTRIAN_RIGHT_LARGE);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TRAM_SPEED_10_RED_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_PERMISSIBLE_SPEED_50_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_ELDERLY_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TRAM_SPEED_50_RED_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_FREE_RECOVERY_LARGE);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_LOW_FLYING_AIRCRAFT_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_ICE_WARNING_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_BEND_TO_RIGHT_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_NO_EXIT_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_NO_REFUGES_SQUARE_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_NO_EXIT_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_WEAK_BRIDGE_LARGE);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_BEND_TO_RIGHT_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_IN_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_NO_LITTERING_HALF);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_IN_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_MINIMUM_SPEED_30_ENDS_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TRAM_SPEED_50_RED_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_DOUBLE_BEND_TO_LEFT_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SPEED_80_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_NO_BIKES_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_NSE_4_CAR_STOP_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_STOP_CHILDREN_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_ACCOMPANIED_HORSES_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TURN_LEFT_AHEAD_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_ROAD_NARROWS_BOTH_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_T_JUNCTION_WITH_PRIORITY_RIGHT_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TWO_WAY_TRAFFIC_CROSSES_ONE_WAY_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_ROUNDABOUT_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_REDUCE_SPEED_NOW_HALF);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SPEED_130_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SPEED_20_ZONE_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TRAFFIC_MERGING_LEFT_AHEAD_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TRAM_SPEED_45_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TRAM_SPEED_60_RED_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_NO_LOCAL_BUSES_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_BIKES_PEDESTRIANS_SEPERATED_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SPEED_20_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SITE_SAFTEY_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_POLICE_SPEED_CHECK_AREA_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_DIRECTION_UNDERGROUND_RAIL_CYCLE_PEDESTRIAN_LEFT_LARGE);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TWO_WAY_TRAFFIC_CROSSES_ONE_WAY_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_HIDDEN_DIP_HALF);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_DANGER_OVERHEAD_WIRES_HALF);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TRAM_SPEED_45_RED_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SPEED_20_ZONE_END_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_BRIDGE_RAIL_AUTHORITY_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SPEED_CAMERAS_LARGE);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_GO_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_MINIMUM_SPEED_30_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SPEED_100_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_NO_LEFT_TURN_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_WILD_HORSES_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TRAM_SPEED_60_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_NO_ACCESS_HALF);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_ELDERLY_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_BUSES_AND_BIKES_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TRAM_SPEED_50_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_3_CAR_STOP_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_2_CAR_STOP_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SPEED_90_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SPEED_125_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TRAFFIC_MERGING_LEFT_AHEAD_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_STAGGERED_JUNCTION_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_NO_U_TURN_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SPEED_30_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_PASSENGER_DO_NOT_CROSS_LINE_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_BEND_TO_LEFT_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_OPENING_BRIDGE_AHEAD_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_BIKES_ONLY_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_ONLY_HALF);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_ICE_HALF);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_6_8_CAR_STOP_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_FALLING_ROCKS_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_DUAL_CARRIAGEWAY_HALF);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TRAM_SPEED_60_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TRAM_SPEED_30_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_STOP_POLICE_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_NO_LEFT_TURN_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_END_OF_HWRGV_ZONE_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_PERMISSIBLE_SPEED_30_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SPEED_130_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TURN_RIGHT_AHEAD_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_PERMIT_HOLDERS_ONLY_HALF);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_NO_FOOTWAY_FOR_400_HALF);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_DIVERTED_TRAFFIC_LEFT_LARGE);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SPEED_RIGHT_HALF);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_5_CAR_STOP_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_VARIABLE_SPEED_LIMIT_LARGE);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_2_CAR_STOP_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_NO_REFUGES_SQUARE_RUSTY_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_GO_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_MAX_SPEED_30_HALF);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_NO_WAITING_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SPEED_160_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_DOUBLE_BEND_TO_RIGHT_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TRAFFIC_MERGING_RIGHT_AHEAD_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_LOOSE_CHIPPINGS_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_MINIMUM_SPEED_40_ENDS_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TRAM_SPEED_30_RED_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_ADVERSE_CAMBER_HALF);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TRAM_SPEED_20_RED_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_MOTORWAY_END_1_LARGE);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_GIVE_WAY_TO_ONCOMING_HALF);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_UNSUITABLE_FOR_ARTICULATED_VEHICLES_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SPEED_15_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TRAFFIC_SIGNALS_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_VARIABLE_SPEED_LIMIT_ENDS_LARGE);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_6_7_CAR_STOP_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SPEED_45_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SPEED_60_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SPEED_90_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_WARNING_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_NO_THROUGH_ROAD_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SITE_SAFTEY_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_WEAK_BRIDGE_7_5_LARGE);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TUNNEL_AHEAD_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_CATTLE_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SPEED_AHEAD_HALF);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SPEED_120_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SLEEPER_CAR_STOP_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_7_5_TONE_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_ONE_WAY_ARROW_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TRAM_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TRAM_SPEED_15_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SPEED_NATIONAL_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SPEED_160_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_DO_NOT_CROSS_HALF);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_CYCLE_LANE_LOOK_LEFT_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TURN_LEFT_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_END_OF_CYCLE_ROUTE_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TRAFFIC_SIGNALS_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_PERMISSIBLE_SPEED_50_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_END_HALF);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_ONE_WAY_ARROW_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_4_CAR_STOP_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_NO_PEDESTRIANS_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_PERMISSIBLE_SPEED_30_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_ONE_WAY_HALF);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_LOOSE_CHIPPINGS_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_FORD_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SLIPPERY_ROAD_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TRAM_CROSSING_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SPEED_140_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_NO_REFUGES_SQUARE_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TRAM_SPEED_10_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_NO_ENTRY_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_WILD_ANIMALS_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_ACCOMPANIED_HORSES_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SPEED_125_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_ONCOMING_VEHICLES_IN_MIDDLE_OF_ROAD_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TWO_WAY_TRAFFIC_AHEAD_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_CCTV_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_NO_REFUGES_SQUARE_RUSTY_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_CROSSROADS_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_PARK_AND_RIDE_RAIL_LEFT_LARGE);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_24HOURCCTV_HALF);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_CATTLE_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TRAM_SPEED_15_RED_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_CYCLE_LANE_LOOK_RIGHT_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SPEED_NATIONAL_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_MAX_SPEED_20_HALF);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_RED_ROUTE_LARGE);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_PARK_AND_RIDE_UNDERGROUND_LEFT_LARGE);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_ROAD_WORKS_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_LIMITED_CLEARANCE_SQUARE_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_7_5_TONE_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_S_CAR_STOP_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_DIRECTION_RAIL_CYCLE_PEDESTRIAN_LEFT_LARGE);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_END_OF_HWRGV_ZONE_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SPEED_10_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SCHOOL_WARNING_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_PARK_AND_RIDE_UNDERGROUND_RIGHT_LARGE);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_END_OF_CYCLE_ROUTE_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_ROUNDABOUT_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SITE_SAFTEY_ALT_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_PERMISSIBLE_SPEED_40_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_CONTROLLED_PARKING_ENDS_LARGE);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SPEED_40_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TRAM_SPEED_20_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SPEED_10_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_BUSES_AND_BIKES_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_BEND_TO_LEFT_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_BIKES_ONLY_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TRAMWAY_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_HOLD_THE_HANDRAIL_HALF);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_T_JUNCTION_WITH_PRIORITY_RIGHT_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_UNSUITABLE_FOR_ARTICULATED_VEHICLES_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_4_CAR_STOP_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_ONCOMING_VEHICLES_IN_MIDDLE_OF_ROAD_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TRAFFIC_MERGING_RIGHT_AHEAD_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_PARK_AND_RIDE_TRAM_LEFT_LARGE);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TRAIN_CROSSING_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SLEEPER_CAR_STOP_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_PARK_AND_RIDE_BUS_RIGHT_LARGE);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_WILD_HORSES_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SPEED_45_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_NOSMOKINGVAPING_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TURN_LEFT_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_FORD_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_CCTV_IN_OPERATION_HALF);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_LOW_FLYING_AIRCRAFT_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SCHOOL_HALF);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_NO_PEDESTRIANS_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TURN_RIGHT_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SPEED_50_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TRY_YOUR_BRAKES_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_NO_VEHICLES_EXCEPT_PUSHED_PEDAL_BIKES_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_STAGGERED_JUNCTION_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_ULEZ_CONTROLLED_ZONE_LARGE);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_PERMISSIBLE_SPEED_40_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_EXCEPT_TRAMS_HALF);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_OUT_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_T_JUNCTION_WITH_PRIORITY_LEFT_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SINGLE_TRACK_ROAD_HALF);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SLIPPERY_ROAD_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TRAFFIC_CONGESTION_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_PEDESTRIANS_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_WILD_ANIMALS_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_PARK_AND_RIDE_TRAM_RIGHT_LARGE);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SCHOOL_WARNING_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_UNEVEN_ROAD_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_NO_BIKES_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SPEED_120_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SPEED_60_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_LIMITED_CLEARANCE_SQUARE_RUSTY_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_LIMITED_CLEARANCE_WARNING_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SPEED_20_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_ONE_WAY_ARROW_LEFT_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TRAM_SPEED_10_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_OPENING_BRIDGE_AHEAD_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_CROSSROADS_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_JUNCTION_ON_BEND_AHEAD_RIGHT_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_NO_U_TURN_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_5_CAR_STOP_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SPEED_150_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_UNEVEN_ROAD_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_ROAD_WORKS_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SITE_SAFTEY_ALT_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TRAM_SPEED_60_RED_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_CLEAN_AIR_ZONE_2_LARGE);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_NO_VEHICLES_EXCEPT_PUSHED_PEDAL_BIKES_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SPEED_70_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TWO_WAY_TRAFFIC_AHEAD_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_GIVE_WAY_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_ULEZ_CAMERAS_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_DO_NOT_TOUCH_LIVE_RAIL_HALF);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_MINIMUM_SPEED_30_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_MOTORWAY_END_3_LARGE);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_NO_ENTRY_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TRAM_SPEED_30_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TRAMWAY_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_PARK_AND_RIDE_RAIL_RIGHT_LARGE);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_CCTV_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_6_CAR_STOP_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_24_HOUR_CCTV_IN_OPERATION_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_BIKES_PEDESTRIANS_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_ONE_WAY_ARROW_RIGHT_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TRY_YOUR_BRAKES_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_9_12_CAR_STOP_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TRAM_SPEED_15_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TRAM_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_ROUNDABOUT_BLUE_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_CYCLE_ROUTE_AHEAD_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_GIVE_WAY_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_ROAD_NARROWS_RIGHT_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SPEED_5_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_ICE_WARNING_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_DOUBLE_BEND_TO_RIGHT_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_NETWORK_RAIL_NO_ACCESS_HALF);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_JUNCTION_ON_BEND_AHEAD_LEFT_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_NO_RIGHT_TURN_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_NO_LOCAL_BUSES_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SPEED_5_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_WITH_FLOW_CYCLE_LANE_LARGE);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SPEED_100_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_LIMITED_CLEARANCE_HALF);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TRAM_SPEED_15_RED_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SPEED_150_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SPEED_50_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_CYCLE_LANE_LOOK_RIGHT_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_RESIDENTS_PARKING_ONLY_LARGE);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_MINIMUM_SPEED_40_ENDS_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_PASSENGER_DO_NOT_CROSS_LINE_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_WARNING_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_PARKING_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_BIKES_PEDESTRIANS_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_SPEED_20_ZONE_END_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_CAUTION_LIVE_RAILWAY_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_NSE_4_CAR_STOP_ALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_TRAM_SPEED_45_SMALL);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.SIGN_STOP_SMALL);        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.BRITISH_ROAD_BOLLARD);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.BRITISH_ROAD_BOLLARD_ALT);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.GRAY_BOLLARD);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.BRITISH_ROAD_BOLLARD_ALT_NO_ENTRY);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.BRITISH_ROAD_BOLLARD_ALT_BLACK);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.BLUE_TRASH_BIN);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.BRITISH_TRASH_BIN);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.MANCHESTER_TRASH_BIN);
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), BlockInit.MANCHESTER_TRASH_BIN_ALT);

        REGISTRY_CLIENT.eventRegistryClient.registerStartClientTick(FirstLoadScreen::handle);

        REGISTRY_CLIENT.init();
    }
}
