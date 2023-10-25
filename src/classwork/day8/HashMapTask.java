package classwork.day8;

import java.util.HashMap;
import java.util.Map;

public class HashMapTask {


    public static void main(String[] args) {
        Map<Integer, String> words = new HashMap<>();
        String[] array = "мама мыла раму мыла".split(" ");
        for (int i = 0; i < array.length; i++) {
            words.put(i, array[i]);
        }
        System.out.println("----------------");
        for (String value : words.values()) {
            System.out.println(value);
        }
        System.out.println("----------------");

        for (Integer key : words.keySet()) {
            System.out.println(key);
        }
        System.out.println("----------------");
        for (Map.Entry<Integer, String> entry : words.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " and " + "Value: " + entry.getValue());
        }
    }

}
