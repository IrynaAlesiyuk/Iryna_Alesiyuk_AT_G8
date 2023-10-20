package homework.day5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ReturnCurrentDateInFormat {

//1.5 написать метод, который выводит в консоль текущую дату и время в формате:
//Сейчас на дворе: 19 сентября, 2020, 3 часа 13 минут

    public void returnCurrentDateInCustomFormat() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM, yyyy, H часов m минут",
                new Locale("ru"));
        String date = now.format(formatter);
        System.out.println(date);
    }
}
