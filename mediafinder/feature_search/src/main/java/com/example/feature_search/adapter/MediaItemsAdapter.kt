package com.example.feature_search.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.example.feature_search.adapter.viewholder.MediaItemViewHolder
import com.example.feature_search.model.response.MediaItem
import com.example.feature_search.util.onClick

class MediaItemsAdapter(
    private val mediaClicked: (MediaItem) -> Unit,
) : ListAdapter<MediaItem, MediaItemViewHolder>(diffUtilItemCallback) {

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ) = MediaItemViewHolder.newInstance(parent).onClick { position, _ ->
        mediaClicked(getItem(position))
    }

    override fun onBindViewHolder(holder: MediaItemViewHolder, position: Int) {
        holder.bindMediaItem(getItem(position))
    }

    companion object {

        private val diffUtilItemCallback = object : DiffUtil.ItemCallback<MediaItem>() {
            override fun areItemsTheSame(
                oldItem: MediaItem, newItem: MediaItem
            ) = oldItem.imdbID == newItem.imdbID

            override fun areContentsTheSame(
                oldItem: MediaItem, newItem: MediaItem
            ) = oldItem == newItem
        }
    }

}
