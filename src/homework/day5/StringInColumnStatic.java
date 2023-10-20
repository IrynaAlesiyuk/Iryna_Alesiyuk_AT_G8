package homework.day5;

public class StringInColumnStatic {

//1.1 сделать метод, который позволяет отпечатать в консоль все буквы в стобик из строки текста,
// которую принимает на вход в виде аргумента.
    public static void printStringInOneColumn(String stringInput) {
        String strWithoutSpace = stringInput.replaceAll(" ", "");
        char[] arr = strWithoutSpace.toCharArray();
        for (char c : arr) {
            System.out.println(c);
        }
    }


}
