package com.mahmouddev.trainingprojectapp.lecture_eleven

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.mahmouddev.trainingprojectapp.R
import com.mahmouddev.trainingprojectapp.databinding.FragmentProfileBinding

class ProfileFragment : Fragment(R.layout.fragment_profile) {
    lateinit var binding: FragmentProfileBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentProfileBinding.bind(view)
    }
}