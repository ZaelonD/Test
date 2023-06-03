package task3.TestsJson;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TestValue {
    int id;
    String title;
    String value;
    ArrayList<TestValue> testValues;


    @JsonProperty("id")
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("title")
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @JsonProperty("value")
    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    @JsonProperty("values")
    public ArrayList<TestValue> getValues() {
        return this.testValues;
    }

    public void setValues(ArrayList<TestValue> testValues) {
        this.testValues = testValues;
    }

}
