package com.example.see_database

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.TextView



class dbcontroller(context: Context) : SQLiteOpenHelper(context, "std.db", null, 1) {

    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL("CREATE TABLE STUDENT(FNAME TEXT, LNAME TEXT);")
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS STUDENT")
        onCreate(db)
    }

    fun insert(fname: String, lname: String) {
        val values = ContentValues().apply {
            put("FNAME", fname)
            put("LNAME", lname)
        }
        writableDatabase.insert("STUDENT", null, values)
    }

    fun delete(fname: String) {
        writableDatabase.delete("STUDENT", "FNAME=?", arrayOf(fname))
    }

    fun update(oldFname: String, newFname: String) {
        writableDatabase.execSQL(
            "UPDATE STUDENT SET FNAME = ? WHERE FNAME = ?",
            arrayOf(newFname, oldFname)
        )
    }

    fun list(target: TextView?) {
        target?.text = ""
        val cursor = readableDatabase.rawQuery("SELECT * FROM STUDENT", null)
        while (cursor.moveToNext()) {
            target?.append("${cursor.getString(0)} ${cursor.getString(1)}\n")
        }
        cursor.close()
    }
}
