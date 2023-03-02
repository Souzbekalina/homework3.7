package com.alina.homework37

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.alina.homework37.databinding.FragmentCharacterBinding


class CharacterFragment : Fragment() {
    private lateinit var binding: FragmentCharacterBinding
    companion object{
        const val CHARACTER ="Character"
    }
    private lateinit var adapter: CharacterAdapter
    private  var list:ArrayList<com.alina.homework37.Character> = ArrayList()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentCharacterBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val list =ArrayList<Character>()
        list.add(Character("Naruto Udzumaki","Naruto","https://www.looper.com/img/gallery/25-best-naruto-episodes-ranked/l-intro-1661358618.jpg"))
        list.add(Character("Hinata Hyuga","Naruto","https://pbs.twimg.com/media/FggrKbxXEAAvl7x?format=jpg&name=large"))
        list.add(Character("Sakura Haruna","Naruto","https://avatars.mds.yandex.net/i?id=e45e40f6c23f6745f9c9ddf96fdc7ab3f91988b6-9041934-images-thumbs&n=13"))
        list.add(Character("Ichigo Kurasaki","Bleach","https://pbs.twimg.com/media/FXpxSGwUcAAQUKK?format=jpg&name=large"))
        list.add(Character("Isida Uri","Bleach","https://i.pinimg.com/originals/2d/47/56/2d47566b7b2e4d872cc4577155fa8be1.jpg"))
        list.add(Character("Inoue Orihime","Bleach","https://i.pinimg.com/originals/1e/f8/e7/1ef8e790f3ce91cb7ee612d2f072ee8f.jpg"))
        list.add(Character("kuchiki byakuya","Bleach","https://avatars.mds.yandex.net/i?id=e075cc97675bc0da303855894669f656853483d9-7013580-images-thumbs&n=13"))

        adapter= CharacterAdapter(list,this::onClick)
        binding.rvCharacter.adapter=adapter

    }
    private fun onClick(position:Int) {
        var ch=com.alina.homework37.Character(list[position].nameOfCharacter, list[position].nameOfCartoon,list[position].pictureOfCharacter)
        findNavController().navigate(R.id.characterDetailFragment, bundleOf(CHARACTER to  ch)

        )

    }



}