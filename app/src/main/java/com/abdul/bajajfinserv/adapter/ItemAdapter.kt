package com.abdul.bajajfinserv.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.abdul.bajajfinserv.R
import com.abdul.bajajfinserv.model.Affirmation

/**
 * like a electrical adapter adapts a 3 pin plug to a 2 pin socket
 * this adapter will adapt the dataset to the textview in list_item.xml
 * ie get each affirmation from the list and put that into each textview in item.xml
 */

class ItemAdapter(private val context: Context,
                  private val  dataset: List<Affirmation>)
    :RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(){

    /**
     * he will hold the views that would be recycled with new data
     */
    class ItemViewHolder(private val view: View):RecyclerView.ViewHolder(view){
        val vhtextView: TextView = view.findViewById(R.id.textViewListItem)
    }

    /**
     * go to market and buy new plank or create a new list row layout
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // TODO: 13-07-2021 return a new itemviewholder
        val rowLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item,parent,false)
        return ItemViewHolder(rowLayout)

    }

    /**
     * his handwriting is good, he'll write the dish name on the plank ---WRITER
     */
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position] //item will be of type affirmation since dataset is of type list<affirmation>
        holder.vhtextView.text = context.resources.getString(item.stringResourceId)
    }

    /**
     * keep a count of no of items in the dataset
     */
    override fun getItemCount(): Int {
    return  dataset.size
    }
}