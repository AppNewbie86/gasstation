package com.example.clevertankenleichtgemacht

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.clevertankenleichtgemacht.data.Product
import com.example.clevertankenleichtgemacht.data.Repository



const val TAG = "MainViewModel"

/**
 * Das MainViewModel kümmert sich um die Kommunikation mit der Firebase Authentication
 * um einen SHA-1 Key zu generieren einfach folgene Zeilen ins Terminal kopieren
 * >>keytool -alias androiddebugkey -keystore ~/.android/debug.keystore -list -v -storepass android<<
 *  * ACHTUNG: in der Firestore Datenbank folgende Regel festlegen
 * >> allow read, write: if request.auth != null; <<
 */
class MainViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = Repository()


    /**
     * Verschachtelte Value zum Speichern der Daten
     */
    private val _products = MutableLiveData<List<Product>>()
    val products: LiveData<List<Product>>
        get() = _products


    /**
     * hier wird versucht einen User zu erstellen um diesen anschließend auch gleich
     * einzuloggen
     */


}




