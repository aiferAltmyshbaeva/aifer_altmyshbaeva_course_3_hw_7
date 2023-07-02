package com.example.c3lesson7hw7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.c3lesson7hw7.BundleKeys.KEY_FOR_CHARACTER
import com.example.c3lesson7hw7.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {

private lateinit var binding: FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val character = arguments?.getSerializable(KEY_FOR_CHARACTER) as Character
        binding.apply {
            tvStatusD.text = character.status
            tvNameD.text = character.name
            tvIndexD.text = character.index.toString()
            Glide.with(imgAvatar.context).load(character.image).into(imgAvatar)
        }
    }
}