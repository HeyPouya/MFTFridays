package ir.mftvanak.mftfridays;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SqlDBHelper extends SQLiteOpenHelper {

    String TABLE_NAME = "cities";
    String db_create_query = " CREATE TABLE " + TABLE_NAME + "(" +
            "_id INTEGER PRIMARY KEY AUTOINCREMENT ," +
            " city TEXT ,"+
            " temprature INTEGER "+
            ")"+
            "";

    public SqlDBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(db_create_query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }


    public void inserToDB(String city, int temp) {
        String insertQuery = " INSERT INTO " + TABLE_NAME + " (city , temprature) " + " VALUES( " +
               " ' "+city+" ' , '"+temp+"'"+")" +"";
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL(insertQuery);
        db.close();
    }

    public String getCities() {
        String test = "";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT city from " + TABLE_NAME, null);

        while (cursor.moveToNext()) {
            test += cursor.getString(0) + "\n";
        }
        db.close();
        return test;
    }

}
