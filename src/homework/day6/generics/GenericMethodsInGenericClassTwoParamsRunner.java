package homework.day6.generics;

public class GenericMethodsInGenericClassTwoParamsRunner {

    public static void main(String[] args) {
        GenericMethodsInGenericClassTwoParams<String, String> genericMethodsInGenericClassString = new GenericMethodsInGenericClassTwoParams<>();
        genericMethodsInGenericClassString.genericMethodGenArgs("asd", "zxc");

        GenericMethodsInGenericClassTwoParams<Integer, Integer> genericMethodsInGenericClassInteger = new GenericMethodsInGenericClassTwoParams<>();
        genericMethodsInGenericClassInteger.genericMethodGenArgs(1, 2);

        GenericMethodsInGenericClassTwoParams<String, Integer> genericMethodsInGenericClassIntegerString = new GenericMethodsInGenericClassTwoParams<>();
        genericMethodsInGenericClassIntegerString.genericMethodGenArgs("qwwwe", 1);

        GenericMethodsInGenericClassTwoParams<String, Double> genericMethodsInGenericClassStringDouble = new GenericMethodsInGenericClassTwoParams<>();
        genericMethodsInGenericClassStringDouble.genericMethodGenArgs("qwwwe", 1.9);
    }
}
