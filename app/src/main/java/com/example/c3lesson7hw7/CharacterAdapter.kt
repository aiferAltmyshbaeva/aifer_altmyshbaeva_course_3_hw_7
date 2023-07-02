package com.example.c3lesson7hw7

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
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
            binding.apply {
                tvIndex.text = (adapterPosition+1).toString()
                tvName.text = character.name
                tvStatus.text = character.status
                Glide.with(imgImage.context).load(character.image).into(imgImage)
            }

            itemView.setOnClickListener{
                onClick(character)
            }

        }
    }
}