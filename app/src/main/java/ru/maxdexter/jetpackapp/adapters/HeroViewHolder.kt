package ru.maxdexter.jetpackapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.maxdexter.jetpackapp.databinding.ItemHeroBinding
import ru.maxdexter.jetpackapp.models.Hero

class HeroViewHolder(private val binding: ItemHeroBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: Hero) {

    }

    companion object {
        fun create(parent: ViewGroup): HeroViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            val binding = ItemHeroBinding.inflate(inflater, parent, false)
            return HeroViewHolder(binding)
        }
    }
}