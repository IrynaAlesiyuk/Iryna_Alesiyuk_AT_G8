package homework.day4.playground.essence.creatures;

public class Beetle extends Insect {

    public void nest(Carrot home) {
        if (this.mass < home.getMass()) {
            System.out.println(String.format("I am %s and I will nest there with %s my family members!"));
        } else {
            System.out.println("This carrot is too small for nesting :(");
        }
    }
}
