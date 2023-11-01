package classwork.day10;

import java.util.Arrays;
import java.util.List;

public class TaskThree {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        boolean ifElementExist = list.stream().anyMatch("мама"::equals);
        System.out.println(ifElementExist);
        System.out.println("---------");

        boolean ifLetterExist = list.stream().allMatch(el -> el.contains("м"));
        System.out.println(ifLetterExist);
        System.out.println("---------");

        List<String> addedElement = list.stream().map(el -> el + "м").toList();
        addedElement.forEach(System.out::println);
        System.out.println("---------");

        list.stream().flatMap(el -> Arrays.stream(el.split("")))
                .filter(el->!el.equals("")).toList().forEach(System.out::println);


    }
}
