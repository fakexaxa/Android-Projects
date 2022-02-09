package com.example.feature_favorite.adapter.viewholder;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/feature_favorite/adapter/viewholder/MediaItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/feature_favorite/databinding/ItemMediaBinding;", "listener", "Lcom/example/feature_favorite/adapter/viewholder/MediaItemViewHolder$OnItemClickListener;", "(Lcom/example/feature_favorite/databinding/ItemMediaBinding;Lcom/example/feature_favorite/adapter/viewholder/MediaItemViewHolder$OnItemClickListener;)V", "bindMediaItem", "", "mediaItem", "Lcom/example/omdb/response/FavoriteMediaItem;", "Companion", "OnItemClickListener", "feature_favorite_debug"})
public final class MediaItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    private final com.example.feature_favorite.databinding.ItemMediaBinding binding = null;
    private final com.example.feature_favorite.adapter.viewholder.MediaItemViewHolder.OnItemClickListener listener = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.feature_favorite.adapter.viewholder.MediaItemViewHolder.Companion Companion = null;
    
    public MediaItemViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.feature_favorite.databinding.ItemMediaBinding binding, @org.jetbrains.annotations.NotNull()
    com.example.feature_favorite.adapter.viewholder.MediaItemViewHolder.OnItemClickListener listener) {
        super(null);
    }
    
    public final void bindMediaItem(@org.jetbrains.annotations.NotNull()
    com.example.omdb.response.FavoriteMediaItem mediaItem) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/feature_favorite/adapter/viewholder/MediaItemViewHolder$OnItemClickListener;", "", "onItemClick", "", "item", "Lcom/example/omdb/response/FavoriteMediaItem;", "feature_favorite_debug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
        com.example.omdb.response.FavoriteMediaItem item);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/example/feature_favorite/adapter/viewholder/MediaItemViewHolder$Companion;", "", "()V", "newInstance", "Lcom/example/feature_favorite/adapter/viewholder/MediaItemViewHolder;", "parent", "Landroid/view/ViewGroup;", "listener", "Lcom/example/feature_favorite/adapter/viewholder/MediaItemViewHolder$OnItemClickListener;", "feature_favorite_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.feature_favorite.adapter.viewholder.MediaItemViewHolder newInstance(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, @org.jetbrains.annotations.NotNull()
        com.example.feature_favorite.adapter.viewholder.MediaItemViewHolder.OnItemClickListener listener) {
            return null;
        }
    }
}