package com.example.c3lesson7hw7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.c3lesson7hw7.databinding.FragmentCharacterBinding


class CharacterFragment : Fragment() {

    private lateinit var binding: FragmentCharacterBinding
    private val characterList = arrayListOf(
            Character("", "", "", 1)
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
        val character = Character(binding.)
        findNavController().navigate(R.id.detailFragment, bundleOf())
    }
}