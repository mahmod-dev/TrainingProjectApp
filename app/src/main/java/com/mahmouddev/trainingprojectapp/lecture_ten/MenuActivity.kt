package com.mahmouddev.trainingprojectapp.lecture_ten

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.mahmouddev.trainingprojectapp.R
import com.mahmouddev.trainingprojectapp.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {
    lateinit var binding: ActivityMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.item1->{
                binding.container.setBackgroundColor(ContextCompat.getColor(this,R.color.red))
                Toast.makeText(this,"${item.title}",Toast.LENGTH_SHORT).show()
            }
            R.id.item2->{
                binding.container.setBackgroundColor(Color.YELLOW)

                Toast.makeText(this,"${item.title}",Toast.LENGTH_SHORT).show()

            }
            R.id.item3->{
                binding.container.setBackgroundColor(Color.GREEN)

                Toast.makeText(this,"${item.title}",Toast.LENGTH_SHORT).show()

            }
            R.id.item4->{
                binding.container.setBackgroundColor(ContextCompat.getColor(this,R.color.black))

                Toast.makeText(this,"${item.title}",Toast.LENGTH_SHORT).show()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}