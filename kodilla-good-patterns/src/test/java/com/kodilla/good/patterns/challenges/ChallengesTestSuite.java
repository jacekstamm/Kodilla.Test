package com.kodilla.good.patterns.challenges;

import org.junit.*;

import java.util.stream.Collectors;

public class ChallengesTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    public void testShouldCheckStringsOfTitles() {
        //Given
        MovieStore movieStore = new MovieStore();
        //When
        String movieList = movieStore.getMovies().entrySet().stream()
                .flatMap(n -> n.getValue().stream())
                .map(n -> n + " ! ")
                .collect(Collectors.joining());
        //Then
        String expectedString = "Żelazny Człowiek ! Iron Man ! Mściciele ! Avengers ! Błyskawica ! Flash ! ";
        Assert.assertEquals(movieList, expectedString);
    }
}
