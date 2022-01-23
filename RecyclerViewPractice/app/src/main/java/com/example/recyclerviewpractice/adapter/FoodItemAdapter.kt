package com.example.recyclerviewpractice.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewpractice.databinding.ItemListBinding
import com.example.recyclerviewpractice.model.FoodItem

class FoodItemAdapter(private val listener: OnItemClickListener) :
    RecyclerView.Adapter<FoodItemAdapter.FoodItemViewHolder>() {
    private val strings: MutableList<FoodItem> = mutableListOf()

    interface OnItemClickListener {
        fun onItemClick(name: String)
    }
    class FoodItemViewHolder(private val binding: ItemListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun loadString(string: FoodItem) {
            binding.tvList1.text = string.id.toString()
            binding.tvList2.text = string.name
            binding.tvList3.text = string.price.toString()
            binding.tvList4.text = string.description
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodItemViewHolder {
        val binding = ItemListBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return FoodItemViewHolder(binding).also { holder ->
            holder.itemView.setOnClickListener {
                listener.onItemClick(strings[holder.adapterPosition].name)
            }
        }
    }

    override fun onBindViewHolder(holder: FoodItemViewHolder, position: Int) {
        val string = strings[position]
        holder.loadString(string)
    }

    override fun getItemCount() = strings.size

    fun loadList(list: List<FoodItem>) {
        val oldSize = strings.size
        strings.clear()
        notifyItemRangeRemoved(0, oldSize)
        strings.addAll(list)
        notifyItemRangeInserted(0, strings.size)

    }
}