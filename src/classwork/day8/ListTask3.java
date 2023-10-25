package classwork.day8;

import java.util.ArrayList;
import java.util.List;

public class ListTask3 {

    public static void main(String[] args) {
        List<String> vegetables = new ArrayList<>();
        vegetables.add("Помидор");
        vegetables.add("Огурец");
        vegetables.add("Кабачок");
        vegetables.add("Батат");
        vegetables.add("Картоха");

        for (String element : vegetables) {
            System.out.print(element + " ");
        }

        int counter = 0;
        for (String element : vegetables) {
            if (element.contains("a")) {
                counter++;
            }
        }
        System.out.println("Amount of element that contains 'a': " + counter);

        System.out.println("Delete cucumber");
        vegetables.remove("Огурец");
        vegetables.remove(3);

        System.out.println("New array list");
        for (String element : vegetables) {
            System.out.print(element + " ");
        }

    }
}
