package basetask;

public class Bee {
    private String gender;
    private int weight;

    public Bee(String gender, int weight) {
        this.gender = gender;
        this.weight = weight;
    }

    public void printBeeDetails() {
        System.out.printf("Я легче лося в %d раз", 500 / this.weight);
        System.out.println();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
