package task3;

import org.json.simple.*;
import org.json.simple.parser.*;
import java.io.FileReader;
import java.util.*;

public class JsonSimpleParser {

    private static final String TAG_VALUES = "values";
    private static final String TAG_ID = "id";
    private static final String TAG_VALUE = "value";
    private static final String TAG_TITLE = "title";

    public Root parse() {

        Root root = new Root();
        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader("values.json")) {

            JSONObject rootJsonObj = (JSONObject) parser.parse(reader);
            JSONArray valuesJsonArray = (JSONArray) rootJsonObj.get(TAG_VALUES);
            List<Values> valuesList = new ArrayList<>();

            for (Object o : valuesJsonArray) {
                JSONObject valuesJsonObj = (JSONObject) o;

                long resultId = (Long) valuesJsonObj.get(TAG_ID);
                String resultValue = (String) valuesJsonObj.get(TAG_VALUE);

                Values value = new Values((int) resultId, resultValue);
                valuesList.add(value);
            }
            root.setValues(valuesList);
            return root;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
