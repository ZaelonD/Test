package task2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

// Класс для чтения
public class Read {
    private final String[] docs; // Строковый массив для файлов
    private final List<String[]> points; // Список точек
    private final List<String[]> circle; // список для окружности

    // Конструктор
    public Read(String[] files) {
        this.docs = files;
        points = new ArrayList<>();
        circle = new ArrayList<>();
    }

    // Метод для чтения файлов
    public void readFile() {
        String row;
        try {
            int k = 0;
            for (String doc : docs) {
                BufferedReader txt = new BufferedReader(new FileReader(doc));
                // Идем по каждой строке
                while ((row = txt.readLine()) != null) {
                    if (k == 0 || k == 1) {
                        circle.add(row.split(" "));
                        k++;
                        continue;
                    }
                    points.add(row.split(" "));
                    if (k == 102) {
                        System.out.println("Ограничение! Более 100 точек запрещено!");
                        break;
                    }
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
