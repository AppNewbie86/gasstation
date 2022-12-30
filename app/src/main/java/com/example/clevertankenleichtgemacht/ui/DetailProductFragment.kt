package com.example.clevertankenleichtgemacht.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.clevertankenleichtgemacht.MainViewModel
import com.example.clevertankenleichtgemacht.data.Product
import com.example.clevertankenleichtgemacht.databinding.FragmentDetailProductBinding


class DetailProductFragment : Fragment() {

    private lateinit var binding: FragmentDetailProductBinding
    private val viewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailProductBinding.inflate(inflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val productId = requireArguments().getInt("productId", 0)

        val newsList: List<Product>? = viewModel.product.value

        val product = newsList?.find { it.id == productId }

        if (product != null) {
            binding.detailImage.setImageResource(product.detailProductImageResourceId)
            binding.detailTitle.text = product.detailProductTitle
            binding.detailText.text = product.detailProductArticle
        }
    }
}
