package com.mahmouddev.trainingprojectapp.lecture_eleven

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mahmouddev.trainingprojectapp.databinding.ActivityTabBinding

class TabActivity : AppCompatActivity() {
    lateinit var binding : ActivityTabBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTabBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {

            viewPager.adapter = MyViewPagerAdapter(supportFragmentManager)
            tabLayout.setupWithViewPager(viewPager)

        }
    }
}