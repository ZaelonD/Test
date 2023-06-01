package task3;

import java.util.List;

public class Tests {
    private List<Test> values;

    public List<Test> getValues() {
        return values;
    }

    public void setValues(List<Test> values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return "{" +
                "values=" + values +
                '}';
    }
}
