package homework.day3.cycletask;


import java.util.Random;

public class ArrayTasks {

    public void fillInArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
    }

    public void returnAllElementsOfArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public void returnAllElementsOfArrayInReverse(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void returnElementOfArrayInSquare(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Initial element: " + array[i]);
            System.out.println("In sqaure: " + array[i] * array[i]);
        }
    }

    public void minArrayElement(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Min array element: " + min);
    }

    public void changeOrder(int[] array) {
        int firstElement = array[0];
        int lastElement = array[array.length - 1];
        array[0] = lastElement;
        array[array.length - 1] = firstElement;
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

}
