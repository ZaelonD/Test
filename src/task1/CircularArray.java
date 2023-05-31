package task1;

public class CircularArray {
    public static int[] CalculatePath(String[] args) {
        int[] result = new int[4];
//        int n = Integer.parseInt(args[0]); // Длина исходного массива
//        int m = Integer.parseInt(args[1]); // Длина обхода
//
        int n = 3; // Длина исходного массива
        int m = 3; // Длина обхода

        int[] circArray = new int[n];
        fill(circArray);
        for (int i = 0; i < n; i++) {
            result[i] = circArray[(i + m) % n];
        }
        return result;
    }

    private static void fill(int[] circArray) {
        for (int i = 0; i < circArray.length; ) {
            circArray[i] = ++i;
        }
    }
}