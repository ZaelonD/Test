package task4;

import java.util.Arrays;

public class Calculate {

    private static int medianIndex(int[] array) {
        return (array.length - 1) / 2;
    }

    public static int minStepsCount(int[] array) {
        int count = 0;
        Arrays.sort(array);
        int index = medianIndex(array);
        for (int i : array) {
            count += Math.abs(array[index] - i);
        }
        return count;
    }
}
