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
        boolean resultEmptyList = testEmptyList.numbers.isEmpty();
        System.out.println("Testing: " + resultEmptyList);
        //Then
        Assert.assertEquals(testEmptyList.oddList.isEmpty(), resultEmptyList);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator testNormalList = new OddNumbersExterminator();
        testNormalList.numbers.add(0,745);
        testNormalList.numbers.add(1,740);
        testNormalList.numbers.add(2,856);
        testNormalList.numbers.add(3,753);
        testNormalList.numbers.add(4,740);
        testNormalList.numbers.add(5,705);
        testNormalList.numbers.add(6,9864);
        testNormalList.numbers.add(7,7);
        testNormalList.numbers.add(8,75);
        testNormalList.numbers.add(9,10);
        //Whem
        ArrayList resultNormalList = testNormalList.exterminate(testNormalList.numbers);
        System.out.println("Testing: " + resultNormalList);
        //Then
        Assert.assertEquals(testNormalList.oddList, resultNormalList);
    }
}