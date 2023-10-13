package homework.day4.playground.essence.craft.field;

public class Car extends Vehicle {

    public Car(int mass, String name) {
        super(mass, name);
    }

    @Override
    public int move(int pointA, int pointB) {
        System.out.println(String.format("I am %s, my name is %s and I am moving from point %d to point %d",
                Car.class.getName(), this.getName(), pointA, pointB));
        return pointB - pointA;
    }

}
