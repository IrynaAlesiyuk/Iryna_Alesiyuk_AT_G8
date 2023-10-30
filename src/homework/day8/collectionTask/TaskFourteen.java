package homework.day8.collectionTask;

import homework.day8.someClasses.Person;
import homework.day8.someClasses.Sand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskFourteen {

    public static void main(String[] args) {
        //Создать пустой список песка (класса Sand) sandbox (через new ArrayList)
        List<Sand> sands = new ArrayList<>();

        //Заполнить 4 объектами песка с весом (2, 4, 2, 7) и именами (Речной, Речной, Карьерный, Речной) соответственно
        sands.add(new Sand(2, "Речной"));
        sands.add(new Sand(4, "Речной"));
        sands.add(new Sand(2, "Карьерный"));
        sands.add(new Sand(7, "Речной"));

        //Проитерировать список через for-each и отпечатать вес в консоль через пробел
        for (Sand sand : sands) {
            System.out.print(sand.getWeight() + " ");
        }
        System.out.println();

        //Проитерировать список через for-each и отпечатать имена в консоль через пробел
        for (Sand sand : sands) {
            System.out.print(sand.getName() + " ");
        }
        System.out.println();

        //Создать пустую карту, где ключом является целое число, а значением объект песка
        Map<Integer, Sand> mapOfSand = new HashMap<>();

        //Заполнить карту значениями из предыдущего списка, используя в качестве ключа любое уникальное число
        for (int i = 0; i < sands.size(); i++) {
            mapOfSand.put(i, sands.get(i));
        }

        //Проитерировать карту и отпечатать ключи в консоль
        for (Integer key : mapOfSand.keySet()) {
            System.out.println(key);
        }

        //Проитерировать карту и отпечатать значения в консоль
        for (Sand sand : mapOfSand.values()) {
            System.out.println(sand);
        }

        //Проитерировать карту и отпечатать пары ключ-значение в консоль
        for (Map.Entry<Integer, Sand> entry : mapOfSand.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " and " + "Value: " + entry.getValue());
        }


    }
}
