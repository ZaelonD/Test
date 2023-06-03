package task3;

import com.fasterxml.jackson.databind.ObjectMapper;
import task3.TestsJson.RootTests;
import task3.ValuesJson.RootValues;

import java.io.File;
import java.io.IOException;

public class Read {
    ObjectMapper objectMapper;
    private RootTests rootTests;
    private RootValues rootValues;

    private final String testsJson;
    private final String valuesJson;

    public Read(String[] jsonFiles) {
        this.testsJson = jsonFiles[0];
        this.valuesJson = jsonFiles[1];
        this.objectMapper = new ObjectMapper();
    }

    public void readJson() {

        try {
            rootTests = objectMapper.readValue(new File(testsJson), RootTests.class);
            rootValues = objectMapper.readValue(new File(valuesJson), RootValues.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public RootTests getRootTests() {
        return rootTests;
    }

    public RootValues getRootValues() {
        return rootValues;
    }
}
