package com.mahmouddev.trainingprojectapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Student(
    val name:String,
    val rate: Double,
    val age: Int,
    val isGraduate: Boolean
):Parcelable
