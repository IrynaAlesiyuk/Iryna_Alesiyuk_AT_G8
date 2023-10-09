package bubbles;

public abstract class Water {
    private String color;
    private String transparency;
    private String smell;
    private int temperature;


    //вода заполняется пузырьками при упаковке на заводе
    //1 литр воды содержит 10 тыс пузырьков
    public abstract void pump(Bubble[] bubbles);
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransparency() {
        return transparency;
    }

    public void setTransparency(String transparency) {
        this.transparency = transparency;
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
