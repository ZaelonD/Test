package task2;

import java.util.List;

public class Dot {
    private float x;
    private float y;
    private List<List<Float>> points;

    public Dot(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

}
