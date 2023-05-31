package task2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Read {
    private final String[] docs;
    private final List<String[]> points;
    private final List<String[]> circle;

    public Read(String[] files) {
        this.docs = files;
        points = new ArrayList<>();
        circle = new ArrayList<>();
    }

    public void readFile() {
        String row;
        try {
            int k = 0;
            for (String doc : docs) {
                BufferedReader txt = new BufferedReader(new FileReader(doc));
                while ((row = txt.readLine()) != null) {
                    if (k == 0 || k == 1) {
                        circle.add(row.split(" "));
                    }
                    points.add(row.split(" "));
                    k++;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<String[]> getPoints() {
        return points;
    }

    public List<String[]> getCircle() {
        return circle;
    }
}
