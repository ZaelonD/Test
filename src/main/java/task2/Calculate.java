package task2;

import java.util.*;

// Класс вычислений
public class Calculate {

    private final List<Dot> dots; // Список точек
    private final Circle circle; // объект класса Circle

    // Конструктор
    public Calculate(List<Dot> data, Circle circ) {
        this.dots = data;
        this.circle = circ;
    }

    // Метод вычисления результатов
    public void calcResult() {
        // Проходимся по списку точек
        for (Dot dot : dots) {
            if (calcDistance(dot.getX(), dot.getY()) > circle.getRadius()) {
                System.out.println(2); // Точка снаружи
            } else if (calcDistance(dot.getX(), dot.getY()) < circle.getRadius()) {
                System.out.println(1); // Точка внутри
            } else {
                System.out.println(0); // Точка лежит на окружности
            }
        }
    }

    // Метод подсчета расстояния между центром окружности и точкой
    private double calcDistance(float x, float y) {
        return Math.sqrt((Math.pow(x - circle.getCenter().getX(), 2)) + Math.pow(y - circle.getCenter().getY(), 2));
    }
}
