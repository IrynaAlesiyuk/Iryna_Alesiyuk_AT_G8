package homework.day4.playground.essence.craft.field;

public class Motorbike extends Vehicle {

    public Motorbike(int mass, String name) {
        super(mass, name);
    }

    @Override
    public int move(int pointA, int pointB) {
        System.out.println(String.format("I am %s, my name is %s and I am moving from point %d to point %d",
                Motorbike.class.getName(), this.getName(), pointA, pointB));
        return pointB - pointA;
    }
}
