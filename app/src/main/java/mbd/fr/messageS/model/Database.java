package mbd.fr.messageS.model;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;


//Define a schema and contract
public class  Database {
    private static Database INSTANCE;
    private SQLiteOpenHelper mDbHelper;

    private Database(SQLiteOpenHelper mDbHelper) {
        this.mDbHelper = mDbHelper;
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
// DAO
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
        SQLiteDatabase db = mDbHelper.getWritableDatabase();

// Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(ContactContract.FeedContact.COLUMN_NAME_LASTNAME, name);
        values.put(ContactContract.FeedContact.COLUMN_NAME_FIRSTNAME, lname);
        values.put(ContactContract.FeedContact.COLUMN_NAME_LOGIN, login);
        values.put(ContactContract.FeedContact.COLUMN_NAME_PASSWORD, pass);

// Insert the new row, returning the primary key value of the new row
        long newRowId = db.insert(ContactContract.FeedContact.TABLE_NAME, null, values);
        Log.i("Database","AddPerson invoked, "+name+" created");

    }

    public List<Person> readPerson()
    {
        SQLiteDatabase db = mDbHelper.getReadableDatabase();
        String[] projection = {
                BaseColumns._ID,
                ContactContract.FeedContact.COLUMN_NAME_LASTNAME,
                ContactContract.FeedContact.COLUMN_NAME_FIRSTNAME
        };


        String selection = "";
        String[] selectionArgs = null;

        String sortOrder =
                ContactContract.FeedContact.COLUMN_NAME_LASTNAME + " DESC";

        Cursor cursor = db.query(
                ContactContract.FeedContact.TABLE_NAME,   // The table to query
                projection,             // The array of columns to return (pass null to get all)
                selection,              // The columns for the WHERE clause
                selectionArgs,          // The values for the WHERE clause
                null,                   // don't group the rows
                null,                   // don't filter by row groups
                sortOrder               // The sort order
        );



        List persons = new ArrayList<Person>();
        while(cursor.moveToNext())
        {
            long itemId = cursor.getLong(cursor.getColumnIndexOrThrow(ContactContract.FeedContact._ID));
            String nom = cursor.getString(cursor.getColumnIndex(ContactContract.FeedContact.COLUMN_NAME_LASTNAME));
            String prenom = cursor.getString(cursor.getColumnIndex(ContactContract.FeedContact.COLUMN_NAME_FIRSTNAME));
            String userName= cursor.getString(cursor.getColumnIndex(ContactContract.FeedContact.COLUMN_NAME_LOGIN));
            String passWord= cursor.getString(cursor.getColumnIndex(ContactContract.FeedContact.COLUMN_NAME_PASSWORD));
            persons.add(new Person(nom,prenom, userName,passWord));
        }
        cursor.close();

        return persons;
    }

}
