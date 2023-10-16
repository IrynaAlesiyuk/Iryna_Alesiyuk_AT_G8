package project.water;

public class SparklingWater extends Water {

    private boolean isOpened;
    private Bubble[] bubbles;

    public SparklingWater() {
        isOpened();
    }


    public void pump(Bubble[] bubbles) {
        for (int i = 0; i <= bubbles.length; i++) {
            //   ???
        }
    }

    private void degas() throws InterruptedException {
        // 10 + 5 * getTemperature();
        Thread.sleep(1000);
    }
    public void setOpened() throws InterruptedException {
        isOpened = true;
        degas();
    }

    private void isOpened(){
        //nothing to do
    }
}
