package task2;

import java.util.List;

public class Solution {
    public static void main(String[] args) {
        String[] files = {"text1.txt", "text2.txt"};

        Read read = new Read(files);
        read.readFile();
        Fill fill = new Fill();
        fill.fillDots(read.getData());
        List<Dot> dots = fill.getDots();
        for (Dot dot : dots) {
            System.out.println(dot.toString());
        }

    }
}
