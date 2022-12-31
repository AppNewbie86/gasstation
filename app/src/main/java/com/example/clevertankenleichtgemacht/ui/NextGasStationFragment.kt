package com.example.clevertankenleichtgemacht.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.clevertankenleichtgemacht.MainViewModel
import com.example.clevertankenleichtgemacht.databinding.FragmentNextGasStationBinding


class NextGasStationFragment : Fragment() {


    private val viewModel: MainViewModel by activityViewModels()

    private lateinit var binding: FragmentNextGasStationBinding


    /**
     * Aufblasen des Layouts und die view wird zum Erstellen vorbereitet
     */

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNextGasStationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        val gmmIntentUri: Uri = Uri.parse("geo:48.6284,9.8150?q=gasstation")
        val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
        mapIntent.setPackage("com.google.android.apps.maps")
        startActivity(mapIntent)

    }
}