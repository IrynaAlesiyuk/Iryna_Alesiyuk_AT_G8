package classwork.day6;

public class ObjectContainer {
    Object[] array = new Object[10];
    int counter = 0;

    public void add(Object incoming) {
        if (counter < array.length) {
            array[counter++] = incoming;
        }
    }

    public Object removeLast() {
        Object elementToBeDeleted = null;
        if (!isEmpty()) {
            elementToBeDeleted = array[counter - 1];
            counter--;
        }
        System.out.println(elementToBeDeleted);
        return elementToBeDeleted;
    }

    public boolean isEmpty() {
        return counter == 0;
    }
}
