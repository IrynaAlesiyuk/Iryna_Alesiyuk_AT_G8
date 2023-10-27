package homework.day8.collectionTask;

import classwork.day8.ListTask2;

import java.util.ArrayList;
import java.util.List;

public class TaskOne {
    public static void main(String[] args) {
        List<String> butterflies = new ArrayList<>();
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        for (String butterfly : butterflies) {
            System.out.println("\"" + butterfly + "\"");
        }
        int counter = 0;
        for (String butterfly : butterflies) {
            if (butterfly.contains("o")) {
                counter++;
            }
        }
        System.out.println("Amount of butterfly that contains 'o': " + counter);
        System.out.println("---------------");

        for (int i = 0; i < butterflies.size(); i++) {
            System.out.print(butterflies.get(i) + " ");
        }

        for (String butterfly : butterflies) {
            System.out.println(butterfly);
        }
    }
}
