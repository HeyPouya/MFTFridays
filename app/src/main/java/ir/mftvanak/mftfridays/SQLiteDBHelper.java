package ir.mftvanak.mftfridays;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SQLiteDBHelper extends SQLiteOpenHelper {

    String TABLE_NAME = "students";
    String create_table_students = "" + " CREATE TABLE " + TABLE_NAME + "(" +
            " _id INTEGER PRIMARY KEY AUTOINCREMENT ," +
            "name TEXT ," +
            "family TEXT" +
            ")";


    public SQLiteDBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(create_table_students);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        //if table exists , this query will drop it
        db.execSQL("DROP TABLE  IF EXISTS " + TABLE_NAME);

        //create new table
        onCreate(db);
    }


    public void insertStudent(String name, String family) {

        String insertStudentToDB = "" +
                "INSERT INTO " + TABLE_NAME +
                "(name,family)" +
                "VALUES ('" + name + "','" + family + "')" + "";

        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL(insertStudentToDB);
        db.close();


    }

    public String getStudentsNames() {
        String getNamesQuery = " SELECT name FROM " + TABLE_NAME;
        String names = "";


        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(getNamesQuery,null);
        while (cursor.moveToNext()){
            names+= cursor.getString(0);
        }

        db.close();

        return names;
    }

}
