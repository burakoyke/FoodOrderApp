package com.burakoyke.foodorderapp.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.burakoyke.foodorderapp.data.repository.FoodRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class FoodDetailViewModel @Inject constructor(var frepo: FoodRepository) : ViewModel() {
}