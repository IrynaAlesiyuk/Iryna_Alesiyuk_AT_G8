package cycletask;

public class CycleTaskRunner {

    public static void main(String[] args) {
        new WhileTask().returnDigitsTill20();
        new ForTask().returnOddNumber();

        int[] array = new int[7];
        ArrayTasks arrayTasks = new ArrayTasks();
        arrayTasks.fillInArrayWithRandomNumbers(array);
        arrayTasks.returnAllElementsOfArray(array);
        arrayTasks.returnAllElementsOfArrayInReverse(array);
        arrayTasks.returnElementOfArrayInSquare(array);
        arrayTasks.minArrayElement(array);
        arrayTasks.changeOrder(array);

    }
}
