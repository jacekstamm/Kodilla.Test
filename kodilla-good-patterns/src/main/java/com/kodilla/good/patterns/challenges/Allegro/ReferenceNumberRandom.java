package com.kodilla.good.patterns.challenges.Allegro;

import java.util.*;

public class ReferenceNumberRandom {

    public long referenceNumberGenerator() {
        Random random = new Random();
        return random.nextInt(1000) + 1;
    }
}
