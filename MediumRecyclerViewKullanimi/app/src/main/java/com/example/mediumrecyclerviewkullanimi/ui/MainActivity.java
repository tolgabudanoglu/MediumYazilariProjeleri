package com.example.mediumrecyclerviewkullanimi.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.mediumrecyclerviewkullanimi.R;
import com.example.mediumrecyclerviewkullanimi.data.entity.Country;
import com.example.mediumrecyclerviewkullanimi.databinding.ActivityMainBinding;
import com.example.mediumrecyclerviewkullanimi.ui.adapter.CountryAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.rvCountry.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Country> countries = new ArrayList<>();
        Country c1 = new Country(1,"Türkiye","flag_of_turkey");
        Country c2 = new Country(2,"Almanya","flag_of_germany");
        Country c3 = new Country(3,"Fransa","flag_of_france");
        Country c4 = new Country(4,"İspanya","flag_of_spain");
        Country c5 = new Country(5,"İtalya","flag_of_italy");
        Country c6 = new Country(6,"İsveç","flag_of_sweden");

        countries.add(c1);
        countries.add(c2);
        countries.add(c3);
        countries.add(c4);
        countries.add(c5);
        countries.add(c6);

        CountryAdapter countryAdapter = new CountryAdapter(countries,this);
        binding.rvCountry.setAdapter(countryAdapter);

    }
}