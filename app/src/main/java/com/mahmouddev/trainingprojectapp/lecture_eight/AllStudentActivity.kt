package com.mahmouddev.trainingprojectapp.lecture_eight

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mahmouddev.trainingprojectapp.R
import com.mahmouddev.trainingprojectapp.databinding.ActivityAllStudentBinding

class AllStudentActivity : AppCompatActivity() {
    lateinit var binding: ActivityAllStudentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAllStudentBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}