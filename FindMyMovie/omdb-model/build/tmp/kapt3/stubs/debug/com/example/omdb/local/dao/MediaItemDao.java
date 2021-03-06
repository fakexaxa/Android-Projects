package com.example.omdb.local.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0003H\'J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\tH\'J%\u0010\u000b\u001a\u00020\u00032\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\r\"\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/example/omdb/local/dao/MediaItemDao;", "", "delete", "", "user", "Lcom/example/omdb/response/MediaItem;", "(Lcom/example/omdb/response/MediaItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteMediaItems", "getAll", "Lkotlinx/coroutines/flow/Flow;", "", "insertAll", "users", "", "([Lcom/example/omdb/response/MediaItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertItem", "omdb-model_debug"})
public abstract interface MediaItemDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM media_item")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.omdb.response.MediaItem>> getAll();
    
    @androidx.room.Query(value = "DELETE  FROM media_item")
    public abstract void deleteMediaItems();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert()
    public abstract java.lang.Object insertAll(@org.jetbrains.annotations.NotNull()
    com.example.omdb.response.MediaItem[] users, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert()
    public abstract java.lang.Object insertItem(@org.jetbrains.annotations.NotNull()
    com.example.omdb.response.MediaItem users, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    com.example.omdb.response.MediaItem user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}