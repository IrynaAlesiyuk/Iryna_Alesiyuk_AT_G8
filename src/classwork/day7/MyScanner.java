package classwork.day7;

import java.util.Scanner;

public class MyScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String incomming = scanner.nextLine();
            System.out.printf("Just got '%s' text", incomming);
            if (incomming.equalsIgnoreCase("red")) {
                return;
            }
        }
    }
}
