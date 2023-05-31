package task2;

public class Solution {
    public static void main(String[] args) {
        Read read = new Read(args); // Создаем экземпляр класса Read и передаем массив файлов
        read.readFile(); // Метод чтения файла
        Fill fill = new Fill(); // Создаем экземпляр класса Fill
        fill.fillDots(read.getPoints()); // Метод для присваивания координат точкам
        fill.fillCircle(read.getCircle()); // Метод для присваивания центра и радиуса окружности
        Calculate calculate = new Calculate(fill.getDots(), fill.getCircle()); // Создаем экземпляр класса Calculate и передаем список точек и окружность
        calculate.calcResult(); // Считаем результат
    }
}
