package homework.day5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class CountSymbols {

    //1.7 написать метод, который принимает на вход строку текста и выводит в консоль дату,
    // которая на n дней больше,чем текущая в формате "Сгенерированная гласная дата: 7 мая",
    // где n - это количество гласных буков в получаемой строке

    public static void returnDateBasedOnVowelsCount(String anyString) {
        int numberOfVowel = countVowels(anyString);
        increaseDate(numberOfVowel);
    }

    private static void increaseDate(int countOfDate) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowPlus = now.plus(countOfDate, ChronoUnit.DAYS);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM", new Locale("ru"));
        String date = nowPlus.format(formatter);

        System.out.println(String.format("Сгенерированная гласная дата: %s",date));
    }

    private static int countVowels(String anyString) {
        String allSymbols = "[аеёиоуыэюяaeiou]";

        char[] allVowels = allSymbols.toCharArray();
        char[] array = anyString.toLowerCase().toCharArray();

        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < allVowels.length; j++) {
                if (array[i] == allVowels[j]) {
                    counter++;
                    break;
                }
            }
        }
        System.out.println("Number of vowels: " + counter);
        return counter;
    }


}
