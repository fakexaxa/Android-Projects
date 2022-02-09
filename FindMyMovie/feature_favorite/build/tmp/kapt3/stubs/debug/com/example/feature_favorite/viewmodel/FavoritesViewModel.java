package com.example.feature_favorite.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0016"}, d2 = {"Lcom/example/feature_favorite/viewmodel/FavoritesViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "faves", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/omdb/response/FavoriteMediaItem;", "getFaves", "()Landroidx/lifecycle/LiveData;", "omdbRepo", "Lcom/example/omdb/OmdbRepo;", "getOmdbRepo", "()Lcom/example/omdb/OmdbRepo;", "omdbRepo$delegate", "Lkotlin/Lazy;", "deleteFavList", "", "deleteItem", "id", "", "feature_favorite_debug"})
public final class FavoritesViewModel extends androidx.lifecycle.AndroidViewModel {
    private final kotlin.Lazy omdbRepo$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.omdb.response.FavoriteMediaItem>> faves = null;
    
    public FavoritesViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        super(null);
    }
    
    private final com.example.omdb.OmdbRepo getOmdbRepo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.omdb.response.FavoriteMediaItem>> getFaves() {
        return null;
    }
    
    public final void deleteFavList() {
    }
    
    public final void deleteItem(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
}