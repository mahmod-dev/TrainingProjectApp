package com.mahmouddev.trainingprojectapp.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mahmouddev.trainingprojectapp.R
import com.mahmouddev.trainingprojectapp.Student
import com.mahmouddev.trainingprojectapp.databinding.ItemBinding
import com.mahmouddev.trainingprojectapp.databinding.ItemViewpagerBinding
import com.mahmouddev.trainingprojectapp.lecture_eight.StudentDetailsActivity
import com.squareup.picasso.Picasso

class ViewPager2Adapter(private val data: ArrayList<String>,var context: Context) :
    RecyclerView.Adapter<ViewPager2Adapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemViewpagerBinding.inflate(inflater, parent, false)

        return Holder(binding)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }


    inner class Holder(private val binding: ItemViewpagerBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(imgUrl: String) {

              /*  Picasso.get()
                    .load(imgUrl)
                    .into(binding.img)*/

            Glide
                .with(context)
                .load(imgUrl)
                .centerCrop()
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_close)
                .into(binding.img)


        }

    }

}