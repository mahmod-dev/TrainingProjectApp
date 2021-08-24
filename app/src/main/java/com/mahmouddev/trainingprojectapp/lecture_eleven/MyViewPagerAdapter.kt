package com.mahmouddev.trainingprojectapp.lecture_eleven

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class MyViewPagerAdapter(fm:FragmentManager) : FragmentStatePagerAdapter(fm) {
    val list = arrayOf("Profile","Favorite","Profile","Favorite","Profile","Favorite","Profile","Favorite",)

    override fun getItem(position: Int): Fragment {

        when(position){
            0->{
                return ProfileFragment()
            }
            1->{
                return FavoriteFragment()
            }
        }


        return ProfileFragment()
    }

    override fun getCount(): Int {
       return list.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
      return  list[position]
    }

}