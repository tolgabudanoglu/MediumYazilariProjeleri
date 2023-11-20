package com.example.mediumrecyclerviewkullanimikotlin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mediumrecyclerviewkullanimikotlin.R
import com.example.mediumrecyclerviewkullanimikotlin.data.entity.Country
import com.example.mediumrecyclerviewkullanimikotlin.databinding.ActivityMainBinding
import com.example.mediumrecyclerviewkullanimikotlin.ui.adapter.CountryAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.rvCountry.layoutManager = LinearLayoutManager(this)

        val countries = arrayListOf(
            Country(1, "Türkiye", "flag_of_turkey"),
            Country(2, "Almanya", "flag_of_germany"),
            Country(3, "Fransa", "flag_of_france"),
            Country(4, "İspanya", "flag_of_spain"),
            Country(5, "İtalya", "flag_of_italy"),
            Country(6, "İsveç", "flag_of_sweden")
        )

        val adapter = CountryAdapter(countries,this)
        binding.rvCountry.adapter = adapter
    }
}