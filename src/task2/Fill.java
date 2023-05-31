package task2;

import java.util.ArrayList;
import java.util.List;

public class Fill {
    private List<Dot> dots;
    private Circle circle;
    float[] floats = new float[2];

    public void fillDots(List<String[]> data) {
        dots = new ArrayList<>();
        for (String[] points : data) {
            for (int i = 0; i < points.length; i++) {
                floats[i] = Float.parseFloat(points[i]);
            }
            dots.add(new Dot(floats[0], floats[1]));
        }
    }

    public void fillCircle(List<String[]> data) {
        int radius = 0;
        for (String[] nums : data) {
            if (nums.length == 1) {
                radius = Integer.parseInt(nums[0]);
            } else {
                for (int i = 0; i < nums.length; i++) {
                    floats[i] = Float.parseFloat(nums[i]);
                }
            }
        }
        circle = new Circle(radius, new Dot(floats[0], floats[1]));
    }

    public List<Dot> getDots() {
        return dots;
    }

    public Circle getCircle() {
        return circle;
    }
}
