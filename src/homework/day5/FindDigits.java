package homework.day5;

public class FindDigits {
   //  1.3 сделать метод, который позволяет найти в тексте все цифры и преобразовать их в массив
   //  числовых переменных, вывести все элементы массива в косоль,текст получает на вход в виде аргумента
    public void findDigitsInString(String stringInput) {
        for (char c : stringInput.toCharArray()) {
            if (Character.isDigit(c)) {
                System.out.println(c);
            }
        }
    }
}
