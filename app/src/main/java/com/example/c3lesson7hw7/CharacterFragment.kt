package com.example.c3lesson7hw7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.c3lesson7hw7.BundleKeys.KEY_FOR_CHARACTER
import com.example.c3lesson7hw7.databinding.FragmentCharacterBinding


class CharacterFragment : Fragment() {

    private lateinit var binding: FragmentCharacterBinding
    private val characterList = arrayListOf(
            Character("https://rickandmortyapi.com/api/character/avatar/1.jpeg", "Alive", "Rick Sanchez", 1),
            Character("https://rickandmortyapi.com/api/character/avatar/2.jpeg", "Alive", "Morty Smith", 2),
            Character("https://rickandmortyapi.com/api/character/avatar/11.jpeg", "Dead", "Albert Einstein", 3),
            Character("https://rickandmortyapi.com/api/character/avatar/5.jpeg", "Alive", "Jerry Smith", 4),
            Character("https://rickandmortyapi.com/api/character/avatar/3.jpeg", "Alive", "Summer Smith", 5),
            Character("https://rickandmortyapi.com/api/character/avatar/4.jpeg", "Alive", "Beth Smith", 6),
            Character("https://rickandmortyapi.com/api/character/avatar/6.jpeg", "Alive", "Abadango Cluster Princess", 7),
            Character("https://rickandmortyapi.com/api/character/avatar/7.jpeg", "Unknown", "Abradolf Lincler", 8)
    )


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCharacterBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = CharacterAdapter(characterList, this:: onClick)
        binding.rvCharacter.adapter = adapter
    }

    private fun onClick(character: Character){
        findNavController().navigate(R.id.detailFragment, bundleOf(KEY_FOR_CHARACTER to character))
    }
}