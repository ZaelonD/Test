package task3;

public class Solution {
    public static void main(String[] args) {
        Root root = new Root();
        JsonSimpleParser parser = new JsonSimpleParser(root);
        root = parser.parseValuesJson("values.json");
        System.out.println(root.toString());
        root = parser.parseTestsJson("tests.json");
    }
}
