package homework.day3.basetask.ifTask;

import homework.day3.basetask.ifTask.TrainMethodsIf;

public class TrainMethodsIfRunner {

    public static void main(String[] args) {

        TrainMethodsIf trainMethodsIf = new TrainMethodsIf();

        System.out.println("Метод returnNewInt() вернул " + trainMethodsIf.returnNewInt(5));
        System.out.println("Метод returnNewLong() вернул " + trainMethodsIf.returnNewLong(5));
        System.out.println("Метод returnNewChar() вернул " + trainMethodsIf.returnNewChar('a'));
        System.out.println("Метод returnNewFloat() вернул " + trainMethodsIf.returnNewFloat(15));
        System.out.println("Метод returnNewDouble() вернул " + trainMethodsIf.returnNewDouble(15));
        trainMethodsIf.returnNewBoolean(true);

    }
}
