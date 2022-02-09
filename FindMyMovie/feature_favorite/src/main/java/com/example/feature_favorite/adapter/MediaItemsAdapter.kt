package com.example.feature_favorite.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.example.feature_favorite.adapter.viewholder.MediaItemViewHolder
import com.example.omdb.response.FavoriteMediaItem

class MediaItemsAdapter(private val listener: MediaItemViewHolder.OnItemClickListener) : ListAdapter<FavoriteMediaItem, MediaItemViewHolder>(diffUtilItemCallback) {

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ) = MediaItemViewHolder.newInstance(parent,listener)

    override fun onBindViewHolder(holder: MediaItemViewHolder, position: Int) {
        holder.bindMediaItem(getItem(position))
    }

    companion object {

        private val diffUtilItemCallback = object : DiffUtil.ItemCallback<FavoriteMediaItem>() {
            override fun areItemsTheSame(
                oldItem: FavoriteMediaItem, newItem: FavoriteMediaItem
            ) = oldItem.imdbID == newItem.imdbID

            override fun areContentsTheSame(
                oldItem: FavoriteMediaItem, newItem: FavoriteMediaItem
            ) = oldItem == newItem
        }
    }

}
