package ru.maxdexter.jetpackapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import moxy.MvpAppCompatFragment
import ru.maxdexter.jetpackapp.R
import ru.maxdexter.jetpackapp.databinding.FragmentHeroListBinding


class HeroListFragment : MvpAppCompatFragment() {


    private lateinit var binding: FragmentHeroListBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHeroListBinding.inflate(inflater, container, false)



        return binding.root
    }


}