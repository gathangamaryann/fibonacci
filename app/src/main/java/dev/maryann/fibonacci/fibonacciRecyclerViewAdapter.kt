package dev.maryann.fibonacci

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NamesRecyclerViewAdapter(var fibonacciList:List<Int>):
    RecyclerView.Adapter<NumbersViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder {
        var itemView= LayoutInflater.from(parent.context)
            .inflate(R.layout.fibonacci_list,parent,false)
        return NumbersViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
        holder.tvFibonacci.text=fibonacciList.get(position).toString()
    }

    override fun getItemCount(): Int {
        return fibonacciList.size
    }
}

class NumbersViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvFibonacci = itemView.findViewById<TextView>(R.id .tvFibonacci)
    }
