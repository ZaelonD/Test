package task4;

public class Solution {
    public static void main(String[] args) {
        Read read = new Read(args);
        read.readFile();
        ConvertArray convertArray = new ConvertArray(read.getStrings());
        convertArray.convert();
        System.out.print(Calculate.minStepsCount(convertArray.getArray()));
    }
}
