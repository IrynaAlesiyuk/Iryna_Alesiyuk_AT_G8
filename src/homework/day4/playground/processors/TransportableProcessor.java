package homework.day4.playground.processors;

import homework.day4.playground.essence.craft.Transportable;

import static homework.day4.playground.utils.CoordinatesGenerator.generateCoordinate;

public class TransportableProcessor {

    public void runTransportable(Transportable transportable, int pointA, int pointB) {
        int distance = transportable.move(pointA, pointB);
        System.out.println(String.format("Transportable %s was moved to %d points", transportable.getClass().getSimpleName(), Math.abs(distance)));
    }

    public void runTransportable(Transportable transportable) {
        int distance = transportable.move(generateCoordinate(), generateCoordinate());
        System.out.println(String.format("Transportable %s was moved to %d points", transportable.getClass().getSimpleName(), Math.abs(distance)));

    }
}
