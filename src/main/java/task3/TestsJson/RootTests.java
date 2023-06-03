package task3.TestsJson;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;


public class RootTests {

    ArrayList<Test> tests;

    @JsonProperty("tests")
    public ArrayList<Test> getTests() {
        return this.tests;
    }

    public void setTests(ArrayList<Test> tests) {
        this.tests = tests;
    }


}

