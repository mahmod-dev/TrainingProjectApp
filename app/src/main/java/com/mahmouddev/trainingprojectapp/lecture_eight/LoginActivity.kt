package com.mahmouddev.trainingprojectapp.lecture_eight

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.mahmouddev.trainingprojectapp.databinding.ActivityLoginBinding
import com.mahmouddev.trainingprojectapp.util.Constatnts
import com.mahmouddev.trainingprojectapp.util.MyPreferences

class LoginActivity : AppCompatActivity() {
    val TAG = "LoginActivity"
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        MyPreferences.context = this

        val prefLogin = MyPreferences.getBool("isLogin")
        Log.e(TAG, "onCreate: $prefLogin")
        binding.apply {

            if (prefLogin) {
                val intent = Intent(this@LoginActivity, AllStudentActivity::class.java)
                startActivity(intent)
                finish()
            }

            btnLogin.setOnClickListener {
                val username = etUsername.text.toString()
                val password = etPassword.text.toString()
                val cbRemind = cbReminder.isChecked


                if (username.isEmpty()) {
                    etUsername.error = "Username Empty!"
                    return@setOnClickListener
                } else {
                    MyPreferences.setStr("name", username)
                }

                if (password.isEmpty()) {
                    etPassword.error = "Password Empty!"
                    return@setOnClickListener

                } else {

                    if (password.length >= 6) {
                        MyPreferences.setStr("password", password)
                    } else {
                        etPassword.error = "Password length less than 6!"
                        return@setOnClickListener
                    }

                }


                MyPreferences.setBool("isLogin", cbRemind)

                val intent = Intent(this@LoginActivity, AllStudentActivity::class.java)
                startActivity(intent)
                finish()

            }
        }
    }
}