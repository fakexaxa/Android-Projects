package com.example.omdb;

import java.lang.System;

/**
 * Using object makes this instance a Singleton Class, which means only 1 instance of this class will ever exist
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u0011\u0010\u001e\u001a\u00020\u001aH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u0019\u0010 \u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ*\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010$\u001a\u00020\u001cH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\b%\u0010\u001dR\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006&"}, d2 = {"Lcom/example/omdb/OmdbRepo;", "", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "favMediaItemDao", "Lcom/example/omdb/local/dao/FavoriteItemDao;", "getFavMediaItemDao", "()Lcom/example/omdb/local/dao/FavoriteItemDao;", "favMediaItemDao$delegate", "Lkotlin/Lazy;", "favMediaItems", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/omdb/response/FavoriteMediaItem;", "getFavMediaItems", "()Lkotlinx/coroutines/flow/Flow;", "mediaItemDao", "Lcom/example/omdb/local/dao/MediaItemDao;", "getMediaItemDao", "()Lcom/example/omdb/local/dao/MediaItemDao;", "mediaItemDao$delegate", "mediaItems", "Lcom/example/omdb/response/MediaItem;", "getMediaItems", "addItemToFavorites", "", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteFavList", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteItem", "searchByQuery", "Lkotlin/Result;", "Lcom/example/omdb/response/SearchResponse;", "query", "searchByQuery-gIAlu-s", "omdb-model_debug"})
public final class OmdbRepo {
    private final kotlin.Lazy mediaItemDao$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.example.omdb.response.MediaItem>> mediaItems = null;
    private final kotlin.Lazy favMediaItemDao$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.example.omdb.response.FavoriteMediaItem>> favMediaItems = null;
    
    public OmdbRepo(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        super();
    }
    
    private final com.example.omdb.local.dao.MediaItemDao getMediaItemDao() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.omdb.response.MediaItem>> getMediaItems() {
        return null;
    }
    
    private final com.example.omdb.local.dao.FavoriteItemDao getFavMediaItemDao() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.omdb.response.FavoriteMediaItem>> getFavMediaItems() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addItemToFavorites(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteFavList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteItem(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}