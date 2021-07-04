package com.mahmouddev.trainingprojectapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mahmouddev.trainingprojectapp.databinding.ActivitySharedPrefBinding

class SharedPrefActivity : AppCompatActivity() {
    lateinit var binding: ActivitySharedPrefBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySharedPrefBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val pref = getSharedPreferences("MyPref", MODE_PRIVATE)

        val edit = pref.edit()

        binding.btnSave.setOnClickListener {
          //  val name = binding.etName.text.toString()

            edit.putString("name", "Raghad").apply()
            edit.putInt("age", 23).apply()
            edit.putFloat("rate", 90.5f).apply()
            edit.putLong("data", 50L).apply()
            edit.putBoolean("isRegister", true).apply()
        }

        binding.btnRead.setOnClickListener {
            val age = pref.getBoolean("IsRegister", false)

            binding.tvRead.text = age.toString()
        }


    }
}