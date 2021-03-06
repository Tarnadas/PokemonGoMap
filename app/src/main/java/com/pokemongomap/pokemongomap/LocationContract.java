package com.pokemongomap.pokemongomap;

import android.provider.BaseColumns;

public final class LocationContract {
    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    public LocationContract() {}

    /* Inner class that defines the table contents */
    public static abstract class LocationEntry implements BaseColumns {
        public static final String LOCATION_TABLE_NAME = "location";
        public static final String LOCATION_COLUMN_NAME = "loc";
    }

    private static final String TEXT_TYPE = " TEXT";
    private static final String COMMA_SEP = ",";

    public static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + LocationEntry.LOCATION_TABLE_NAME + " (" +
                    LocationEntry.LOCATION_COLUMN_NAME + " )";

    public static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + LocationEntry.LOCATION_TABLE_NAME;
}
