package com.example.recylerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.OnClickAction
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recylerviewkotlin.Model.Contact
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.collections.ArrayList as ArrayList

class MainActivity : AppCompatActivity() {

    private var list=ArrayList<Contact>()
    private lateinit var contact: ContactAdapter
    private lateinit var recyclerView:RecyclerView
    private lateinit var myAdapter:RecyclerView.Adapter<*>
    private lateinit var myLayout:RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        list.add(Contact("andres","11"))
        list.add(Contact("hello","22"))
        list.add(Contact("world","33"))

        myAdapter=ContactAdapter(list)
        myLayout=LinearLayoutManager(this)
        recyclerView=findViewById<RecyclerView>(R.id.recyclerview).apply{
            layoutManager=myLayout
            adapter=myAdapter
        }
        btn_add.setOnClickListener {

            Toast.makeText(applicationContext, "hello", Toast.LENGTH_SHORT).show()
        }
    }

}