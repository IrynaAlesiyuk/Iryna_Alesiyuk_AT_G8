package homework.day8.collectionTask;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TaskEight {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3342, 34, 79, 23426, 68, 1324, 55, 7699);

        //Проитерировать список через for-each и отпечатать числа в консоль новой строки
        for (Integer number : numbers) {
            System.out.println(number);
        }

        //Отсортировать список по возрастанию
        Collections.sort(numbers);
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        //Развернуть список в обратном порядке
        //Проитерировать список через for-each и отпечатать числа в консоль через пробел
        Collections.reverse(numbers);
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
