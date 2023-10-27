package homework.day8.collectionTask;

import java.util.ArrayList;
import java.util.List;

public class TaskFive {

    public static void main(String[] args) {
        //Создать пустой список стрингов countries (через new ArrayList)
        List<String> countries = new ArrayList<>();

        //Добавить в список 4 страны (Андора, Португалия, Англия, Замбия)
        countries.add("Андора");
        countries.add("Португалия");
        countries.add("Англия");
        countries.add("Замбия");

        //Проитерировать список через for-each и отпечатать слова в консоль через запятую с пробелом
        for (String country : countries) {
            System.out.print(country);
            if (countries.indexOf(country) < countries.size() - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        //Посчитать сколько стран, в названии которых меньше 7 букв и вывести число в консоль
        int counter = 0;
        for (int i = 0; i < countries.size(); i++) {
            int count = countries.get(i).length();
            if (count < 7) {
                counter++;
            }
        }
        System.out.println("Number of countries with less than 7 letters: " + counter);

        //Проитерировать список по индексу и отпечатать слова в консоль с новой строки
        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.get(i));
        }
    }
}
