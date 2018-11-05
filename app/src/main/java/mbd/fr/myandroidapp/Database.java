package mbd.fr.myandroidapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

public class Database {
    private static Database INSTANCE;
    private SQLiteOpenHelper helper;

    private Database(SQLiteOpenHelper helper) {
        this.helper = helper;
        if(INSTANCE == null){
            INSTANCE = this;
        }
    }

    public static Database getInstance(Context ctx){
        if(INSTANCE == null){
            SQLiteOpenHelper helper = new ContactHelper(ctx);
            INSTANCE = new Database(helper);
        }

        return INSTANCE;
    }

    public final class ContactContract{
        private ContactContract() {}
        public class FeedContact implements BaseColumns
        {
            public static final String TABLE_NAME = "Contact";
            public static final String COLUMN_NAME_LASTNAME = "Nom";
            public static final String COLUMN_NAME_FIRSTNAME = "Prenom";
            public static final String COLUMN_NAME_LOGIN = "login";
            public static final String COLUMN_NAME_PASSWORD = "password";
        }
    }

    public void addPerson(String name,String lname, String login, String pass)
    {
        // Gets the data repository in write mode
        SQLiteDatabase db = helper.getWritableDatabase();

// Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(ContactContract.FeedContact.COLUMN_NAME_LASTNAME, name);
        values.put(ContactContract.FeedContact.COLUMN_NAME_FIRSTNAME, lname);
        values.put(ContactContract.FeedContact.COLUMN_NAME_LOGIN, login);
        values.put(ContactContract.FeedContact.COLUMN_NAME_PASSWORD, pass);

// Insert the new row, returning the primary key value of the new row
        long newRowId = db.insert(ContactContract.FeedContact.TABLE_NAME, null, values);
    }
}
