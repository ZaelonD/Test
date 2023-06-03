package task3;

import task3.TestsJson.Test;
import task3.TestsJson.TestValue;
import task3.ValuesJson.Value;

import java.util.List;

public class Fill {
    public static void fillJson(List<Test> tests, List<Value> values) {
        for (Test test : tests) {
            for (Value testValue : values) {
                if (test.getId() == testValue.getId()) {
                    test.setValue(testValue.getValue());
                    break;
                }
            }
            if (test.getValues() != null) {
                List<TestValue> v = test.getValues();
                internal(values, v);
            }
        }
    }

    private static void internal(List<Value> values, List<TestValue> v) {
        for (TestValue va : v) {
            for (Value testValue : values) {
                if (va.getId() == testValue.getId()) {
                    va.setValue(testValue.getValue());
                    break;
                }
            }
            if (va.getValues() != null) {
                internal(values, va.getValues());
            }
        }
    }
}
