package com.example.clevertankenleichtgemacht.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.clevertankenleichtgemacht.R

class Repository() {

    // Die Variable contactList ruft einmal die Funktion loadContacts() auf und speichert das Ergebnis
    private val _productList = MutableLiveData<List<Product>>(loadProducts() as List<Product>?)
    val productList: LiveData<List<Product>>
        get() = _productList




    /**
     * Diese Funktion gibt eine Liste aus Contact Objekten zurück.
     * Jedes Contact Objekt enthält die Informationen für den Namen und
     * die Bild Ressource und eine leere veränderliche Liste
     */

    private fun loadProducts(): List<Product> {
        return listOf(
            Product("Petty", R.drawable.card3, mutableListOf()),
            Product("Olaf_DogTrainer", R.drawable.card4, mutableListOf()),
            Product("Administrator", R.drawable.card5, mutableListOf()),
            Product("alterHase89", R.drawable.card6, mutableListOf()),

            )
    }
}




