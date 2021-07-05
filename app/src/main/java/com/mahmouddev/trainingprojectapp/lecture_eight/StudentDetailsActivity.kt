package com.mahmouddev.trainingprojectapp.lecture_eight

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mahmouddev.trainingprojectapp.R
import com.mahmouddev.trainingprojectapp.databinding.ActivityStudentDetailsBinding

class StudentDetailsActivity : AppCompatActivity() {
    lateinit var binding: ActivityStudentDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStudentDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}