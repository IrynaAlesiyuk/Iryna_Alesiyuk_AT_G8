package homework.day8.collectionTask;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TaskFour {
    public static void main(String[] args) {

        List<String> cars = new ArrayList<>();
        //Создать набор строк стрингов cars из 7 авто (Мерс, Ауди, Жигуль, Рено, Жигуль, Жигуль, Ауди) (через new ArrayList)
        cars.add("Мерс");
        cars.add("Ауди");
        cars.add("Жигуль");
        cars.add("Рено");
        cars.add("Жигуль");
        cars.add("Жигуль");
        cars.add("Ауди");

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("out/cars.txt"));
            //Проитерировать список через for-each и отпечатать слова в файл cars через с новой строки в кавычках
            for (String car : cars) {
                writer.write("\"" + car + "\"");
            }
            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Найти и удалить из набора авто, в названии которых больше 4 букв
        for (int i = 0; i < cars.size(); i++) {
            int count = (cars.get(i).toCharArray()).length;
            if (count > 4) {
                cars.remove(i);
                i--;
            }
        }
        //Проитерировать список через for-each и отпечатать слова в консоль через пробел
        for (String car : cars) {
            System.out.print(car + " ");
        }
    }
}
