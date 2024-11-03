package com.burakoyke.foodorderapp.di

import com.burakoyke.foodorderapp.data.datasource.FoodDataSource
import com.burakoyke.foodorderapp.data.repository.FoodRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideFoodDataSource() : FoodDataSource {
        return FoodDataSource()
    }

    @Provides
    @Singleton
    fun provideFoodRepository(fds:FoodDataSource) : FoodRepository {
        return FoodRepository(fds)
    }
}