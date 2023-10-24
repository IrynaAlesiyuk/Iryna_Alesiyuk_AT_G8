package homework.day7;

import java.util.Scanner;

public class ReturnStringFromConsole {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String incomming = scanner.nextLine();
            System.out.println(String.format("Hello, I just got '%s' from you!", incomming));
            if (incomming.equalsIgnoreCase("red")) {
                return;
            }
        }
    }
}
