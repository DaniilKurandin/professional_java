package professional_homewrok12.task2;

import org.json.JSONObject;

import java.io.IOException;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        JacksonParser parser = new JacksonParser();

        HashMap<String,String> map = new HashMap<>();

        map.put("Страна", "Украина");
        map.put("Город","Киев");
        map.put("Улица","Крущатик");

        parser.parser(map);

//        JSONObject object = new JSONObject();
//        object.put("Страна", "Украина");
//        object.put("Город","Киев");
//        object.put("Улица","Крущатик");
//
//        System.out.println(object);
//
//        parser.parser(object);

    }
}
