package com.example.c3lesson7hw7

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.c3lesson7hw7.databinding.ItemCharacterBinding

class CharacterAdapter(
    private val list: ArrayList<Character>,
    private val onClick: (Character) -> Unit
) : Adapter<CharacterAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemCharacterBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    inner class ViewHolder(
        private val binding: ItemCharacterBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(character: Character) {
            binding.tvIndex.text = character.index.toString()
            binding.tvName.text = character.name
            binding.tvStatus.text = character.status
            binding.imgImage.setImageResource(character.image)
        }
    }
}