package com.example.feature_favorite.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/feature_favorite/util/ViewState;", "", "()V", "Failure", "Success", "Lcom/example/feature_favorite/util/ViewState$Success;", "Lcom/example/feature_favorite/util/ViewState$Failure;", "feature_favorite_debug"})
public abstract class ViewState {
    
    private ViewState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/example/feature_favorite/util/ViewState$Success;", "Lcom/example/feature_favorite/util/ViewState;", "favMediaItems", "", "Lcom/example/omdb/response/FavoriteMediaItem;", "(Ljava/util/List;)V", "getFavMediaItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature_favorite_debug"})
    public static final class Success extends com.example.feature_favorite.util.ViewState {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.example.omdb.response.FavoriteMediaItem> favMediaItems = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.feature_favorite.util.ViewState.Success copy(@org.jetbrains.annotations.NotNull()
        java.util.List<com.example.omdb.response.FavoriteMediaItem> favMediaItems) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Success(@org.jetbrains.annotations.NotNull()
        java.util.List<com.example.omdb.response.FavoriteMediaItem> favMediaItems) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.example.omdb.response.FavoriteMediaItem> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.example.omdb.response.FavoriteMediaItem> getFavMediaItems() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/example/feature_favorite/util/ViewState$Failure;", "Lcom/example/feature_favorite/util/ViewState;", "()V", "InvalidQuery", "NoMediaItemsFound", "SomethingWentWrong", "WhileFetching", "Lcom/example/feature_favorite/util/ViewState$Failure$WhileFetching;", "Lcom/example/feature_favorite/util/ViewState$Failure$InvalidQuery;", "Lcom/example/feature_favorite/util/ViewState$Failure$NoMediaItemsFound;", "Lcom/example/feature_favorite/util/ViewState$Failure$SomethingWentWrong;", "feature_favorite_debug"})
    public static abstract class Failure extends com.example.feature_favorite.util.ViewState {
        
        private Failure() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/example/feature_favorite/util/ViewState$Failure$WhileFetching;", "Lcom/example/feature_favorite/util/ViewState$Failure;", "exception", "", "(Ljava/lang/String;)V", "getException", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature_favorite_debug"})
        public static final class WhileFetching extends com.example.feature_favorite.util.ViewState.Failure {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String exception = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.feature_favorite.util.ViewState.Failure.WhileFetching copy(@org.jetbrains.annotations.NotNull()
            java.lang.String exception) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public WhileFetching(@org.jetbrains.annotations.NotNull()
            java.lang.String exception) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getException() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/feature_favorite/util/ViewState$Failure$InvalidQuery;", "Lcom/example/feature_favorite/util/ViewState$Failure;", "()V", "feature_favorite_debug"})
        public static final class InvalidQuery extends com.example.feature_favorite.util.ViewState.Failure {
            @org.jetbrains.annotations.NotNull()
            public static final com.example.feature_favorite.util.ViewState.Failure.InvalidQuery INSTANCE = null;
            
            private InvalidQuery() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/feature_favorite/util/ViewState$Failure$NoMediaItemsFound;", "Lcom/example/feature_favorite/util/ViewState$Failure;", "()V", "feature_favorite_debug"})
        public static final class NoMediaItemsFound extends com.example.feature_favorite.util.ViewState.Failure {
            @org.jetbrains.annotations.NotNull()
            public static final com.example.feature_favorite.util.ViewState.Failure.NoMediaItemsFound INSTANCE = null;
            
            private NoMediaItemsFound() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/feature_favorite/util/ViewState$Failure$SomethingWentWrong;", "Lcom/example/feature_favorite/util/ViewState$Failure;", "()V", "feature_favorite_debug"})
        public static final class SomethingWentWrong extends com.example.feature_favorite.util.ViewState.Failure {
            @org.jetbrains.annotations.NotNull()
            public static final com.example.feature_favorite.util.ViewState.Failure.SomethingWentWrong INSTANCE = null;
            
            private SomethingWentWrong() {
                super();
            }
        }
    }
}