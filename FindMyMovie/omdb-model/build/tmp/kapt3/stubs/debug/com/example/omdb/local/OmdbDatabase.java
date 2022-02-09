package com.example.omdb.local;

import java.lang.System;

@androidx.room.Database(entities = {com.example.omdb.response.MediaItem.class, com.example.omdb.response.FavoriteMediaItem.class}, version = 2)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/example/omdb/local/OmdbDatabase;", "Landroidx/room/RoomDatabase;", "()V", "favoriteItemDao", "Lcom/example/omdb/local/dao/FavoriteItemDao;", "mediaItemDao", "Lcom/example/omdb/local/dao/MediaItemDao;", "Companion", "omdb-model_debug"})
public abstract class OmdbDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.omdb.local.OmdbDatabase.Companion Companion = null;
    private static com.example.omdb.local.OmdbDatabase INSTANCE;
    
    public OmdbDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.omdb.local.dao.MediaItemDao mediaItemDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.omdb.local.dao.FavoriteItemDao favoriteItemDao();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/omdb/local/OmdbDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/example/omdb/local/OmdbDatabase;", "getInstance", "app", "Landroid/app/Application;", "getInstanceFavorites", "omdb-model_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.omdb.local.OmdbDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.app.Application app) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.omdb.local.OmdbDatabase getInstanceFavorites(@org.jetbrains.annotations.NotNull()
        android.app.Application app) {
            return null;
        }
    }
}