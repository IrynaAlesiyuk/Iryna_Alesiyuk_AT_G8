package homework.day9;

import homework.day8.someClasses.Person;
import homework.day8.someClasses.Sand;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SandboxRunner14 {
    public static void main(String[] args) {
        //Создать пустой список песка (класса Sand) sandbox (через new ArrayList)
        //Заполнить 5 объектами песка с весом (12, 8, 15, 7, 11) и именами
        // (Речной, Речной, Карьерный, Карьерный, Речной) соответственно
        List<Sand> sandbox = new ArrayList<>();
        sandbox.add(new Sand(12, "Речной"));
        sandbox.add(new Sand(8, "Речной"));
        sandbox.add(new Sand(15, "Карьерный"));
        sandbox.add(new Sand(7, "Карьерный"));
        sandbox.add(new Sand(11, "Речной"));

        //Отфильтровать только тот песок, который весит больше 9 и имя которого содержит букву "ч"
        System.out.println("весит больше 9 и имя которого содержит букву \"ч\"");
        sandbox.stream().filter(el -> el.getWeight() > 9 && el.getName().contains("ч")).forEach(System.out::println);
        //Отсортировать по весу в восходящем порядке
        System.out.println("Отсортировать по весу в восходящем порядке");
        sandbox.stream().sorted(Comparator.comparing(Sand::getWeight)).forEach(System.out::println);
        //На основании существующего потока данных создать новый, в котором каждый новый Sand имеет вес
        // умноженный на 2, и имя в верхнем регистре
        System.out.println("Sand имеет вес умноженный на 2, и имя в верхнем регистре");
        List<Sand> newList = sandbox.stream().map(el -> new Sand(el.getWeight() * 2, el.getName().toUpperCase())).toList();

        //На основании получившегося потока данных создать коллекцию Map, где ключ - это вес, а значение - имя
        Map<Integer, String> map = newList.stream().collect(Collectors.toMap(Sand::getWeight, Sand::getName));

        //Отпечатать каждый из элементов карты в виде value:key в текстовый файл
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("out/sandbox.txt"))) {
            map.entrySet().stream()
                    .map(entry -> entry.getValue() + ":" + entry.getKey())
                    .forEach(line -> {
                        try {
                            writer.write(line);
                            writer.newLine();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
