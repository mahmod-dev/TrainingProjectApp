package com.mahmouddev.trainingprojectapp.lecture_eleven

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import com.mahmouddev.trainingprojectapp.adapters.ViewPager2Adapter
import com.mahmouddev.trainingprojectapp.databinding.ActivityViewPager2Binding
import java.util.*
import kotlin.collections.ArrayList

class ViewPager2Activity : AppCompatActivity() {
    var currentPage = 0
    lateinit var binding : ActivityViewPager2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewPager2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {

            val data = ArrayList<String>()
            data.add("https://images.squarespace-cdn.com/content/v1/56a015a2fd5d08b8dcfa998a/1615981537097-16JNLFKOVD35YI7HQWC7/kitchen%2Bextension%2Bcosts2.jpg")
            data.add("https://moodle.fhgr.ch/pluginfile.php/124614/mod_page/content/4/example.jpg")
            data.add("https://upload.wikimedia.org/wikipedia/commons/3/34/Salgadeira_extension.JPG")
            data.add("https://cdn.ca.emap.com/wp-content/uploads/sites/9/2020/12/Barking-Riverside-Extension-Main-steel-framework-for-station-e1607092060887.jpg")
            viewPager2.orientation = ViewPager2.ORIENTATION_HORIZONTAL
           // viewPager2.isUserInputEnabled = false
            viewPager2.adapter = ViewPager2Adapter(data,this@ViewPager2Activity)
         //   autoPlay()





            TabLayoutMediator(tabLayout,viewPager2){ tab,position->

                when(position){
                    0->tab.text = "Profile"
                    1->tab.text = "favorite"
                    2->tab.text = "settings"
                    3->tab.text = "home"

                }

            }.attach()


            indicator.setViewPager(viewPager2)


        }
    }

    private fun autoPlay(){
        val timer = Timer()
        val handler = Handler()
        val runnable = Runnable {
            if (currentPage == 3) {
                currentPage = -1
            }
            currentPage += 1
            binding.viewPager2.setCurrentItem(currentPage, true)
        }

        val timerTask: TimerTask = object : TimerTask() {
            override fun run() {
                handler.post(runnable)
            }
        }
        timer.schedule(timerTask, 0, 4000)

    }

}