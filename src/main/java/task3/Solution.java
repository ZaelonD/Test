package task3;

import task3.TestsJson.RootTests;

public class Solution {

    public static void main(String[] args) {
        Read read = new Read(args);
        read.readJson();
        Fill.fillJson(read.getRootTests().getTests(), read.getRootValues().getValues());
        RootTests modRootTests = read.getRootTests();
        GenerateJson.generate(modRootTests);
    }
}