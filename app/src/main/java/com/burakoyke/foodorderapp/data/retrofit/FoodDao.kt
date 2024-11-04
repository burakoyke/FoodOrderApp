package com.burakoyke.foodorderapp.data.retrofit

import com.burakoyke.foodorderapp.data.entity.FoodResponse
import retrofit2.http.GET

interface FoodDao {
    @GET("yemekler/tumYemekleriGetir.php")
    suspend fun loadFood() : FoodResponse

    @GET("yemekler/tumYemekleriGetir.php")
    suspend fun search() : FoodResponse
}