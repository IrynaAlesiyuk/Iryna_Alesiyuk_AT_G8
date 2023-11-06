package homework.day9;

import homework.day8.someClasses.Bubble;
import homework.day8.someClasses.Chair;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class ChairRunner15 {
    public static void main(String[] args) {
        //Создать поток данных furniture класса Chair (через new Stream.of) furniture из 3 стульев
        //высотой (120, 90, 100, 110) и шириной (40, 30, 50, 45) соответственно
        List<Chair> furniture = Stream.of(new Chair(40, 120),
                new Chair(30, 90),
                new Chair(50, 100),
                new Chair(45, 110)).toList();

        //Отфильтровать только те стулья, который выше или равны 100 и уже или равны 50
        furniture.stream().filter(el -> el.getHeight() >= 100 && el.getHeight() <= 50).forEach(System.out::println);

        //Отсортировать по высоте, а если высота равна, то по ширине в нисходящем порядке
        List<Chair> sortedChair = furniture.stream().sorted((r1, r2) -> {
            if (r1.getHeight() != r2.getHeight()) {
                return Integer.compare(r1.getHeight(), r2.getHeight());
            } else {
                return Integer.compare(r1.getWidth(), r2.getWidth());
            }
        }).toList();

        //На основании существующего потока данных создать новый, в котором каждый новый Chair имеет высоту,
        // деленную на 2, и ширину, умноженную на случайное число от 3 до 8 включительно
        List<Chair> newMap = sortedChair.stream()
                .map(el -> new Chair(el.getHeight() / 2, el.getWidth() * (new Random().nextInt(8)))).toList();
        newMap.forEach(System.out::println);

        //На основании получившегося потока данных создать новый, представляющий собой уникальный набо высот стульев
        // умноженных на их ширину
        List<Integer> newList = newMap.stream().map(el->el.getHeight()* el.getWidth()).distinct().toList();
        newList.forEach(System.out::println);

        //Найти наибольшее значение в получившемся потоке
        int max = newList.stream().max(Integer::compareTo).orElse(0);
        System.out.println(max);

        //Создать новый обьект Bubble с обьемом равным найденному наибольшему значению и именем равным
        // найденному наибольшему значению, представленным в виде словесного выражения каждой цифры числа
        // этого значения, указанного чере пробел



        //Напечатать строковое значение полученного обьекта в текстовый файл
    }
}
