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
    public void testShouldCheckNumberOfTitles() {
        //Given
        MovieStore movieStore = new MovieStore();
        //When
        int result = movieStore.getMovies().entrySet().stream()
                .flatMap(n -> n.getValue().stream())
                .collect(Collectors.toList())
                .size();
        //Then
        Assert.assertEquals(result, 6);
    }
}
