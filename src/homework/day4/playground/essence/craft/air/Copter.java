package homework.day4.playground.essence.craft.air;

import homework.day4.playground.essence.creatures.Mosquito;

public class Copter extends Aircraft {

    public Copter(int mass, String name) {
        super(mass, name);
    }

    @Override
    public void fly(String direction) {
        System.out.println(String.format("I am %s, my name is %s and I amd flying to %s", Copter.class.getName(), this.getName(), direction));
    }
}
