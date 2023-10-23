package classwork.day7;

import java.util.ArrayList;
import java.util.List;

public class ArrayTask {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        String str = "мама мыла раму мыла";
        String[] array = str.split(" ");

        for (String element : array) {
            list.add(element);
        }

        System.out.println("The first approach");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("The second approach");
        for (String element : list) {
            System.out.println(element);
        }


    }

}
