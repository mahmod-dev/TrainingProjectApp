package com.mahmouddev.trainingprojectapp.lecture_eight

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.mahmouddev.trainingprojectapp.R
import com.mahmouddev.trainingprojectapp.Student
import com.mahmouddev.trainingprojectapp.databinding.ActivityStudentDetailsBinding

class StudentDetailsActivity : AppCompatActivity() {
    val TAG = "StudentDetailsActivity"
    lateinit var binding: ActivityStudentDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStudentDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
       val student = intent.extras?.getParcelable<Student>("student")

        Log.e(TAG, "onCreate: $student", )
    }
}