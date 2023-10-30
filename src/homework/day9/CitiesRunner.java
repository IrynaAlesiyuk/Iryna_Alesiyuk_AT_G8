package homework.day9;

import java.util.ArrayList;
import java.util.List;

public class CitiesRunner {
    public static void main(String[] args) {
        //Создать пустой список стрингов cities (через new ArrayList)
        List<String> cities = new ArrayList<>();

        //Добавить в список 3 города (Минск, Москва, Берлин)
        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");

        //Посчитать сумму всех буков во всех словах и вывести число в консоль
        cities.stream()
                .map(String::length)
                .forEach(System.out::println);
    }
}
