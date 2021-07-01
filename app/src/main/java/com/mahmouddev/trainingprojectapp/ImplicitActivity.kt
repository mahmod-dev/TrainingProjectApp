package com.mahmouddev.trainingprojectapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mahmouddev.trainingprojectapp.databinding.ActivityImplicitBinding

class ImplicitActivity : AppCompatActivity() {
    lateinit var binding: ActivityImplicitBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImplicitBinding.inflate(layoutInflater)
        setContentView(binding.root)

        goToWebsite()
        callNumber()
        sendSms()
        goToLocation()
    }

    private fun goToWebsite() {
        binding.btnWebsite.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_VIEW
            intent.data = Uri.parse("https://facebook.com/")
            startActivity(intent)
        }

    }

    private fun callNumber() {
        binding.btnCall.setOnClickListener {

            val intent = Intent()
            intent.action = Intent.ACTION_CALL
            intent.data = Uri.parse("tel:0599999999")
            startActivity(intent)

        }
    }

    private fun sendSms() {
        binding.btnSms.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_VIEW
            intent.data = Uri.parse("smsto:054444444444")
            intent.putExtra("sms_body", "هذه الرسالة النصية التي سوف اقوم بارسالها")
            startActivity(intent)

        }
    }

    private fun goToLocation(){
        binding.btnLocation.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_VIEW
            intent.data = Uri.parse("geo:31.95,35.23")
            startActivity(intent)
        }
    }
}