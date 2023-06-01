package task4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Read {
    private final List<String> strings;
    private final String[] docs; // Строковый массив для файлов

    public Read(String[] docs) {
        this.docs = docs;
        this.strings = new ArrayList<>();
    }

    public void readFile(){
        String row;
        try {
            for (String doc : docs) {
                BufferedReader txt = new BufferedReader(new FileReader(doc));
                // Идем по каждой строке
                while ((row = txt.readLine()) != null) {
                    strings.add(row);
                }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<String> getStrings() {
        return strings;
    }
}
