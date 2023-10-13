package homework.day4.playground.essence.craft.air;

public class Rocket extends Aircraft {
    public Rocket(int mass, String name) {
        super(mass, name);
    }

    @Override
    public void fly(String direction) {
        System.out.println(String.format("I am %s, my name is %s and I amd flying to %s", Rocket.class.getName(), this.getName(), direction));
    }

    @Override
    public int move(int pointA, int pointB) {
        System.out.println(String.format("I am %s, my name is %s and I am moving from point %d to point %d",
                Rocket.class.getName(), this.getName(), pointA, pointB));
        return pointB - pointA;
    }
}
