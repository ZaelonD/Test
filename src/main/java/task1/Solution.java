package task1;

public class Solution {
    public static void main(String[] args) {
        CircularArray circularArray = new CircularArray(args[0], args[1]);
        circularArray.print(circularArray.CalculatePath());
    }
}
