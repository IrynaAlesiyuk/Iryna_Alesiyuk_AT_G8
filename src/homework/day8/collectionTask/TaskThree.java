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
        int counter = 0;
        for (String city : cities) {
            counter += city.length();
        }
        System.out.println("Number of letters for all cities is: " + counter);


        int letters = 0;
        for (String city : cities) {
            letters += city.length();
        }
        System.out.println(letters);

        //Проитерировать список по индексу и отпечатать слова в консоль через пробел
        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i) + " ");
        }
    }


}
