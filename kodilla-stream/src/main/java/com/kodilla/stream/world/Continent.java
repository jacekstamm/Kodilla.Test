package com.kodilla.stream.world;

import java.util.*;

public final class Continent {
    private final String continentName;
    private List<Country> countriesOnContinent;

    public Continent(String continentName, List<Country> countriesOnContinent) {
        this.continentName = continentName;
        this.countriesOnContinent = countriesOnContinent;
    }

    public void addCountryToContinent(Country country) {
        countriesOnContinent.add(country);
    }

    public String getContinentName() {
        return continentName;
    }

    public List<Country> getCountriesOnContinent() {
        return countriesOnContinent;
    }

}
