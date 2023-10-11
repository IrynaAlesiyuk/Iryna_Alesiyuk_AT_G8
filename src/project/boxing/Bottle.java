package project.boxing;

import project.water.SparklingWater;
import project.water.Water;

public class Bottle {

    private double volume;
    Water water;

//    public Bottle(double volume) {
//        this.volume = volume;
//    }

    public void open(){
        new SparklingWater().degas();
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
