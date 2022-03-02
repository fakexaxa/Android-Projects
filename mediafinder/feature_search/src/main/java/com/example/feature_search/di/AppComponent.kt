package com.example.feature_search.di

import android.content.Context
import com.example.feature_search.SearchFragment
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton


@Component(
    modules = [AppModule::class]
)
@Singleton
interface AppComponent {

    fun inject(fragment : SearchFragment)

    @Component.Builder
    interface Builder {
        fun context(@BindsInstance context: Context): Builder
        fun module(appModule: AppModule): Builder
        fun build(): AppComponent
    }

}