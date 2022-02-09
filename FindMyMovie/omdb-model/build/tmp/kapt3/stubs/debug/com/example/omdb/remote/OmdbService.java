package com.example.omdb.remote;

import java.lang.System;

/**
 * Interface to define HTTP methods use to communicate with the OMDB Apis
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ+\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/example/omdb/remote/OmdbService;", "", "searchByQuery", "Lretrofit2/Response;", "Lcom/example/omdb/response/SearchResponse;", "query", "", "apiKey", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "omdb-model_debug"})
public abstract interface OmdbService {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.omdb.remote.OmdbService.Companion Companion = null;
    
    /**
     * @GET -> This is GET http call we add the retrofit annotation, we use "." because this endpoint has no path
     *
     * suspend -> this is now a coroutine method which means we want to run this on another thread that's NOT MAIN,
     * we don't want to run this on the main thread because we don't know how long it will take and we don't want to
     * freeze the screen during this time or it will lead to a ANR(Application Not Responding)
     *
     * @Query -> Used to add queries to the endpoint based on the value passed in
     * Response<SearchResponse> -> This will return the Full Http Details, which includes things like status code.
     * The Search Response will be in the body property of the response object...
     */
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = ".")
    public abstract java.lang.Object searchByQuery(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "s")
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "apikey")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.omdb.response.SearchResponse>> continuation);
    
    /**
     * Interface to define HTTP methods use to communicate with the OMDB Apis
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
    }
    
    /**
     * Companion Object lets us create a static scope similar to use static keyword in Java
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lcom/example/omdb/remote/OmdbService$Companion;", "", "()V", "HOST", "", "instance", "Lcom/example/omdb/remote/OmdbService;", "getInstance", "()Lcom/example/omdb/remote/OmdbService;", "instance$delegate", "Lkotlin/Lazy;", "omdb-model_debug"})
    public static final class Companion {
        
        /**
         * Const Val is a compile time constant, this means it's initialized and added to memory
         * when you compile rather than when it's running.
         *
         * In this case we are using it to define the BASE_URL of the OMDB Api
         */
        private static final java.lang.String HOST = "http://www.omdbapi.com";
        
        /**
         * We are using lazy to create a instance of this OMDB service class, lazy means it will only
         * run code within it's scope{} when the first time the variable is used. Any subsequent uses
         * will return the result of the scope{} first them it was ran.
         *
         * In this case the first instance variable is called it was run the Retrofit Builder and use it to
         * create the OMDB Service. After wards that instance from the first time will be the value
         */
        @org.jetbrains.annotations.NotNull()
        private static final kotlin.Lazy instance$delegate = null;
        
        private Companion() {
            super();
        }
        
        /**
         * We are using lazy to create a instance of this OMDB service class, lazy means it will only
         * run code within it's scope{} when the first time the variable is used. Any subsequent uses
         * will return the result of the scope{} first them it was ran.
         *
         * In this case the first instance variable is called it was run the Retrofit Builder and use it to
         * create the OMDB Service. After wards that instance from the first time will be the value
         */
        @org.jetbrains.annotations.NotNull()
        public final com.example.omdb.remote.OmdbService getInstance() {
            return null;
        }
    }
}