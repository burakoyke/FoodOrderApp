package com.burakoyke.foodorderapp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.burakoyke.foodorderapp.data.entity.Food
import com.burakoyke.foodorderapp.databinding.CardDesignBinding

class FoodAdapter (var mContext: Context, var foodList:List<Food>) : RecyclerView.Adapter<FoodAdapter.CardDesignHolder>(){

    inner class CardDesignHolder(var design : CardDesignBinding) : RecyclerView.ViewHolder(design.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignHolder {
        val binding = CardDesignBinding.inflate(
            LayoutInflater.from(mContext),
           parent,false)
        return CardDesignHolder(binding)
    }

    override fun getItemCount(): Int {
        return foodList.size
    }

    override fun onBindViewHolder(holder: CardDesignHolder, position: Int) {
        var food = foodList.get(position)
        val t = holder.design
        t.textViewFoodName.text = food.yemek_adi
    }


}