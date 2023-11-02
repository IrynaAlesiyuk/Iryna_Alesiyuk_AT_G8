package homework.day9;

import java.util.List;
import java.util.stream.Stream;

public class NumbersModRunner9 {
    public static void main(String[] args) {
        //Создать поток данных целых чисел numbersMod из 8 чисел (626, 435, 9, 1463268, 24, 2237, 33, 9090)
        // через (Stream.of())
        List<Integer> numbersMod = Stream.of(626, 435, 9, 1463268, 24, 2237, 33, 9090).toList();

        //Отфильтровать те числа, которые содержать цифру 3
        numbersMod.stream().map(String::valueOf).filter(el -> el.contains("3")).forEach(System.out::println);

        //Разбить числа на отдельные цифры и заменить цифры соответствующими словами


        //Оставить только уникальные слова, отсортировать в нисходящем порядке и отпечатать в консоль с новой строки
    }
}
