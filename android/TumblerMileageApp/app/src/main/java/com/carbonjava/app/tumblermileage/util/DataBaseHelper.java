package com.carbonjava.app.tumblermileage.util;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.carbonjava.app.tumblermileage.model.TumblerModel;

public class DataBaseHelper extends SQLiteOpenHelper {

    private SQLiteDatabase db;

    private static final String DATABASE_NAME = "TUMBLER_DB";
    private static final String TABLE_NAME = "TUMBLER_TBL";
    private static final String COL_1 = "TUMBLER_ID";
    private static final String COL_2 = "TUMBLER_IMAGE";
    private static final String COL_3 = "USER_ID";
    private static final String COL_4 = "USE_CNT";

    public DataBaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS " + TABLE_NAME + "(TUMBLER_ID INTEGER PRIMARY KEY AUTOINCREMENT, TUMBLER_IMAGE TEXT, USER_ID TEXT, USE_CNT INTEGER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    // 텀블러 등록
    public void insertTask(TumblerModel model) {
        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COL_2, model.getTumbler_image());
        values.put(COL_3, model.getUser_id());
        values.put(COL_4, 0);
        db.insert(TABLE_NAME, null, values);
    }
    
    // 텀블러 사용 -> 사용횟수 증가
    public void updateTask(int tumbler_id){
        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COL_4, );
        db.update(TABLE_NAME, values, "")
    }
}
