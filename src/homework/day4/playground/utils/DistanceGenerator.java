package homework.day4.playground.utils;

import java.util.Random;

public class DistanceGenerator {

    public static int generateDistance() {
        int random = new Random().nextInt(98) + 1;
        System.out.println(String.format("DistanceGenerator: I have generated distance with value: %d", random));
        return random;
    }
}
