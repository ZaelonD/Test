package task3;

import java.util.List;

public class Root {
    private List<Values> values;

    public List<Values> getValues() {
        return values;
    }

    public void setValues(List<Values> values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return "{" +
                "values: " + values +
                '}';
    }
}
