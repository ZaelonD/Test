package task3;

import org.json.simple.*;
import org.json.simple.parser.*;
import task3.tests.TestValue;
import task3.values.Value;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class JsonSimpleParser {

    private Root root;
    private JSONParser parser;
    private static final String TAG_VALUES = "values";
    private static final String TAG_ID = "id";
    private static final String TAG_VALUE = "value";
    private static final String TAG_TITLE = "title";
    private static final String TAG_TESTS = "tests";

    public JsonSimpleParser(Root root) {
        this.root = root;
        this.parser = new JSONParser();
    }

    public Root parseValuesJson(String file) {

        try (FileReader reader = new FileReader(file)) {

            JSONObject rootJsonObj = (JSONObject) parser.parse(reader);
            JSONArray valuesJsonArray = (JSONArray) rootJsonObj.get(TAG_VALUES);
            List<Value> valueList = new ArrayList<>();

            for (Object o : valuesJsonArray) {
                JSONObject valuesJsonObj = (JSONObject) o;

                long resultId = (Long) valuesJsonObj.get(TAG_ID);
                String resultValue = (String) valuesJsonObj.get(TAG_VALUE);

                Value value = new Value((int) resultId, resultValue);
                valueList.add(value);
            }
            root.setValues(valueList);
            return root;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Root parseTestsJson(String file) {
        try (FileReader reader = new FileReader(file)) {

            JSONObject rootJsonObj = (JSONObject) parser.parse(reader);
            JSONArray testsJsonArray = (JSONArray) rootJsonObj.get(TAG_TESTS);
            List<TestValue> testsList = new ArrayList<>();
            Iterator iterator = testsJsonArray.iterator();
            while (iterator.hasNext()){
                System.out.println("> " + iterator.next());
            }
//            for (Object o : testsJsonArray) {
//                JSONObject testsJsonObj = (JSONObject) o;
//
//                if (testsJsonObj.size() > 3) {
//
//                    long testId = (Long) testsJsonObj.get(TAG_ID);
//                    String testTitle = (String) testsJsonObj.get(TAG_TITLE);
//                    String value = (String) testsJsonObj.get(TAG_VALUE);
//                    JSONArray valuesJsonArray = (JSONArray) testsJsonObj.get(TAG_VALUES);
//                } else {
//                    long testId = (Long) testsJsonObj.get(TAG_ID);
//                    String testTitle = (String) testsJsonObj.get(TAG_TITLE);
//                    String value = (String) testsJsonObj.get(TAG_VALUE);
//                    TestValue testValue = new TestValue((int) testId, testTitle, value);
//                    testsList.add(testValue);
//                }
//            }
            root.setTests(testsList);
            return root;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
