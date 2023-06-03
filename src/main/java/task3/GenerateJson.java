package task3;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import task3.TestsJson.RootTests;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GenerateJson {

    public static void generate(RootTests rootTests) {
        try (PrintWriter out = new PrintWriter(new FileWriter("report.json"))) {
            ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
            String json = ow.writeValueAsString(rootTests);
            out.write(json);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
