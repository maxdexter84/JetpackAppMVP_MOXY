package ru.maxdexter.jetpackapp.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import ru.maxdexter.jetpackapp.models.Hero

class HeroAdapter: ListAdapter<Hero, HeroViewHolder>(DiffHero()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroViewHolder {
        return HeroViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: HeroViewHolder, position: Int) {
       holder.bind(getItem(position))
    }
}