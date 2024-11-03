package com.burakoyke.foodorderapp.data.repository

import com.burakoyke.foodorderapp.data.datasource.FoodDataSource
import com.burakoyke.foodorderapp.data.entity.Food

class FoodRepository (var fds: FoodDataSource) {
    suspend fun loadFood(): List<Food> = fds.loadFood()
    suspend fun searchFood(): List<Food> = fds.searchFood()
}