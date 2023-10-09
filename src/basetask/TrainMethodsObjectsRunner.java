package basetask;

public class TrainMethodsObjectsRunner {
    public static void main(String[] args) {
        TrainMethodsObjects trainMethodsObjects = new TrainMethodsObjects();
        trainMethodsObjects.processMouse(new Mouse("Liza", 1));
        trainMethodsObjects.processBee(new Bee("male", 10));
        trainMethodsObjects.processObstacle(new Obstacle("2", "test"));
        trainMethodsObjects.processPineapple(new Pineapple("don't know", 20));
        trainMethodsObjects.processSouce(new Souce("тартар", "red"));



    }
}
