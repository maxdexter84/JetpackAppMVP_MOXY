package ru.maxdexter.jetpackapp.adapters

import androidx.recyclerview.widget.DiffUtil
import ru.maxdexter.jetpackapp.models.Hero

class DiffHero: DiffUtil.ItemCallback<Hero>() {
    override fun areItemsTheSame(oldItem: Hero, newItem: Hero): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Hero, newItem: Hero): Boolean {
        return oldItem.id == newItem.id
    }
}