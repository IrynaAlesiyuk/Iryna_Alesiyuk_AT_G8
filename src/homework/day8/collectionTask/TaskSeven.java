package homework.day8.collectionTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskSeven {

    public static void main(String[] args) {
        List<String> elements = new ArrayList<>();

        //Добавить в список 6 элементов (Text field, Radio, Check-box, Drop-down, Picker, Breadcrumb)
        elements.add("Text field");
        elements.add("Radio");
        elements.add("Check-box");
        elements.add("Drop-down");
        elements.add("Picker");
        elements.add("Breadcrumb");

        //Посчитать сколько названий элементов состоит более, чем из одного слова и вывести число в консоль
        int counter = 0;
        for (String element : elements) {
            String[] words = element.split(" |\\-");
            if (Arrays.asList(words).size() > 1) {
                counter++;
            }
        }
        System.out.println("Element contains more than 1 word:" + counter);

        //Проитерировать список по индексу и отпечатать слова в консоль через пробел
        for (int i = 0; i < elements.size(); i++) {
            System.out.print(elements.get(i) + " ");
        }

        //На 4-ю позицию добавить Spinner
        elements.add(3, "Spinner");

        //Удалить 2-й элемент списка
        elements.remove(1);

        //Заменить 5-й элемент на Switch
        elements.set(4, "Switch");

        //Проитерировать список через for-each и отпечатать слова в консоль через пробел
        for (String bird : elements) {
            System.out.print(bird + " ");
        }

    }
}
