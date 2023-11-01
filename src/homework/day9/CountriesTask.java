package homework.day9;

import java.util.List;
import java.util.stream.Stream;

public class CountriesTask {

    public static void main(String[] args) {
        //Создать поток данных стрингов countries из 4 стран (Андора, Португалия, Англия, Замбия) (через Stream.of())
        Stream<String> countries = Stream.of("Андора", "Португалия", "Англия", "Замбия");

        //Отфильтровать страны, которые содержат в себе хотя бы одну гласную букву
        List<String> vowelsList = countries.filter(el -> el.matches(".*[аеёиоуыэюя].*")).toList();

        //Отфильтровать страны, в названии которых меньше 7 букв
        List<String> lessThan7List = vowelsList.stream().filter(el -> el.length() < 7).toList();

        //Перевести все страны в верхний регистр
        List<String> upList = lessThan7List.stream().map(String::toUpperCase).toList();

        //Добавить к каждому названию кавычки
        List<String> list = upList.stream().map(el -> "\"" + el + "\"").toList();

        //Отпечатать в консоль с новой строки
        list.forEach(System.out::println);
    }
}
