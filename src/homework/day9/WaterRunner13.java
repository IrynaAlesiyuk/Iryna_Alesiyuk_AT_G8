package homework.day9;

import homework.day8.someClasses.Water;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WaterRunner13 {
    public static void main(String[] args) {
        //Создать поток данных water класса Water (через new Stream.of)
        //из 4 объектов воды с цветом (Прозрачная, Прозрачная, Мутная, Синяя)
        // и запахом (Нет, Нет, Аммиачный, Мятный) соответственно
        List<Water> water = Stream.of(
                new Water("Нет", "Прозрачная"),
                new Water("Нет", "Прозрачная"),
                new Water("Аммиачный", "Мутная"),
                new Water("Мятный", "Синяя")).toList();

        //Отфильтровать воду, цвет которой не "Прозрачная"
        System.out.println("Отфильтровать воду, цвет которой не \"Прозрачная\":");
        water.stream().filter(el -> !el.getColor().equals("Прозрачная")).forEach(System.out::println);

        //Отсортировать в нисходящем порядке по запаху
        System.out.println("Отсортировать в нисходящем порядке по запаху:");
        water.stream().sorted(Comparator.comparing(Water::getSmell).reversed()).forEach(System.out::println);

        //На основании существующего потока данных создать новый, в котором каждая новая Water
        //имеет запах с удвоенной буквой ы, если такая встречается
        System.out.println("удвоенной буквой ы");
        water.stream()
                .map(el -> {
                    if (el.getSmell().contains("ы")) {
                        String newSmell = el.getSmell().replace("ы", "ыы");
                        return new Water(newSmell, el.getColor());
                    }
                    return el;
                })
                .forEach(System.out::println);

        //Обьединить запах всех обьектов в одну строку
        System.out.println("Обьединить запах всех обьектов в одну строку");
        String oneStr = water.stream().map(Water::getSmell).collect(Collectors.joining());
        System.out.println(oneStr);

        //Найти количество буков в ней и отпечатаь в консоль
        System.out.println("Найти количество буков в ней и отпечатаь в консоль");
        System.out.println(oneStr.length());
    }
}
