package org.eu.awesomekalin.jta.mod.init;

import org.eu.awesomekalin.jta.mod.Init;
import org.eu.awesomekalin.jta.mod.blocks.directional.UKBritishOperatorStationSignBase;
import org.eu.awesomekalin.jta.mod.blocks.directional.UKBritishRailStationSignSimple;
import org.mtr.mapping.holder.Identifier;
import org.mtr.mapping.registry.BlockEntityTypeRegistryObject;

public class BlockEntityTypeInit {
    public static final BlockEntityTypeRegistryObject<UKBritishRailStationSignSimple.TileEntityBritishRailStationSign> BRITISH_RAIL_STATION_SIGN_SIMPLE = Init.REGISTRY.registerBlockEntityType(
            new Identifier(
                    Init.MOD_ID,
                    "uk_british_rail_station_sign_simple"
            ),
        UKBritishRailStationSignSimple.TileEntityBritishRailStationSign::new,
        BlockInit.BRITISH_RAIL_STATION_SIGN_SIMPLE::get
    );

    public static final BlockEntityTypeRegistryObject<UKBritishOperatorStationSignBase.TileEntityBritishRailOperatorSign> UK_BRITISH_OPERATOR_STATION_SIGN_BASE = Init.REGISTRY.registerBlockEntityType(
            new Identifier(
                    Init.MOD_ID,
                    "uk_british_operator_station_sign_base"
            ),
            UKBritishOperatorStationSignBase.TileEntityBritishRailOperatorSign::new,
            BlockInit.AVANTI_WEST_COAST_STATION_SIGN::get,
            BlockInit.NORTHERN_STATION_SIGN::get,
            BlockInit.MERSEYRAIL_STATION_SIGN::get
    );
    public static void INIT() {
        Init.LOGGER.debug("Registering JTA Block Entities");
    }
}