package professional_homewrok12.task3;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;

public class GsonParser {
    public void parser(HashMap<String, String> map) throws IOException {
        GsonBuilder gsonBuilder = new GsonBuilder();

        gsonBuilder.setPrettyPrinting();

        Gson gson = gsonBuilder.create();

        String gsonString = gson.toJson(map);

        System.out.println(gsonString);

        Files.write(Paths.get("D:\\java_professional\\src\\main\\resources\\testGson.json"), gsonString.getBytes(), StandardOpenOption.CREATE);
    }
}
