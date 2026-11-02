
package com.example.dz_1_views

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NumberAdapter(
    private val numbers: List<Int>
) : RecyclerView.Adapter<NumberAdapter.NumberViewHolder>() {

    class NumberViewHolder(val textView: TextView) :
        RecyclerView.ViewHolder(textView)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): NumberViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_number, parent, false) as TextView

        return NumberViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: NumberViewHolder,
        position: Int
    ) {
        holder.textView.text = numbers[position].toString()
    }

    override fun getItemCount(): Int {
        return numbers.size
    }
}
