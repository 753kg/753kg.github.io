package com.example.testapp.util;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataBaseHelper extends SQLiteOpenHelper {

    private SQLiteDatabase db;

    private static final String DATABASE_NAME = "TUMBLER_DB";
    private static final String TABLE_NAME = "TUMBLER_TBL";
    private static final String COL_1 = "TUMBLER_ID";
    private static final String COL_2 = "TUMBLER_IMAGE";
    private static final String COL_3 = "MEMBER_ID";
    private static final String COL_4 = "USE_CNT";

    public DataBaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS " + TABLE_NAME + "(TUMBLER_ID INTEGER PRIMARY KEY AUTOINCREMENT, TUMBLER_IMAGE TEXT, MEMBER_ID TEXT, USE_CNT INTEGER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

}
