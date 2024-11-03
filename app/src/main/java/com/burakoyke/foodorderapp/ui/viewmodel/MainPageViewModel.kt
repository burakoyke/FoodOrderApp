package com.burakoyke.foodorderapp.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.burakoyke.foodorderapp.data.entity.Food
import com.burakoyke.foodorderapp.data.repository.FoodRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainPageViewModel : ViewModel() {
    var frepo = FoodRepository()
    var foodList = MutableLiveData<List<Food>>()
    fun loadFood() {
        CoroutineScope(Dispatchers.Main).launch {
            foodList.value = frepo.loadFood()

        }
    }
    fun searchFood() {
        CoroutineScope(Dispatchers.Main).launch {
            foodList.value = frepo.searchFood()

        }
    }
    init {
        loadFood()
    }

}