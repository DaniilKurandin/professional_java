package professional_homewrok12.task2;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;

public class JacksonParser {
    public void parser(HashMap<String, String> map) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        String stringJSON = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(map);

        System.out.println(stringJSON);

        Files.write(Paths.get("D:\\java_professional\\src\\main\\resources\\testJackson.json"), stringJSON.getBytes(), StandardOpenOption.CREATE);

//        public void parser(JSONObject object) throws IOException {
//            ObjectMapper objectMapper = new ObjectMapper();
//
//            String stringJSON = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(map);
//
//            System.out.println(stringJSON);
//
//            Files.write(Paths.get("D:\\java_professional\\src\\main\\resources\\test.json"),stringJSON.getBytes(), StandardOpenOption.CREATE);
//    }
    }
}
