package task3.tests;

import task3.values.Value;

import java.util.List;

public class Test {
    private int id;
    private String title;
    private String value;
    private List<TestValue> values;

    public Test(int id, String title, String value, List<TestValue> values) {
        this.id = id;
        this.title = title;
        this.value = value;
        this.values = values;
    }

    public List<TestValue> getValues() {
        return values;
    }

    public void setValues(List<TestValue> values) {
        this.values = values;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", value='" + value + '\'' +
                ", values=" + values +
                '}';
    }
}
