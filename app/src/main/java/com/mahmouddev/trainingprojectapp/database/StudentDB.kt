package com.mahmouddev.trainingprojectapp.database

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class StudentDB(
    val name:String,
    val rate: Double,
    val age: Int,
    val isGraduate: Int, //1 graduated, 0 not graduated
    val id:Int =0
):Parcelable

const val ID = "id"
const val NAME = "name"
const val RATE = "rate"
const val AGE ="age"
const val IS_GRADUATE ="is_graduated"
const val TABLE_STD ="student_tb"

const val CREATE_TABLE = "CREATE TABLE $TABLE_STD (" +
        "$ID INTEGER PRIMARY KEY AUTOINCREMENT,"+
        "$NAME TEXT,"+
        "$RATE DOUBLE,"+
        "$AGE INTEGER,"+
        "$IS_GRADUATE INTEGER"+
        ")"
