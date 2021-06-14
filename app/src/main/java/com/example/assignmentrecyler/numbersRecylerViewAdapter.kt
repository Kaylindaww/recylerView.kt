package com.example.assignmentrecyler

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class numbersRecylerViewAdapter(var numberList: List<BigInteger>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
//     var itemView= LayoutInflater.from(parent.context).inflate(R.layout.num_list_item,parent,false)
//        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder.tvNumbers.text=numberList.get(position).toString()
    }

    override fun getItemCount(): Int {
        return numberList.size
    }
}
class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
    var tvNumbers = itemView.findViewById<TextView>(R.id.tvNumbers)
}
