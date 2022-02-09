package com.example.feature_favorite.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/feature_favorite/adapter/MediaItemsAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/omdb/response/FavoriteMediaItem;", "Lcom/example/feature_favorite/adapter/viewholder/MediaItemViewHolder;", "listener", "Lcom/example/feature_favorite/adapter/viewholder/MediaItemViewHolder$OnItemClickListener;", "(Lcom/example/feature_favorite/adapter/viewholder/MediaItemViewHolder$OnItemClickListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "feature_favorite_debug"})
public final class MediaItemsAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.omdb.response.FavoriteMediaItem, com.example.feature_favorite.adapter.viewholder.MediaItemViewHolder> {
    private final com.example.feature_favorite.adapter.viewholder.MediaItemViewHolder.OnItemClickListener listener = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.feature_favorite.adapter.MediaItemsAdapter.Companion Companion = null;
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.omdb.response.FavoriteMediaItem> diffUtilItemCallback = null;
    
    public MediaItemsAdapter(@org.jetbrains.annotations.NotNull()
    com.example.feature_favorite.adapter.viewholder.MediaItemViewHolder.OnItemClickListener listener) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.feature_favorite.adapter.viewholder.MediaItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.feature_favorite.adapter.viewholder.MediaItemViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/feature_favorite/adapter/MediaItemsAdapter$Companion;", "", "()V", "diffUtilItemCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/omdb/response/FavoriteMediaItem;", "feature_favorite_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}