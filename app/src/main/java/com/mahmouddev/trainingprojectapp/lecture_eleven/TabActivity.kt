package com.mahmouddev.trainingprojectapp.lecture_eleven

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.android.material.tabs.TabLayout
import com.mahmouddev.trainingprojectapp.databinding.ActivityTabBinding

class TabActivity : AppCompatActivity() {
    val TAG = "TabActivity"
    lateinit var binding : ActivityTabBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTabBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {

            viewPager.adapter = MyViewPagerAdapter(supportFragmentManager)
            tabLayout.setupWithViewPager(viewPager)

            tabLayout.addOnTabSelectedListener(object:TabLayout.OnTabSelectedListener{
                override fun onTabSelected(tab: TabLayout.Tab?) {
                    Log.e(TAG, "onTabSelected: ${tab?.text}", )
                }

                override fun onTabUnselected(tab: TabLayout.Tab?) {
                }

                override fun onTabReselected(tab: TabLayout.Tab?) {
                }

            } )

        }
    }
}