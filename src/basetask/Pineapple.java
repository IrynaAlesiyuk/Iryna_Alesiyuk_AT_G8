package basetask;

public class Pineapple {
    private String grade;
    private int heatCapacity;

    public Pineapple(String grade, int heatCapacity) {
        this.grade = grade;
        this.heatCapacity = heatCapacity;
    }

    public void printPineappleDetails(){
        if(this.heatCapacity>2140){
            System.out.println("Я ананас, теплоемкость которого больше, чем у ветчины");
        }
        System.out.println("В ветчине тепла запасется больше :(");
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getHeatCapacity() {
        return heatCapacity;
    }

    public void setHeatCapacity(int heatCapacity) {
        this.heatCapacity = heatCapacity;
    }
}
