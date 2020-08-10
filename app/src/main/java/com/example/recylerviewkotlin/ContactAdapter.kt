package com.example.recylerviewkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recylerviewkotlin.Model.Contact
import kotlinx.android.synthetic.main.list_layout.view.*

class ContactAdapter(val contactList:ArrayList<Contact>):RecyclerView.Adapter<ContactAdapter.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactAdapter.ViewHolder     {
        var view:View=LayoutInflater.from(parent.context).inflate(R.layout.list_layout,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int =contactList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(contactList[position])
    }
    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {

        val tvName:TextView= itemView.tv_name
        val tvAge:TextView=itemView.tv_age
        fun bind(contact: Contact){
            tvName.text=contact.name
            tvAge.text=contact.age
        }
    }
}