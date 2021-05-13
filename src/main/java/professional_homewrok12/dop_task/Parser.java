package professional_homewrok12.dop_task;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Parser {
    public static void parseJson(String url) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        Currency[] currency = objectMapper.readValue(new URL(url), Currency[].class);

        for (Currency currencys : currency) {
            System.out.println(currencys);
        }

        String jsonString = objectMapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(currency);

        System.out.println();

        System.out.println(jsonString);

        Files.write(Paths.get("D:\\java_professional\\src\\main\\resources\\jacksonCurrency.json"),
                jsonString.getBytes(), StandardOpenOption.CREATE);
    }
}
