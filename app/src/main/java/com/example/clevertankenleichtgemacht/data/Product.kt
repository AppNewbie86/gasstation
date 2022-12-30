package com.example.clevertankenleichtgemacht.data


/**
 * Diese Data Klasse steht für einen einzelnen Product im HomeFragment
 * @param name der Name des Kontakts
 * @param imageResId die resource ID des Bildes des Productes
 */
data class Product(
    val id: Int,
    val detailProductTitle: String,
    val detailProductImageResourceId: Int,
    val detailProductArticle: String
)

