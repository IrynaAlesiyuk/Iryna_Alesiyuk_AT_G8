package homework.day5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ChangeDateFormat {

    // 1.6 написать метод, который принимает на вход строку с датой и временем в формате "22.00 07.09.2020"
    // и выводит в консоль в формате "September, 7, 2020 22:00"

    public void returnDateInDifferentFormat(String inputDate) {

        DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("HH.mm dd.MM.yyyy");
        LocalDateTime date = LocalDateTime.parse(inputDate, inputFormat);

        DateTimeFormatter expectedFormat = DateTimeFormatter.ofPattern("MMMM, d, yyyy HH:mm", Locale.ENGLISH);
        String outputString = date.format(expectedFormat);
        System.out.println(outputString);
    }
}
