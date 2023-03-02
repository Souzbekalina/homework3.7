package com.alina.homework37

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.alina.homework37.databinding.ItemCharacterBinding
import com.bumptech.glide.Glide

class CharacterAdapter(val characterList: ArrayList<Character> , val onClick:(position:Int)->Unit): Adapter<CharacterAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       return ViewHolder(
           ItemCharacterBinding.inflate(LayoutInflater.from(parent.context), parent,false))
    }

    override fun onBindViewHolder(holder:  CharacterAdapter.ViewHolder, position: Int) {
         holder.bind(characterList[position])
    }

    override fun getItemCount(): Int= characterList.size
    inner class ViewHolder(private val binding:ItemCharacterBinding):RecyclerView.ViewHolder(binding.root){
      fun bind(item:Character){
          binding.apply {
              tvNameCharacter.text=item.nameOfCharacter
              tvNameCartoon.text=item.nameOfCartoon
              Glide.with(binding.imgPicture).load(item.pictureOfCharacter).into(binding.imgPicture)

              itemView.setOnClickListener{
                  onClick(adapterPosition) }


          }


  }




    }



}