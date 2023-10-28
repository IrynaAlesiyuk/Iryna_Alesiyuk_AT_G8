package homework.day8.someClasses;

import java.util.Objects;

public class Water {

    private String smell;
    private String color;

    public Water(String smell, String color) {
        this.smell = smell;
        this.color = color;
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Water water = (Water) o;
        return smell == water.smell && Objects.equals(color, water.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(smell, color);
    }

    @Override
    public String toString() {
        return "Water{" +
                "smell=" + smell +
                ", name='" + color + '\'' +
                '}';
    }
}
