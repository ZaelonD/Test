package task2;

import java.io.*;
import java.util.Arrays;

public class Read {
    private Dot dot;
    private Radius radius;
    private String[] docs;
    private float[][] points;

    public Read(String[] files) {
        this.docs = files;
    }

    public void ReadFile() {
        int num;
        String row;
        try {
            for (int i = 0; i < docs.length; i++) {
                BufferedReader txt = new BufferedReader(new FileReader(docs[i]));
                while ((row = txt.readLine()) != null) {
                    
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
