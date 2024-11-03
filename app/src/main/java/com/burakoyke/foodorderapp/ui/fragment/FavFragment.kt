package com.burakoyke.foodorderapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.burakoyke.foodorderapp.R
import com.burakoyke.foodorderapp.databinding.FragmentFavBinding
import com.burakoyke.foodorderapp.ui.viewmodel.FavViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FavFragment : Fragment() {

    private lateinit var binding : FragmentFavBinding
    private lateinit var viewmodel : FavViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel : FavViewModel by viewModels()
        viewmodel = tempViewModel
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFavBinding.inflate(inflater, container, false)
        binding.toolbarFav.title = "Favorites"
        return binding.root
    }


}