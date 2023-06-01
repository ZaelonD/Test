package task3.tests;

import task3.values.Value;

import java.util.List;

public class TestValue {
    private int id;
    private String title;
    private String value;
    private List<TestValue> values;

    public TestValue(int id, String title, String value, List<TestValue> values) {
        this.id = id;
        this.title = title;
        this.value = value;
        this.values = values;
    }

    public TestValue(int id, String title, String value) {
        this.id = id;
        this.title = title;
        this.value = value;
    }
}
