package com.kodilla.testing.collection;

import org.junit.*;
import java.util.*;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }
    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
       OddNumbersExterminator testEmptyList = new OddNumbersExterminator();
        //When
        ArrayList<Integer> resultEmptyList = testEmptyList.oddList;
        System.out.println("Testing " + resultEmptyList);
        //Then
        Assert.assertTrue(testEmptyList.oddList.isEmpty() == true);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator testNormalList = new OddNumbersExterminator();
        //When
        ArrayList<Integer> resultNormalList = testNormalList.numbers;
        System.out.println("Testing " + resultNormalList);
        //Then
        Assert.assertEquals(testNormalList.numbers, resultNormalList);
    }
}
