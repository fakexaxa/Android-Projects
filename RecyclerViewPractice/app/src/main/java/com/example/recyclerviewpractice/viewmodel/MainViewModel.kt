package com.example.recyclerviewpractice.viewmodel

import androidx.lifecycle.*
import com.example.recyclerviewpractice.model.FoodItem
import com.example.recyclerviewpractice.util.mockFoodItemList

class MainViewModel : ViewModel() {

    //private val _foodItemList = MutableLiveData<List<FoodItem>>()
   // val foodItemList: LiveData<List<FoodItem>> get() = _foodItemList
      val foodItemList: LiveData<List<FoodItem>> = liveData { emit(mockFoodItemList) }
/*
    private val strings = mockFoodItemList

    init {
        _foodItemList.value= strings
    }
*/
}
