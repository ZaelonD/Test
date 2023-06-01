package task4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Read read = new Read(args);
        read.readFile();
        ConvertArray convertArray = new ConvertArray(read.getStrings());
        convertArray.convert();
        System.out.println(Calculate.minStepsCount(convertArray.getArray()));
    }
}
