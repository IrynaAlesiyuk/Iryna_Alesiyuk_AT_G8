package homework.day9;

import java.util.List;
import java.util.stream.Stream;

public class AutoRunner {

    public static void main(String[] args) {
        //Создать поток данных стрингов из 7 авто (Мерс, Ауди, Жигуль, Рено, Жигуль, Жигуль, Ауди)
        // (через Stream.of())
        Stream<String> carStream = Stream.of("Мерс", "Ауди", "Жигуль", "Рено", "Жигуль", "Жигуль", "Ауди");

        //Оставить в потоке только уникальные названия авто
        List<String> distinctCarList = carStream.distinct().toList();
        distinctCarList.forEach(System.out::println);
        System.out.println("---------");

        //Отфильтровать только те названия, которые содержат букву "и"
        List<String> iList = distinctCarList.stream().filter(el -> el.contains("и")).toList();
        iList.forEach(System.out::println);
        System.out.println("---------");

        //Пропустить 1 название
        List<String> skipFirstList = iList.stream().skip(1).toList();
        skipFirstList.forEach(System.out::println);
        System.out.println("---------");

        //Все названия привести в верхний регистр
        List<String> upperCaseList = skipFirstList.stream().map(String::toUpperCase).toList();

        //Отпечатать все названия в консоль с новой строки
        upperCaseList.forEach(System.out::println);
    }

}
