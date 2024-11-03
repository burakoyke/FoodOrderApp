package com.burakoyke.foodorderapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView.OnQueryTextListener
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.burakoyke.foodorderapp.R
import com.burakoyke.foodorderapp.data.entity.Food
import com.burakoyke.foodorderapp.databinding.FragmentMainPageBinding
import com.burakoyke.foodorderapp.ui.adapter.FoodAdapter
import com.burakoyke.foodorderapp.ui.viewmodel.MainPageViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainPageFragment : Fragment() {
    private lateinit var binding : FragmentMainPageBinding
    private lateinit var viewModel : MainPageViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel : MainPageViewModel by viewModels()
        viewModel = tempViewModel
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMainPageBinding.inflate(inflater, container, false)
        binding.toolbarMainPage.title = "Food Order"

        binding.rv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        viewModel.foodList.observe(viewLifecycleOwner) {
            val adapter = FoodAdapter(requireContext(),it)
            binding.rv.adapter = adapter
        }

        binding.buttonFav.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.favFragment)
        }
        binding.buttonCard.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.cardFragment)
        }

        binding.searchView.setOnQueryTextListener(object : OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                viewModel.searchFood()
                return true

            }

            override fun onQueryTextChange(newText: String): Boolean {
                viewModel.searchFood()
                return false
            }
        })


        return binding.root
    }

    override fun onResume() {
        super.onResume()
        viewModel.loadFood()

    }
}