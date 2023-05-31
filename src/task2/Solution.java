package task2;

public class Solution {
    public static void main(String[] args) {
        String[] files = {"D:/Учеба/Секрет/XXX/Test/src/task2/text1.txt", "text2.txt"};

        Read read = new Read(files);
        read.ReadFile();
    }
}
