package homework.day9;

import java.util.List;
import java.util.stream.Stream;

public class NumbersRunner8 {
    public static void main(String[] args) {
        //Создать поток данных целых чисел numbers из 8 чисел (3342, 34, 79, 23426, 68, 1324, 55, 7699)
        // через (Stream.of())
        List<Integer> numbers = Stream.of(3342, 34, 79, 23426, 68, 1324, 55, 7699).toList();

        //В потоке данных проитерировать числа и отпечатать числа в консоль новой строки
        numbers.forEach(System.out::println);

        //Отсортировать и снова отпечатать в консоль с новой строки
        numbers.stream().sorted().forEach(System.out::println);

        //Посчитать сумму всех чисел и вывести результат в консоль
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
