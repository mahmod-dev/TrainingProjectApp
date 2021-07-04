package com.mahmouddev.trainingprojectapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.mahmouddev.trainingprojectapp.adapters.Adapter
import com.mahmouddev.trainingprojectapp.databinding.ActivityRecycleViewBinding

class RecycleViewActivity : AppCompatActivity() {
    lateinit var binding: ActivityRecycleViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecycleViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = ArrayList<Student>()
        data.add(Student("Raghad", 99.9, 23, true))
        data.add(Student("Raghad1", 99.9, 20, false))
        data.add(Student("Raghad2", 99.9, 10, false))
        data.add(Student("Raghad3", 99.9, 50, false))
        data.add(Student("Raghad4", 99.9, 50, false))
        data.add(Student("Raghad5", 99.9, 50, false))
        data.add(Student("Raghad6", 99.9, 50, false))
        data.add(Student("Raghad7", 99.9, 50, false))
        data.add(Student("Raghad8", 99.9, 90, false))
        data.add(Student("Raghad9", 99.9, 40, false))
        data.add(Student("Raghad10", 99.9, 30, false))
        data.add(Student("Raghad11", 99.9, 20, false))
        data.add(Student("Raghad12", 99.9, 10, false))

        val adapter = Adapter(data)
        val manager = GridLayoutManager(this,2)
       // manager.orientation = LinearLayoutManager.HORIZONTAL
        binding.rvStudent.layoutManager =manager
        binding.rvStudent.adapter = adapter

    }
}