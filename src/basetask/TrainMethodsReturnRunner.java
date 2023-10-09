package basetask;


public class TrainMethodsReturnRunner {

    public static void main(String[] args) {
        TrainMethodsReturn trainMethodsReturn = new TrainMethodsReturn();

        System.out.println("Метод returnNewInt() вернул " + trainMethodsReturn.returnNewInt(5));
        System.out.println("Метод returnNewLong() вернул " + trainMethodsReturn.returnNewLong(5));
        System.out.println("Метод returnNewChar() вернул " + trainMethodsReturn.returnNewChar('a'));
        System.out.println("Метод returnNewFloat() вернул " + trainMethodsReturn.returnNewFloat(15));
        System.out.println("Метод returnNewDouble() вернул " + trainMethodsReturn.returnNewDouble(15));
        System.out.println("Метод returnNewShort() вернул " + trainMethodsReturn.returnNewShort((short) 15));
        System.out.println("Метод returnNewByte() вернул " + trainMethodsReturn.returnNewByte((byte) 15));
        System.out.println("Метод returnNewBoolean() вернул " + trainMethodsReturn.returnNewBoolean(true));

    }
}
