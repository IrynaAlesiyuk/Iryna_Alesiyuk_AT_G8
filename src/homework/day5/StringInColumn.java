package homework.day5;

public class StringInColumn {

//1.1 сделать метод, который позволяет отпечатать в консоль все буквы в стобик из строки текста,
// которую принимает на вход в виде аргумента.
    public void printStringInOneColumn(String stringInput) {
        String strWithoutSpace = stringInput.replaceAll(" ", "");
        char[] arr = strWithoutSpace.toCharArray();
        for (char c : arr) {
            System.out.println(c);
        }
    }


}
