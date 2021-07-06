package com.mahmouddev.trainingprojectapp.lecture_eight

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.mahmouddev.trainingprojectapp.R
import com.mahmouddev.trainingprojectapp.Student
import com.mahmouddev.trainingprojectapp.adapters.CustomAdapter
import com.mahmouddev.trainingprojectapp.databinding.ActivityAllStudentBinding

class AllStudentActivity : AppCompatActivity() {
    val TAG = "AllStudentActivity"
    lateinit var binding: ActivityAllStudentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAllStudentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = ArrayList<Student>()
        data.add(Student("Raghad", 90.5, 23, true))
        data.add(Student("Ahmed", 85.9, 25, false))
        data.add(Student("Ali", 70.0, 30, true))
        data.add(Student("Hasan", 69.9, 19, false))
        data.add(Student("Doaa", 59.9, 29, false))
        data.add(Student("Khalid", 99.9, 33, true))

        val manager = LinearLayoutManager(this)
        manager.orientation = LinearLayoutManager.VERTICAL

        val adapter = CustomAdapter(data, this)
        val name = "Ali"
        binding.rvStudents.layoutManager = manager
        binding.rvStudents.adapter = adapter

        adapter.onItemClick = {position,student->
            Log.e(TAG, "onItemClick: position: $position student: $student" )

            val intent = Intent(this,StudentDetailsActivity::class.java)
            intent.putExtra("student",student)
            startActivity(intent)

        }


    }
}