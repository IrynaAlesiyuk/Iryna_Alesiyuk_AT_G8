package homework.day5;

public class StringInColumn {
    public static void printStringInOneColumn(String stringInput) {
        String strWithoutSpace = stringInput.replaceAll(" ", "");
        char[] arr = strWithoutSpace.toCharArray();
        for (char c : arr) {
            System.out.println(c);
        }
    }


}
