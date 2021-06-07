package com.example.itcourses.ui.listmy

import android.annotation.SuppressLint
import com.example.itcourses.data.model.Person
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.itcourses.R

class ListMyAdapter: RecyclerView.Adapter<ListMyAdapter.PersonViewHolder>() {

    var persList: List<Person> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_person, parent, false)
        return PersonViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        holder.view.setBackgroundColor(persList[position].color)
        holder.textView.text = persList[position].name+" "+persList[position].age
    }

    override fun getItemCount(): Int {
        return persList.size
    }

    inner class PersonViewHolder(val view: View): RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.personNameTextView)
    }
}
