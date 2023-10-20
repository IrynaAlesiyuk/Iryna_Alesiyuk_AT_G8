package homework.day6.generics;

public class GenericMethodsInGenericClassTwoParams<X, Y> {

    public void genericMethodGenArgs(X arg1) {
        System.out.println(String.format("I received %d arguments of type: %s class, %s class",
                1, arg1.getClass().getSimpleName()));
    }

    public void genericMethodGenArgs(X arg1, Y arg2) {
        System.out.println(String.format("I received %d arguments of type: %s class, %s class",
                2, arg1.getClass().getSimpleName(), arg2.getClass().getSimpleName()));
    }

//    public void genericMethodHalfGenArgs(X arg2, String str) {
//        System.out.println(String.format("I got an object of %s class and string with N characters",
//               arg2.getClass().getSimpleName(), str.toCharArray().length));
//    } error
    public void genericMethodHalfGenArgs(X arg1, String str) {
        System.out.println(String.format("I got an object of %s class and string with N characters",
                arg1.getClass().getSimpleName(), str.toCharArray().length));
    }

    public void genericMethodHalfGenArgs(X arg1, Y arg2, String str) {
        System.out.println(String.format("I got an object of %s class and %s class and string with N characters",
                arg1.getClass().getSimpleName(), arg2.getClass().getSimpleName(), str.toCharArray().length));
    }
}
