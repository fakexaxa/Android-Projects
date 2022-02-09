package com.example.feature_favorite;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J$\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0015H\u0016J\u0010\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\"H\u0016J\u001a\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020%2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006&"}, d2 = {"Lcom/example/feature_favorite/FavoriteFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/example/feature_favorite/adapter/viewholder/MediaItemViewHolder$OnItemClickListener;", "()V", "_binding", "Lcom/example/feature_favorite/databinding/FragmentFavoriteBinding;", "binding", "getBinding", "()Lcom/example/feature_favorite/databinding/FragmentFavoriteBinding;", "mediaItemsAdapter", "Lcom/example/feature_favorite/adapter/MediaItemsAdapter;", "getMediaItemsAdapter", "()Lcom/example/feature_favorite/adapter/MediaItemsAdapter;", "mediaItemsAdapter$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/example/feature_favorite/viewmodel/FavoritesViewModel;", "getViewModel", "()Lcom/example/feature_favorite/viewmodel/FavoritesViewModel;", "viewModel$delegate", "initObservers", "", "initViews", "onCreateView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onItemClick", "item", "Lcom/example/omdb/response/FavoriteMediaItem;", "onViewCreated", "view", "Landroid/view/View;", "feature_favorite_debug"})
public final class FavoriteFragment extends androidx.fragment.app.Fragment implements com.example.feature_favorite.adapter.viewholder.MediaItemViewHolder.OnItemClickListener {
    private com.example.feature_favorite.databinding.FragmentFavoriteBinding _binding;
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy mediaItemsAdapter$delegate = null;
    
    public FavoriteFragment() {
        super();
    }
    
    private final com.example.feature_favorite.databinding.FragmentFavoriteBinding getBinding() {
        return null;
    }
    
    private final com.example.feature_favorite.viewmodel.FavoritesViewModel getViewModel() {
        return null;
    }
    
    private final com.example.feature_favorite.adapter.MediaItemsAdapter getMediaItemsAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.constraintlayout.widget.ConstraintLayout onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void initViews() {
    }
    
    private final void initObservers() {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    com.example.omdb.response.FavoriteMediaItem item) {
    }
}