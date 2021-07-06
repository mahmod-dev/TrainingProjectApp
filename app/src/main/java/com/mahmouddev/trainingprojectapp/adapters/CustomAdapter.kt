package com.mahmouddev.trainingprojectapp.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.mahmouddev.trainingprojectapp.R
import com.mahmouddev.trainingprojectapp.Student
import com.mahmouddev.trainingprojectapp.databinding.ItemBinding
import com.mahmouddev.trainingprojectapp.lecture_eight.StudentDetailsActivity

class CustomAdapter(private val data: ArrayList<Student>,val context: Context) :
    RecyclerView.Adapter<CustomAdapter.Holder>() {
    var onItemClick: ((Int,Student)->Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemBinding.inflate(inflater, parent, false)

        return Holder(binding)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }


    inner class Holder(private val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(student: Student) {

            binding.apply {
                tvName.text = student.name

                when (student.rate) {
                    in 90.0..99.9 -> tvRate.text = "Excellent"
                    in 80.0..89.9 -> tvRate.text = "Very Good"
                    in 70.0..79.9 -> tvRate.text = "Good"
                    in 60.0..69.9 -> tvRate.text = "Acceptable"
                    else -> tvRate.text = "Failed"
                }

                if (student.isGraduate){
                    tvGraduate.setBackgroundColor(ContextCompat.getColor(context,R.color.teal_200))
                    tvGraduate.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_check,0,0,0)
                    tvGraduate.text = "Graduated"
                }else{
                    tvGraduate.setBackgroundColor(ContextCompat.getColor(context,R.color.red_light))
                    tvGraduate.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_close,0,0,0)
                    tvGraduate.text = "Not Graduated"
                }

                tvAge.text = student.age.toString()

                rlItem.setOnClickListener {
                 /*   val intent = Intent(context,StudentDetailsActivity::class.java)
                    intent.putExtra("student",student)
                    context.startActivity(intent)*/

                    onItemClick?.invoke(adapterPosition,student)

                }

            }


        }

    }

}