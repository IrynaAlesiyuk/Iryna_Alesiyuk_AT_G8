package homework.day4.playground.utils;

import java.util.Random;

public class DirectionGenerator {

    public static String generateDirection() {
        int random = new Random().nextInt(39) + 1;
        System.out.println(random);
        if (random >= 1 && random <= 9) {
            return "NORTH";
        } else if (random >= 10 && random <= 19) {
            return "SOUTH";
        } else if (random >= 20 && random <= 29) {
            return "WEST";
        } else if (random >= 30 && random <= 39) {
            return "EAST";
        } else {
            throw new IllegalArgumentException("Boundary is not found");
        }
    }

}
