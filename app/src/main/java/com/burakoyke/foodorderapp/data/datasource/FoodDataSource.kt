package com.burakoyke.foodorderapp.data.datasource

import com.burakoyke.foodorderapp.data.entity.Food
import com.burakoyke.foodorderapp.data.retrofit.FoodDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class FoodDataSource (var fdao : FoodDao){
    suspend fun loadFood(): List<Food> =
        withContext(Dispatchers.IO) {

            return@withContext res()
        }

    suspend fun searchFood(): List<Food> =
        withContext(Dispatchers.IO) {

            val searchList = ArrayList<Food>()
            for (food in res()){
                if (food.yemek_adi.contains("ayran")){
                    searchList.add(food)
                }
            }

            return@withContext searchList
        }

    suspend fun res () : List<Food> {
        return fdao.loadFood().yemekler
    }
}