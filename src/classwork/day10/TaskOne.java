package classwork.day10;

import java.util.Arrays;
import java.util.List;

public class TaskOne {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        String theFirstElement = list.stream().findFirst().orElse("мама");
        System.out.println(theFirstElement);
        System.out.println("----------");

        String returnMother = list.stream().filter("мама"::equals).findFirst().get();
        System.out.println(returnMother);
        System.out.println("----------");

        list.stream().skip(4).forEach(System.out::println);
        System.out.println("----------");

        list.stream().skip(2).limit(2).toList().forEach(System.out::println);
        System.out.println("----------");

        list.stream().distinct().filter(el -> el.contains("м")).forEach(System.out::println);

    }
}
