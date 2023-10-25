package homework.day8.collectionTask;

import java.util.Arrays;
import java.util.List;

public class TaskTwo {

    public static void main(String[] args) {

        List<String> figures = Arrays.asList("Овал", "Круг", "Квадрат", "Эллипс");

        //Проитерировать список через for-each и отпечатать слова в файл figures через тире
        for (String figure : figures) {
            System.out.print(figure);
            if (figures.indexOf(figure) < figures.size() - 1) {
                System.out.print(" - ");
            }
        }
        System.out.println();

        //Посчитать сколько фигур НЕ содержат букву "и" и вывести число в консоль
        int counter = figures.size();
        for (String figure : figures) {
            if (figure.contains("и")) {
                counter--;
            }
        }
        System.out.println("Amount of figures that NOT contain 'и': " + counter);

        //Проитерировать список по индексу и отпечатать слова в консоль через пробел
        for (int i = 0; i < figures.size(); i++) {
            System.out.print(figures.get(i) + " ");
        }
        System.out.println();

        //Вставить на 3 позицию Треугольник
        figures.set(3, "Треугольник");

        //Проитерировать список через for-each и отпечатать слова в консоль через пробел
        for (String figure : figures) {
            System.out.print(figure + " ");
        }
    }
}
