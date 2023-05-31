package task2;

// Класс Окружность
public class Circle {

    private final int radius; // Радиус
    private final Dot center; // Точка (центр)

    // Конструктор
    public Circle(int radius, Dot center) {
        this.radius = radius;
        this.center = center;
    }

    // Геттер для получения радиуса
    public int getRadius() {
        return radius;
    }

    // Геттер для получения центра окружности
    public Dot getCenter() {
        return center;
    }
}
