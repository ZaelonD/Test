package task3;

import java.util.List;

public class Values {
    private final int id;
    private final String value;

    public Values(int id, String value) {
        this.id = id;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{" +
                "id: " + id +
                ", value: '" + value + '\'' +
                '}';
    }
}
