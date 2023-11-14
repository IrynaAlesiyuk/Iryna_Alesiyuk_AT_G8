package homework.day9;

import homework.day8.someClasses.Bubble;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class DoubleRunner10 {
    public static void main(String[] args) {
        //Создать поток данных дробных чисел doubles из 8 чисел (33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9)
        // через (Stream.of())
        List<Double> doubles = Stream.of(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9).toList();

        //Округлить каждое число до целого
        List<Long> roundedLong = doubles.stream().map(Math::round).toList();
        List<Integer> roundedIntegers = doubles.stream().map(el -> el.intValue()).toList();
        System.out.println("Rounded integer:");
        roundedIntegers.forEach(el -> System.out.print(el + " "));
        System.out.println();

        //На основании этого потока сгенерировать новый поток данных целых чисел из случайных чисел с
        // границами от 0 до числа из иходного потока данных
        Random random = new Random();
        List<Integer> list = roundedIntegers.stream().map(el -> random.nextInt(el + 1)).toList();
        System.out.println("New stream of integer:");
        list.forEach(el -> System.out.print(el + " "));
        System.out.println();

        //Убрать дубликаты значений
        List<Integer> listDistinct = list.stream().distinct().toList();
        System.out.println("New stream of distinct integer:");
        listDistinct.forEach(el -> System.out.print(+el + " "));
        System.out.println();

        //Заменить каждое число в получившемся потоке данных новым потоком состоящим из обьектов Bubble в количестве равному заменяемому числу,
        //создавая обьекты с обьемом равным числу из исходного потока и именем по маске "Bubble vol-" + i, где i - число из исходного потока
        List<Bubble> bubbleList = listDistinct.stream().map(el -> new Bubble(el, "Bubble vol-" + el)).toList();

        //Отпечатать в консоль каждый из обьектов нового потока с новой строки
        System.out.println("Bubble list:");
        bubbleList.forEach(el -> System.out.println(el.toString()));
        System.out.println();

        //Найти общий обьем полученного потока пузырьков и отпечатать в консоль
        int sumVolume = bubbleList.stream().mapToInt(Bubble::getVolume).sum();
        System.out.println("Общий обьем пузырьков: " + sumVolume);
    }
}
