package com.example.sqlitedatabase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DatabaseHelper extends SQLiteOpenHelper {
    static final String DATABASE_NAME="DataBASE.DB";
    static final int DATABASE_VERSION=1;

    static final String DATABASE_TABLE= "USERS";
    static final String USER_ID= "_ID";
    static final String USER_NAME="user_name";
    static final String USER_PASSWORD="password";

    private static final String CREATE_DB_QUERY = "CREATE TABLE "+DATABASE_TABLE +" ( "+ USER_ID+ " INTEGER PRIMARY KEY AUTOINCREMENT, "+USER_NAME+ " TEXT NOT NULL,   "+ USER_PASSWORD+ " TEXT NOT NULL );";
    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_DB_QUERY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS "+ DATABASE_TABLE);
    }
}
