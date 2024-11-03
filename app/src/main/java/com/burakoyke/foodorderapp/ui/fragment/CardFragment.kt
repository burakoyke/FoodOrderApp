package com.burakoyke.foodorderapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.burakoyke.foodorderapp.R
import com.burakoyke.foodorderapp.databinding.FragmentCardBinding
import com.burakoyke.foodorderapp.ui.viewmodel.CardViewModel


class CardFragment : Fragment() {

    private lateinit var binding : FragmentCardBinding
    private lateinit var viewmodel : CardViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel : CardViewModel by viewModels()
        viewmodel = tempViewModel
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCardBinding.inflate(inflater, container, false)
        binding.toolbarCard.title = "My Card"
        return binding.root
    }
}