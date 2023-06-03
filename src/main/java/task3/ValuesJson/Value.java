package task3.ValuesJson;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Value {
    int id;
    String value;

    @JsonProperty("id")
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("value")
    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
