package com.example.clevertankenleichtgemacht

import android.animation.ObjectAnimator
import android.animation.PropertyValuesHolder
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.BounceInterpolator
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.clevertankenleichtgemacht.databinding.FragmentHomeBinding


/**
 * Dieses Fragment verwaltet die Anzeige der Lesezeichen
 */

class HomeFragment : Fragment() {


    /**
     * hier wird die binding Variable deklariert
     */

    private lateinit var binding: FragmentHomeBinding
    private lateinit var gatStartBtn: Button
    private lateinit var registerButton: Button

    /**
     * Hier holt man sich das ViewModel
     */
    private val viewModel: MainViewModel by activityViewModels()


    /**
     * Diese Funktion versteckt die NavBar auf dem Fragment
     */


    /**
     * Lifecycle Funktion onCreateView
     * Hier wird das binding initialisiert und das Layout gebaut
     */

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    /**
     * Lifecycle Funktion onViewCreated
     * Hier werden die Elemente eingerichtet und z.B. onClickListener gesetzt
     */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /**
         * Navigation zu LoginFragment
         */

        binding.nextgasstation.setOnClickListener {

            findNavController()
                .navigate(HomeFragmentDirections.actionNavigationHomeToLoginFragment())
        }

        /**
         * Navigation zu RegisterFragment
         */

        binding.OutdoorServicePoint.setOnClickListener {
            findNavController()
                .navigate(HomeFragmentDirections.actionNavigationHomeToSignUpFragment())
        }

        /**
         * Intent auf Facebook Homepage
         */



    }

}
