package com.example.feature_search.adapter.viewholder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.size.Scale
import coil.transform.RoundedCornersTransformation
import com.example.feature_search.databinding.ItemMediaBinding
import com.example.findmymovie.R
import com.example.omdb.response.MediaItem

class MediaItemViewHolder(
    private val binding: ItemMediaBinding,
    private val listener: OnItemClickListener
) : RecyclerView.ViewHolder(binding.root) {

    interface OnItemClickListener {
        fun onItemClick(item: MediaItem)
    }

    fun bindMediaItem(mediaItem: MediaItem) {
        binding.tvTitle.text = mediaItem.title
        binding.ivPoster.load(mediaItem.poster) {
            scale(Scale.FIT)
            crossfade(true)
            crossfade(500)
            placeholder(R.drawable.no_image)
            transformations(RoundedCornersTransformation(25f))
            build()
        }
        binding.ivFavIcon.setOnClickListener {
            listener.onItemClick(mediaItem)
            binding.ivFavIcon.setImageResource(com.example.feature_search.R.drawable.ic_favorite_yellow)
        }

    }

    companion object {
        fun newInstance(parent: ViewGroup, listener: OnItemClickListener) =
            ItemMediaBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            ).let { binding -> MediaItemViewHolder(binding, listener) }
    }
}
