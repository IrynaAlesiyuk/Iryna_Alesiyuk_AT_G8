package homework.day4.playground.utils;

import java.util.Random;

public class CoordinatesGenerator {

    public static int generateCoordinate() {
        int random = new Random().nextInt(80);
        System.out.println(String.format("I have generated point with value: %d", random));
        return random;
    }
}
