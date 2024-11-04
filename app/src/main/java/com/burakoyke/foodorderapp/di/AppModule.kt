package com.burakoyke.foodorderapp.di

import com.burakoyke.foodorderapp.data.datasource.FoodDataSource
import com.burakoyke.foodorderapp.data.repository.FoodRepository
import com.burakoyke.foodorderapp.data.retrofit.ApiUtils
import com.burakoyke.foodorderapp.data.retrofit.FoodDao
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
    fun provideFoodDataSource(fdao : FoodDao) : FoodDataSource {
        return FoodDataSource(fdao)
    }

    @Provides
    @Singleton
    fun provideFoodRepository(fds:FoodDataSource) : FoodRepository {
        return FoodRepository(fds)
    }

    @Provides
    @Singleton
    fun provideFoodDao() : FoodDao {
        return ApiUtils.getFoodDao()
    }
}