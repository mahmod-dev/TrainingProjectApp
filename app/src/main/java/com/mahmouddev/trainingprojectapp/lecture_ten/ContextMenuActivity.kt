package com.mahmouddev.trainingprojectapp.lecture_ten

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.mahmouddev.trainingprojectapp.R
import com.mahmouddev.trainingprojectapp.databinding.ActivityContextMenuBinding

class ContextMenuActivity : AppCompatActivity() {
    lateinit var binding: ActivityContextMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContextMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)
        registerForContextMenu(binding.tvMenu)

    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menu?.setHeaderTitle("choose one")
        menu?.add(0,1,0,"title1")
        menu?.add(0,2,0,"title2")
        menu?.add(0,3,0,"title3")
    //    menuInflater.inflate(R.menu.context_menu,menu)

    }

    override fun onContextItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.itemCopy->{
                Toast.makeText(this,"${item.title}", Toast.LENGTH_SHORT).show()

            }
            R.id.itemDelete->{
                Toast.makeText(this,"${item.title}",Toast.LENGTH_SHORT).show()

            }
            R.id.itemEdit->{
                Toast.makeText(this,"${item.title}",Toast.LENGTH_SHORT).show()

            }
        }
        return super.onContextItemSelected(item)
    }

}