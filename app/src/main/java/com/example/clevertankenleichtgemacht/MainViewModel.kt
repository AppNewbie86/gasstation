package com.example.clevertankenleichtgemacht

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.clevertankenleichtgemacht.data.Product
import com.example.clevertankenleichtgemacht.data.Repository

class MainViewModel : ViewModel() {

    private val repository = Repository()


    private val _product = MutableLiveData<List<Product>>()
    val product: LiveData<List<Product>>
        get() = _product

    init {
        _product.value = repository.loadProducts()
    }
}
