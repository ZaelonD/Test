package task2;

public class Radius {
    private int radius;

    public Radius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Radius{" +
                "radius=" + radius +
                '}';
    }
}
