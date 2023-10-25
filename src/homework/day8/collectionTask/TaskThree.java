package homework.day8.collectionTask;

import java.util.ArrayList;
import java.util.List;

public class TaskThree {

    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        //Добавить в список 3 города (Минск, Москва, Берлин)
        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");

        //Проитерировать список через for-each и отпечатать слова в консоль с новой строки
        for (String city : cities) {
            System.out.println(city);
        }

        //Посчитать сумму всех буков во всех словах и вывести число в консоль
        for (int i = 0; i < cities.size(); i++) {
            int count = (cities.get(i).toCharArray()).length;
            System.out.println("Number of letters for " + cities.get(i) + " is: " + count);
        }

        //Проитерировать список по индексу и отпечатать слова в консоль через пробел
        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i) + " ");
        }
    }


}
