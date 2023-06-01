package task3;

public class Solution {
    public static void main(String[] args) {
        JsonSimpleParser parser = new JsonSimpleParser();
        Root root = parser.parse();
        System.out.println(root.toString());
    }
}
