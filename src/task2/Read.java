package task2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Read {
    private Dot dot;
    private Radius radius;
    private final String[] docs;
    private final List<String[]> data;

    public Read(String[] files) {
        this.docs = files;
        data = new ArrayList<>();
    }

    public void readFile() {
        String row;
        try {
            int k = 0;
            for (String doc : docs) {
                BufferedReader txt = new BufferedReader(new FileReader(doc));
                while ((row = txt.readLine()) != null) {
                    if (k == 1){
                        radius = new Radius(Integer.parseInt(row));
                        k++;
                        continue;
                    }
                    data.add(row.split(" "));
                    k++;
                }
            }
            System.out.println(radius.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<String[]> getData() {
        return data;
    }
}
