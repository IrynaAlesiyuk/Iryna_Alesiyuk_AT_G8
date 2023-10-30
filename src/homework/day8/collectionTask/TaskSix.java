package homework.day8.collectionTask;

import java.util.Arrays;
import java.util.List;

public class TaskSix {

    public static void main(String[] args) {
        //Создать список строк birds из 5 птиц (Чайка, Дрозд, Бусел, Голубь, Воробей, Цапля) через (Arrays.asList())
        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");

        //Проитерировать список через for-each и отпечатать слова в консоль с новой строки в виде --Чайка--
        for (String bird : birds) {
            System.out.print(" -- " + bird + " -- ");
        }

        System.out.println();
        //Посчитать сколько птиц содержат больше 1 гласной и вывести в число в консоль
        int counterOfBirds = 0;
        for (String bird : birds) {
            if (countVowels(bird) > 1) {
                counterOfBirds++;
            }
        }
        System.out.println("Number of birds with more than 1 vowels: " + counterOfBirds);

        //Проитерировать список по индексу и отпечатать слова в консоль через пробел
        for (int i = 0; i < birds.size(); i++) {
            System.out.print(birds.get(i) + " ");
        }
        System.out.println();

        //Заменить 3-й элемент списка на Синица
        birds.set(2, "Синица");

        //Проитерировать список через for-each и отпечатать слова в консоль через пробел
        for (String bird : birds) {
            System.out.print(bird + " ");
        }
    }

    private static int countVowels(String str) {
        String allSymbols = "[аеёиоуыэюя]";
        char[] allVowels = allSymbols.toCharArray();
        char[] array = str.toLowerCase().toCharArray();

        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < allVowels.length; j++) {
                if (array[i] == allVowels[j]) {
                    counter++;
                    break;
                }
            }
        }
        return counter;
    }
}
