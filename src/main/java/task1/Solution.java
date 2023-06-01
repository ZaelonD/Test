package task1;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        //int[] path = CircularArray.CalculatePath(args);
        //Scanner sc = new Scanner(System.in);
        //System.out.print("Введите длину массива: ");
        int n = Integer.parseInt(args[0]);
        //System.out.print("Введите длину обхода: ");
        int m = Integer.parseInt(args[1]);
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        int[] arr1 = new int[m];
        while (arr1[m - 1] != arr[0]) {
            for (int i = 0; i < m; i++) {
                arr1[i] = arr[(i + m) % n];
            }
        }
        System.out.print("Путь: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[(i + m) % n]);
        }
    }
}
