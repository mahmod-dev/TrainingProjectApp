package com.mahmouddev.trainingprojectapp.database

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, "test-db", null, 1) {
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(CREATE_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }

    fun insert(studentDB: StudentDB): Boolean {
        val values = ContentValues()
        values.put(NAME, studentDB.name)
        values.put(AGE, studentDB.age)
        values.put(RATE, studentDB.rate)
        values.put(IS_GRADUATE, studentDB.isGraduate)

        val db = writableDatabase
        return db.insert(TABLE_STD, null, values) > 0
    }

    fun update(studentDB: StudentDB): Boolean {
        val values = ContentValues()
        values.put(NAME, studentDB.name)
        values.put(AGE, studentDB.age)
        values.put(RATE, studentDB.rate)
        values.put(IS_GRADUATE, studentDB.isGraduate)

        val db = writableDatabase
        return db.update(TABLE_STD, values, "$ID = ${studentDB.id}", null) > 0
    }

    fun delete(id: Int): Boolean {
        val db = writableDatabase

        return db.delete(TABLE_STD, "$ID = $id", null) > 0
    }


    fun getAllStudents(): ArrayList<StudentDB> {
        val db = readableDatabase
        val data = ArrayList<StudentDB>()

        val cursor = db.rawQuery("SELECT * FROM $TABLE_STD", null)

        if (cursor.moveToFirst()) {

            do {
                val id = cursor.getInt(cursor.getColumnIndex(ID))
                val name = cursor.getString(cursor.getColumnIndex(NAME))
                val age = cursor.getInt(cursor.getColumnIndex(AGE))
                val rate = cursor.getDouble(cursor.getColumnIndex(RATE))
                val isGraduate = cursor.getInt(cursor.getColumnIndex(IS_GRADUATE))

                val std = StudentDB(name, rate, age, isGraduate, id)
                data.add(std)
            } while (cursor.moveToNext())

        }
        cursor.close()
        return data

    }

}