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
       OddNumbersExterminator test1 = new OddNumbersExterminator();
        //When

        //Then
        Assert.assertTrue(test1.numbers.isEmpty() == true);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator test2 = new OddNumbersExterminator();
        //When
        ArrayList<Integer> result = test2.numbers;
        //Then
        Assert.assertEquals(test2.numbers, result);
    }
}
