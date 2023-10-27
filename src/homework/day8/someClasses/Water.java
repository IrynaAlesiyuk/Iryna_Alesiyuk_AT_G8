package homework.day8.someClasses;

import java.util.Objects;

public class Water {

    private int weight;
    private String color;

    public Water(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
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
        return weight == water.weight && Objects.equals(color, water.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, color);
    }

    @Override
    public String toString() {
        return "Water{" +
                "weight=" + weight +
                ", name='" + color + '\'' +
                '}';
    }
}
