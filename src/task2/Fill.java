package task2;

import java.util.*;

public class Fill {
    private List<Dot> dots; // Список точек
    private Circle circle; // Объект окружность
    float[] floats = new float[2]; // временный массив для координат

    // Метод для присваивания координат точкам
    public void fillDots(List<String[]> data) {
        dots = new ArrayList<>(); // Инициализация списка
        // Проходимся по списку
        for (String[] points : data) {
            for (int i = 0; i < points.length; i++) {
                floats[i] = Float.parseFloat(points[i]); // Записываем точку в массив
            }
            dots.add(new Dot(floats[0], floats[1])); // Добавляем созданный экземпляр точки
        }
    }

    // Метод присвоения координат центру и радиус
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
