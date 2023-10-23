package classwork.day7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTask {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        String str = "мама мыла раму мыла";
        String[] array = str.split(" ");

        for (String element : array) {
            set.add(element);
        }

        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        for (String element : set) {
            System.out.print(element + " ");
        }
    }
}
