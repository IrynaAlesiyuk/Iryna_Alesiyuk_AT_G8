package homework.day9;

import java.util.List;
import java.util.stream.Stream;

public class FiguresRunner {

    public static void main(String[] args) {
        //Создать список строк стрингов figures из 5 фигур (Овал, Прямоугольник, Круг, Квадрат, Эллипс) через (Stream.of())
        List<String> figures = Stream.of("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс").toList();

        //Заменить каждое слово на целое число, соответствующее количеству буков в слове
        List<Integer> listOfStringLenght = figures.stream().map(String::length).toList();
        listOfStringLenght.forEach(el ->  System.out.print(el + " "));
        System.out.println();

        //Отфильтровать числа, которые больше 4
        List<Integer> numbers = listOfStringLenght.stream()
                .filter(el -> el > 4)
                .toList();

        //Отпечатать все оставшиеся числа в консоль
        numbers.forEach(el ->  System.out.print(el + " "));

    }
}
