package com.burakoyke.foodorderapp.data.datasource

import com.burakoyke.foodorderapp.data.entity.Food
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class FoodDataSource {
    suspend fun loadFood(): List<Food> =
        withContext(Dispatchers.IO) {
            val foodList = ArrayList<Food>()
            val f1 = Food(1,"Hamburger","burger",20)
            val f2 = Food(2,"Pizza","pizza",30)
            val f3 = Food(3,"Fanta","fanta",10)
            foodList.add(f1)
            foodList.add(f2)
            foodList.add(f3)
            return@withContext foodList
        }

    suspend fun searchFood(): List<Food> =
        withContext(Dispatchers.IO) {
            val foodList = ArrayList<Food>()
            val f1 = Food(1,"Hamburger","burger",20)
            foodList.add(f1)
            return@withContext foodList
        }
}