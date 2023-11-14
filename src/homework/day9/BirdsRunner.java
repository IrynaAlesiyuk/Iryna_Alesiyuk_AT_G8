package homework.day9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BirdsRunner {

    public static void main(String[] args) {
        //Создать список строк birds из 5 птиц (Чайка, Дрозд, Бусел, Голубь, Воробей, Цапля) через (Arrays.asList())
        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");

        //Создать из списка поток данных, заменить в каждую букву "о" на букву "а"
        List<String> birdsReplace = birds.stream().map(el -> el.replace("о", "а")).toList();
        birdsReplace.forEach(System.out::println);

        //Собрать все слова в одну строку в ниждем регистре
        String lowerCase = birdsReplace.stream().collect(Collectors.joining()).toLowerCase();
        System.out.println(lowerCase);

        //Убрать все символы мягкого знака
        String removeSymbols = lowerCase.replace("ь", "");
        System.out.println(removeSymbols);

        //Разбить на новые строки по букве "б"
        List<String> newStrings = Arrays.stream(removeSymbols.split("б")).toList();

        //Отпечатать в консоль с новой строки в виде --Чайка--
        newStrings.stream().forEach(el -> System.out.println("--" + el + "--"));
    }
}
