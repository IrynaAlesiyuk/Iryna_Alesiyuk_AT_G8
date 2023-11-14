package classwork.day10;

import java.util.Arrays;
import java.util.List;

public class TaskFour {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        list.stream().sorted().toList().forEach(System.out::println);
    }
}
