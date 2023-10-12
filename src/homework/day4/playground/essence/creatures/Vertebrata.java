package homework.day4.playground.essence.creatures;

public abstract class Vertebrata extends Animal {


    protected String name;

    public Vertebrata(String name) {
        this.name = name;
    }

    public Vertebrata() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(Insect food) {
        System.out.println(String.format("I am %s and I am eating %s", this.name, food.getName()));

    }
}
