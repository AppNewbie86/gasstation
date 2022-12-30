package com.example.clevertankenleichtgemacht.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.example.clevertankenleichtgemacht.MainViewModel
import com.example.clevertankenleichtgemacht.adapter.ProductAdapter
import com.example.clevertankenleichtgemacht.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var mapButton: Button
    private lateinit var unserTeamBtn: Button

    private val viewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val productAdapter = ProductAdapter()
        binding.productRecyclerView.adapter = productAdapter

        viewModel.product.observe(
            viewLifecycleOwner,
            Observer {
                // immer wenn neue news kommen recyclerview updaten
                productAdapter.submitList(it)
            }
        )

        binding.nextGasstationMap.setOnClickListener {
            findNavController()
                .navigate(HomeFragmentDirections.actionHomeFragmentToNextGasStationFragment())
        }

        binding.unserTeamBtn.setOnClickListener {
            findNavController()
                .navigate(HomeFragmentDirections.actionHomeFragmentToUnserTeamFragment())
        }

    }
}
