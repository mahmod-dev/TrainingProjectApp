package com.mahmouddev.trainingprojectapp.lecture_eleven

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mahmouddev.trainingprojectapp.R
import com.mahmouddev.trainingprojectapp.databinding.ActivityBasicBinding

class BasicActivity : AppCompatActivity() {
    lateinit var binding : ActivityBasicBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBasicBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val fragment = ProfileFragment()

        supportFragmentManager.beginTransaction().replace(R.id.container,fragment).commit()

    }
}