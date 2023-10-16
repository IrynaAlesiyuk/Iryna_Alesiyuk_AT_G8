package project.boxing;

import project.water.Bubble;
import project.water.SparklingWater;
import project.water.Water;

public class Bottle {

    private double volume;
    Water water;

    public Bottle(double volume) {
        this.volume = volume;
    }

    public void open(){
     //   this.water.setOpened();
    }
    public void warn(int temperature){
     //   ??????
    }

    public void setBubbles(){
        Bubble[] bubbles = new Bubble[10000];
      //  water.????
    }

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
