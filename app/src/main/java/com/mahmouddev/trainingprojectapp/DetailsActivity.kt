package com.mahmouddev.trainingprojectapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mahmouddev.trainingprojectapp.databinding.ActivityDetailsBinding
import com.mahmouddev.trainingprojectapp.util.Constatnts

class DetailsActivity : AppCompatActivity() {
    lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
       // receiveDataAsVariables()


    }

    private fun receiveDataAsVariables() {
        val name = intent.extras?.getString(Constatnts.USERNAME)
        val password = intent.extras?.getString(Constatnts.PASSWORD)

        binding.tvUsername.text = name
        binding.tvPassword.text = password
    }

    private fun receiveDataAsObject(){
        val std =  intent.extras?.getParcelable<Student>(Constatnts.STUDENT)

        binding.tvUsername.text = "${ std?.name} \n ${std?.age} \n ${std?.rate} \n ${std?.isGraduate}"
    }



}