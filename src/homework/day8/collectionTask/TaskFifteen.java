package homework.day8.collectionTask;

import homework.day8.someClasses.Chair;
import homework.day8.someClasses.Sand;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskFifteen {
    public static void main(String[] args) {
        //Создать список стульев (класса Chair) furniture из 3 стульев высотой (1, 4, 2) и шириной (2, 2, 4) соответственно,
        //через (Arrays.asList())
        List<Chair> chairs = Arrays.asList(new Chair(1, 2), new Chair(4, 2), new Chair(2, 4));

        //Проитерировать список через for-each и отпечатать произведение высоты на ширину в консоль через пробел
        for (Chair chair : chairs) {
            System.out.println("Multiply: " + chair.getHeight() * chair.getWidth());
        }

        //Создать пустую карту, где ключом является целое число, а значением объект стула
        Map<Integer, Chair> mapOfChair = new HashMap<>();

        //Заполнить карту значениями из предыдущего списка, используя в качестве ключа любое уникальное число
        for (int i = 0; i < chairs.size(); i++) {
            mapOfChair.put(i, chairs.get(i));
        }

        //Проитерировать карту и отпечатать ключи в консоль
        for (Integer key : mapOfChair.keySet()) {
            System.out.println(key);
        }

        //Проитерировать карту и отпечатать значения в консоль
        for (Chair sand : mapOfChair.values()) {
            System.out.println(sand);
        }

        //Проитерировать карту и отпечатать пары ключ-значение в консоль
        for (Map.Entry<Integer, Chair> entry : mapOfChair.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " and " + "Value: " + entry.getValue());
        }
    }
}
