package homework.day6.generics;

public class GenericMethodsInGenericClassTRunner {

    public static void main(String[] args) {
        GenericMethodsInGenericClassT<String> genericMethodsInGenericClassString = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassString.genericMethodOneGenArg("qwe");
        genericMethodsInGenericClassString.genericMethodTwoGenArgs("asd", "zxc");
        genericMethodsInGenericClassString.genericMethodHalfGenArgs("qwwwe", "test");

        GenericMethodsInGenericClassT<Integer> genericMethodsInGenericClassInt = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassInt.genericMethodOneGenArg(1);
        genericMethodsInGenericClassInt.genericMethodTwoGenArgs(2, 3);
        genericMethodsInGenericClassInt.genericMethodHalfGenArgs(4, "test");

        GenericMethodsInGenericClassT<Double> genericMethodsInGenericClassDouble = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassDouble.genericMethodOneGenArg(0.2);
        genericMethodsInGenericClassDouble.genericMethodTwoGenArgs(0.2, 0.3);
        genericMethodsInGenericClassDouble.genericMethodHalfGenArgs(0.2, "qwe");
    }

}
