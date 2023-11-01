package homework.day9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ButterfliesRunner {

    public static void main(String[] args) {
        //Создать пустой список стрингов butterflies (через new ArrayList)
        List<String> butterflies = new ArrayList<>();

        //Добавить в список 4 бабочки (Common blue, Swallowtail, Aglais io, Common blue)
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        //Добавить к каждому элементу кавычки
        butterflies.stream()
                .map(element -> "\"" + element + "\"")
                .forEach(el -> System.out.print(el + " "));

        System.out.println();

        //Оставить только те слова, которые содержат букву "a" и букву "о"
        List<String> oaList = butterflies.stream()
                .filter(element -> element.contains("a") && element.contains("o"))
                .toList();

        //Вывести слова в консоль с новой строки
        oaList.forEach(element -> System.out.print(element + " "));
    }
}
