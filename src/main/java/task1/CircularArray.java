package task1;

import java.util.*;

public class CircularArray {

    private final int N;
    private final int M;
    private final List<int[]> intervals;
    private int[] path;

    public CircularArray(String n, String m) {
        this.N = Integer.parseInt(n);
        this.M = Integer.parseInt(m);
        intervals = new ArrayList<>();
    }

    public int[] CalculatePath() {
        int[] arr = fill();
        int[] arr1 = new int[M];
        System.arraycopy(arr, 0, arr1, 0, M);
        intervals.add(arr1);
        int cnt = -1;
        while (true) {
            int[] arr2 = new int[M];
            for (int i = 0; i < M; i++) {
                arr2[i] = arr[M + cnt];
                cnt++;
            }
            if (arr2[M - 1] == 1) {
                intervals.add(arr2);
                break;
            } else {
                intervals.add(arr2);
                cnt--;
            }
        }
        pathCount(intervals);
        return path;
    }

    private void pathCount(List<int[]> intervals) {
        path = new int[intervals.size()];
        for (int i = 0; i < intervals.size(); i++) {
            path[i] = intervals.get(i)[0];
        }
    }

    private int[] fill() {
        int[] arr = new int[N * M];
        int k = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 1; j <= N; j++) {
                arr[k] = j;
                k++;
            }
        }
        return arr;
    }

    public void print(int[] path) {
        for (int num : path) {
            System.out.print(num);
        }
    }
}