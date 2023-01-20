package com.codercamp.recyclerviewpagination

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.facebook.drawee.view.SimpleDraweeView


class RecyclerViewAdapter(private val context: Context) : RecyclerView.Adapter<ViewHolder>() {

    private val items: ArrayList<String> = arrayListOf()

    fun addItem(item: String) {
        items.add(item)
        val insertedAt = items.size - 1
        notifyItemInserted(insertedAt)
    }

    fun clear() {
        val range = items.size
        items.clear()
        notifyItemRangeRemoved(0, range)
    }

    fun addMoreItems(item: ArrayList<String>) {
        val previousRange = items.size
        items.addAll(item)
        val newRange = items.size
        notifyItemRangeInserted(previousRange, newRange)
    }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_photos, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val content = items[position]
        Glide.with(context)
            .load(content)
            .into(holder.itemTextView);

        holder.itemPosition.text = "${position + 1}"

    }

    override fun getItemCount(): Int {
        return items.size
    }
}

class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val itemTextView: SimpleDraweeView = view.findViewById(R.id.sdv_photo)
    val itemPosition: TextView = view.findViewById(R.id.tv_count)
}