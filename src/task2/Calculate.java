package task2;

import java.util.List;

public class Calculate {

    private List<Dot> dots;
    private Circle circle;
    private int radius;
    private int[] result;

    public Calculate(List<Dot> data, Circle circ) {
        this.dots = data;
        this.circle = circ;
    }

    public void calcResult() {
        for (Dot dot : dots) {
           if(calcDistance(dot.getX(), dot.getY()))
        }
    }

    private double calcDistance(float x, float y) {
        return Math.abs(Math.sqrt((Math.pow(x - circle.getCenter().getX(), 2)) + Math.pow(y - circle.getCenter().getY(), 2)));
    }
}
