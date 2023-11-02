package homework.day9;

import java.util.stream.Stream;

public class ElementsRunner7 {
    public static void main(String[] args) {
        //Создать поток данных стрингов elements (Text field, Radio, Check-box, Drop-down, Picker, Breadcrumb)
        // (через Stream.of())
        Stream<String> countries = Stream.of("Text field", "Radio", "Check-box", "Drop-down", "Picker", "Breadcrumb");

        //Если слово нечетное, то заменить в нем все буквы "e" на букву "o", а если четное,
        // то заменить слово на число количества буков в этом слове
       // List<String> changed = countries
        //        .map((word, index) -> index % 2 = 1 ? word.replace("e", "o"):word.length()).toList();

        //Оставить в потоке только уникальные значения

        //Отпечатать в консоль с новой строки
    }
}
