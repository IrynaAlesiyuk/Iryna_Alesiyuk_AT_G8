package homework.day6.generics;

public class GenericMethodsInGenericClassT<T> {
    public void genericMethodOneGenArg(T whoKnows) {
        System.out.println(String.format("I am an object of %s class", whoKnows.getClass().getSimpleName()));
    }

    public void genericMethodTwoGenArgs(T whoKnows, T whoKnows2){
        System.out.println(String.format("We are objects of %s class and %s class", whoKnows.getClass().getSimpleName(),
                whoKnows2.getClass().getSimpleName()));
    }

    public void genericMethodHalfGenArgs(T whoKnows, String str){
        System.out.println(String.format("I got an object of %s class and string with %s characters", whoKnows.getClass().getSimpleName(),
                str.toCharArray().length));
    }
}
