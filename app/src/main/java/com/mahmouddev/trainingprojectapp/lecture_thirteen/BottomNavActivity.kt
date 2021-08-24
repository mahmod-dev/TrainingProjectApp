package com.mahmouddev.trainingprojectapp.lecture_thirteen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.mahmouddev.trainingprojectapp.R
import com.mahmouddev.trainingprojectapp.databinding.ActivityBottomNavBinding
import com.mahmouddev.trainingprojectapp.lecture_eleven.FavoriteFragment
import com.mahmouddev.trainingprojectapp.lecture_eleven.ProfileFragment
import com.mahmouddev.trainingprojectapp.lecture_eleven.SettingsFragment

class BottomNavActivity : AppCompatActivity() {
    lateinit var binding: ActivityBottomNavBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBottomNavBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setCurrentFragment(SettingsFragment())

        binding.bottomNav.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.bottomFavorite -> {
                    setCurrentFragment(FavoriteFragment())
                }

                R.id.bottomProfile -> {
                    setCurrentFragment(ProfileFragment())
                }

                R.id.bottomSettings -> {
                    setCurrentFragment(SettingsFragment())
                }
            }

            true
        }
    }

    private fun setCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.container, fragment).commit()

    }
}