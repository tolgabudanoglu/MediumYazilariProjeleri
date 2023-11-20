package com.example.mediumrecyclerviewkullanimi.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mediumrecyclerviewkullanimi.data.entity.Country;
import com.example.mediumrecyclerviewkullanimi.databinding.CardDesignBinding;

import java.util.List;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.CountryCardDesignHolder> {

    private List<Country> countryListesi;
    private Context mContext;

    public CountryAdapter(List<Country> countryListesi, Context mContext) {
        this.countryListesi = countryListesi;
        this.mContext = mContext;
    }
    public class CountryCardDesignHolder extends RecyclerView.ViewHolder{
        private CardDesignBinding binding;

        public CountryCardDesignHolder(CardDesignBinding binding){
            super(binding.getRoot());
            this.binding = binding;
        }
    }

    @NonNull
    @Override
    public CountryCardDesignHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardDesignBinding binding = CardDesignBinding.inflate(LayoutInflater.from(mContext),parent,false);
        return new CountryCardDesignHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryCardDesignHolder holder, int position) {
        Country country = countryListesi.get(position);
        CardDesignBinding binding = holder.binding;

        binding.ivCountry.setImageResource(mContext.getResources().getIdentifier(country.getCountryImage(),"drawable",mContext.getPackageName()));
        binding.tvCountryName.setText(country.getCountryName());

    }

    @Override
    public int getItemCount() {
        return countryListesi.size();
    }

}
