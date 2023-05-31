package task2;

import java.util.ArrayList;
import java.util.List;

public class Fill {
    private List<Dot> dots;

    public void fillDots(List<String[]> data) {
        dots = new ArrayList<>();
        float[] nums = new float[2];
        for (String[] points : data) {
            for (int i = 0; i < points.length; i++) {
                nums[i] = Float.parseFloat(points[i]);
            }
            dots.add(new Dot(nums[0], nums[1]));
        }
    }

    public List<Dot> getDots() {
        return dots;
    }
}
