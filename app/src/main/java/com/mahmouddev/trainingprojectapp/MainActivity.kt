package com.mahmouddev.trainingprojectapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.mahmouddev.trainingprojectapp.database.DatabaseHelper
import com.mahmouddev.trainingprojectapp.databinding.ActivityMainBinding
import com.mahmouddev.trainingprojectapp.util.Constatnts
import com.mahmouddev.trainingprojectapp.util.MyPreferences

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.e(TAG, "onCreate: ")

    val dbHelper =    DatabaseHelper(this)

      //  dbHelper.insert()

        binding.btnLogin.setOnClickListener {
          //  sendDataAsVariables()
            sendDataAsObject()
        }


    }

    private fun sendDataAsVariables(){
        val username =  binding.etUsername.text.toString()
        val password =  binding.etPassword.text.toString()


        val intent = Intent(this, DetailsActivity::class.java)
        intent.putExtra(Constatnts.USERNAME, username)
        intent.putExtra(Constatnts.PASSWORD, password)
        startActivity(intent)
    }

    private fun sendDataAsObject(){
        val std = Student("mohammed", 90.5, 25, false)

        val intent = Intent(this, DetailsActivity::class.java)
        intent.putExtra(Constatnts.STUDENT, std)
        startActivity(intent)
    }


}