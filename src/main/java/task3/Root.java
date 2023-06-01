package task3;

import task3.tests.TestValue;
import task3.values.Value;

import java.util.List;

public class Root {
    private List<Value> values;
    private List<TestValue> tests;

    public List<Value> getValues() {
        return values;
    }

    public void setValues(List<Value> values) {
        this.values = values;
    }

    public List<TestValue> getTests() {
        return tests;
    }

    public void setTests(List<TestValue> tests) {
        this.tests = tests;
    }

    @Override
    public String toString() {
        return "{" +
                "values: " + values +
                '}';
    }
}
