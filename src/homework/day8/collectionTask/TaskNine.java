package homework.day8.collectionTask;

import java.util.Arrays;
import java.util.List;

public class TaskNine {

    public static void main(String[] args) {
        List<Double> doubles = Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);

        //Проитерировать список через for-each и отпечатать числа в консоль через пробел
        for (Double number : doubles) {
            System.out.print(number + " ");
        }
        System.out.println();

        //Посчитать произведение всех чисел и вывести результат в консоль
        int sum = 1;
        for (Double number : doubles) {
            sum *= number;
        }
        System.out.println("Произведение всех чисел: " + sum);

        //найти сумму всех дробных частей и вывести результат в консоль
        double sumOfFractionalParts = 0.0;
        for (double number : doubles) {
            double fractionalPart = number - (int) number;
            sumOfFractionalParts += fractionalPart;
        }
        System.out.println("Сумма всех дробных частей: " + sumOfFractionalParts);

        //Проитерировать список по индексу и вывести целые части в консоль через пробел
        for (double number : doubles) {
            System.out.print((int) number + " ");
        }
    }
}
