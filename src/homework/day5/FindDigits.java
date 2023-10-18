package homework.day5;

import java.util.NoSuchElementException;

public class FindDigits {
    //1.3
    public static void findDigitsInString(String stringInput) {
        for (char c : stringInput.toCharArray()) {
            if (Character.isDigit(c)) {
                System.out.println(c);
            }
        }
    }
}
