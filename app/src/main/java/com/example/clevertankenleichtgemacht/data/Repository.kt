package com.example.clevertankenleichtgemacht.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.clevertankenleichtgemacht.R

class Repository {

    fun loadProducts(): List<Product> {

        return listOf(
            Product(
                1,
                "Die Top 10 gefährlichsten Tiere Deutschlands!",
                R.drawable.gellato,
                "Deutschland",

            ),
            Product(
                2,
                "Top Zigarettenhuelsen....",
                R.drawable.huelsen,
                "für optimalen Rauchgenuss",

            ),
            Product(
                3,
                "Was kleines zum Naschen für unterwegs",
                R.drawable.suesses,
                "für jeden Geschmack ist etwas dabei ",

            ),
            Product(
                4,
                "Ist Leonardo Di Caprio der neue Spiderman? Hollywood spielt verrückt",
                R.drawable.zeitschriften,
                "USA",

            ),
            Product(
                5,
                "Ist Leonardo Di Caprio der neue Spiderman? Hollywood spielt verrückt",
                R.drawable.solero,
                "USA",

                )


        )
    }
}
