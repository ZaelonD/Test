package task3.ValuesJson;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class RootValues {
    ArrayList<Value> values;

    @JsonProperty("values")
    public ArrayList<Value> getValues() {
        return this.values;
    }

    public void setValues(ArrayList<Value> values) {
        this.values = values;
    }
}

