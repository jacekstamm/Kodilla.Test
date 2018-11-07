package com.kodilla.stream.world;

import org.junit.*;
import java.math.BigDecimal;
import java.util.ArrayList;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Continent europe = new Continent("Europe", new ArrayList<>());
        Continent asia = new Continent("Asia", new ArrayList<>());
        Continent africa = new Continent("Africa", new ArrayList<>());
        Continent northAmerica = new Continent("North America", new ArrayList<>());
        World world = new World();

        world.addContinentToWorld(europe);
        world.addContinentToWorld(asia);
        world.addContinentToWorld(africa);
        world.addContinentToWorld(northAmerica);

        europe.addCountryToContinent(new Country("Poland", new BigDecimal("38476269")));
        europe.addCountryToContinent(new Country("Germany", new BigDecimal("80594017")));
        europe.addCountryToContinent(new Country("Italy", new BigDecimal("60589445")));
        europe.addCountryToContinent(new Country("Belgium", new BigDecimal("11358357")));

        asia.addCountryToContinent(new Country("Afghanistan", new BigDecimal("34656032")));
        asia.addCountryToContinent(new Country("China PRC", new BigDecimal("1403500365")));
        asia.addCountryToContinent(new Country("India", new BigDecimal("1324171354")));
        asia.addCountryToContinent(new Country("Bangladesh", new BigDecimal("162951560")));

        africa.addCountryToContinent(new Country("Egypt", new BigDecimal("82868000")));
        africa.addCountryToContinent(new Country("Ethiopia", new BigDecimal("84320987")));
        africa.addCountryToContinent(new Country("South Africa", new BigDecimal("51770560")));
        africa.addCountryToContinent(new Country("Nigeria", new BigDecimal("166629000")));

        northAmerica.addCountryToContinent(new Country("United States", new BigDecimal("322179605")));
        northAmerica.addCountryToContinent(new Country("Mexico", new BigDecimal("127540423")));
        northAmerica.addCountryToContinent(new Country("Canada", new BigDecimal("36289822")));

        //When
        BigDecimal result = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPopulation = new BigDecimal("3987895796");
        Assert.assertEquals(expectedPopulation, result);
    }
}
