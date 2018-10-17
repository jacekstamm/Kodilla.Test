package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {

    ArrayList<Integer> numbers;

    public OddNumbersExterminator() {
        numbers = new ArrayList<Integer>();
    }

    ArrayList<Integer> oddList = new ArrayList<Integer>();

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {

        for(int n = 0; n < numbers.size(); n++) {
            if (numbers.get(n) % 2 == 0) {
                oddList.add(n);
            }
        }
        return oddList;
    }
}
