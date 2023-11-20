package com.example.mediumrecyclerviewkullanimikotlin.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mediumrecyclerviewkullanimikotlin.data.entity.Country
import com.example.mediumrecyclerviewkullanimikotlin.databinding.CardDesignBinding

class CountryAdapter(private val countryListesi: List<Country>, private val mContext: Context) :
    RecyclerView.Adapter<CountryAdapter.CountryCardDesignHolder>() {

    inner class CountryCardDesignHolder(val binding: CardDesignBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryCardDesignHolder {
        val binding = CardDesignBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CountryCardDesignHolder(binding)
    }

    override fun onBindViewHolder(holder: CountryCardDesignHolder, position: Int) {
        val country = countryListesi[position]
        val binding = holder.binding

        binding.ivCountry.setImageResource(
            mContext.resources.getIdentifier(
                country.countryImage,
                "drawable",
                mContext.packageName
            )
        )
        binding.tvCountryName.text = country.countryName
    }

    override fun getItemCount(): Int {
        return countryListesi.size
    }
}
