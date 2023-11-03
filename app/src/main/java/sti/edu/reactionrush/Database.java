package sti.edu.reactionrush;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.ContactsContract;

import androidx.annotation.Nullable;

public class Database extends SQLiteOpenHelper {


    public static final String SCORE = "SCORE";

    public Database(@Nullable Context context) {
        super(context, "db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableStatement = "CREATE TABLE SCORE(" + SCORE + " INT)";

        db.execSQL(createTableStatement);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public boolean addScore (findColor findColor){

        SQLiteDatabase db = this.getReadableDatabase();
        ContentValues cv = new ContentValues();

//        cv.put(SCORE, findColor.get)

        return true;
    }
}
