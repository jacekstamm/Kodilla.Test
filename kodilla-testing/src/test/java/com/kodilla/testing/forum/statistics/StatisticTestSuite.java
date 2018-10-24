package com.kodilla.testing.forum.statistics;


import com.kodilla.testing.forum.statistic.Statistic;
import com.kodilla.testing.forum.statistic.StatisticCounter;
import java.util.*;
import org.junit.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticTestSuite {
    @Test
    public void testShouldCalculateStatisticWith0Posts() {
        //Given
        Statistic statisticCounterMock = mock(Statistic.class);


        //When


        //Then

    }

    @Test
    public void testShouldCalculateStatisticWith1000Posts() {
        //Given


        //When


        //Then

    }

    @Test
    public void testShouldCalculateStatisticWith0Comment() {
        //Given


        //When


        //Then

    }

    @Test
    public void testShouldCalculateStatisticWhenIsMorePostsThanComments() {
        //Given


        //When


        //Then


    }

    @Test
    public void testShouldCalculateStatisticWhenIsMoreCommentsThanPosts() {
        //Given


        //When


        //Then


    }

    @Test
    public void testShouldCalculateStatisticWith0User() {
        //Given


        //When


        //Then


    }

    @Test
    public void testShouldCalculateStatisticWith100Users() {
        //Given



        //When



        //Then

    }
}