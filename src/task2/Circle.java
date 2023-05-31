package task2;

public class Circle {

    private int radius;
    private Dot center;

    public Circle(int radius, Dot center) {
        this.radius = radius;
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Dot getCenter() {
        return center;
    }

    public void setCenter(Dot center) {
        this.center = center;
    }
}
