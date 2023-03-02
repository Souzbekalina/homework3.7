package com.alina.homework37

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alina.homework37.databinding.FragmentCharacterDetailBinding


class CharacterDetailFragment : Fragment() {
    private lateinit var binding: FragmentCharacterDetailBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
         binding=FragmentCharacterDetailBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val  character=arguments?.getSerializable(CharacterFragment.CHARACTER)!! as Character
        binding.apply {
            tvDetailnameCartoon.text=character.nameOfCartoon
            tvDetailnameCharacter.text=character.nameOfCharacter

        }
    }


}