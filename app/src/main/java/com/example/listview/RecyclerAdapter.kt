package com.example.listview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(val companylist:List<CompanyCurrency>) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>()  {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.innerlayout, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return companylist.size
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        //holder.bindItems(companylist[position])
        val dataModel=companylist.get(position)

        holder.titleTextView.text=dataModel.name
    }
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        lateinit var titleTextView:TextView
        init {
            titleTextView=itemView.findViewById(R.id.textView2)
            titleTextView=itemView.findViewById(R.id.textView3)

        }
    }
}