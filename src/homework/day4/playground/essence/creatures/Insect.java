package homework.day4.playground.essence.creatures;

public abstract class Insect extends Animal {

    protected String name;

    public Insect(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
