package classwork.day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskThree {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мыла", "чисто");

        long num = list.stream().filter(x -> x.equalsIgnoreCase("мама")).count();
        System.out.println(num);
    }


}
