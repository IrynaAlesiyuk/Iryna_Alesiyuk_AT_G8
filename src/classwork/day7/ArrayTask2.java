package classwork.day7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayTask2 {

    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();


        long initial = System.currentTimeMillis();
        for (int i = 0; i <= 10000000; i++) {
            arrayList.add("qwerty" + i);
        }
        System.out.println(System.currentTimeMillis() - initial);

        long initial2 = System.currentTimeMillis();
        for (int i = 0; i <= 10000000; i++) {
            linkedList.add("qwerty" + i);
        }
        System.out.println(System.currentTimeMillis() - initial2);


    }
}
