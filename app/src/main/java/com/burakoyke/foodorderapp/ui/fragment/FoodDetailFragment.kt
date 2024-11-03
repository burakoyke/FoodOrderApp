package com.burakoyke.foodorderapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.burakoyke.foodorderapp.R
import com.burakoyke.foodorderapp.databinding.FragmentFoodDetailBinding
import com.burakoyke.foodorderapp.ui.viewmodel.FoodDetailViewModel


class FoodDetailFragment : Fragment() {
    private lateinit var binding: FragmentFoodDetailBinding
    private lateinit var viewmodel : FoodDetailViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel : FoodDetailViewModel by viewModels()
        viewmodel = tempViewModel
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFoodDetailBinding.inflate(inflater, container, false)
        binding.toolbarFoodDetail.title = "Food Detail"
        return binding.root
    }


}