package project.water;


public class Bubble {

    private double volume;
    private String gasComposition;

    public Bubble(String gasComposition) {
        this.volume = 0.3;
        this.gasComposition = gasComposition;
    }

    public void burst(){
        System.out.println("Cramp!");
    }
}
