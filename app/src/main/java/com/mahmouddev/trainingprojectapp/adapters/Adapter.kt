package com.mahmouddev.trainingprojectapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mahmouddev.trainingprojectapp.Student
import com.mahmouddev.trainingprojectapp.databinding.ItemBinding

class Adapter(var data: ArrayList<Student>) : RecyclerView.Adapter<Adapter.MyHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemBinding.inflate(inflater, parent, false)

        return MyHolder(binding)

    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {

        return data.size
    }


    inner class MyHolder(val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(std: Student) {

            binding.tvName.text = std.name
            binding.tvAge.text = std.age.toString()
            binding.tvRate.text = std.rate.toString()
            binding.tvGraduate.text = std.isGraduate.toString()

        }

    }
}