package com.example.mediumrecyclerviewkullanimi.data.entity;

public class Country {

    private int countryId;
    private String countryName;
    private String countryImage;

    public Country(int countryId, String countryName, String countryImage) {
        this.countryId = countryId;
        this.countryName = countryName;
        this.countryImage = countryImage;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryImage() {
        return countryImage;
    }

    public void setCountryImage(String countryImage) {
        this.countryImage = countryImage;
    }
}
