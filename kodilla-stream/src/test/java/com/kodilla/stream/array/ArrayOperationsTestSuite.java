package com.kodilla.stream.array;

import org.junit.*;


public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] numbersTest = new int[20];
        numbersTest[0] = 76;
        numbersTest[1] = 12;
        numbersTest[2] = 93;
        numbersTest[3] = 74;
        numbersTest[4] = 1;
        numbersTest[5] = 6;
        numbersTest[6] = 27;
        numbersTest[7] = 30;
        numbersTest[8] = 29;
        numbersTest[9] = 82;
        numbersTest[10] = 124;
        numbersTest[11] = 735;
        numbersTest[12] = 6;
        numbersTest[13] = 73;
        numbersTest[14] = 29;
        numbersTest[15] = 91;
        numbersTest[16] = 55;
        numbersTest[17] = 72;
        numbersTest[18] = 39;
        numbersTest[19] = 100;

        //When
        ArrayOperations.getAverage(numbersTest);
        //87.7 = result
        //Then


    }
}
