package professional_homewrok12.task3;

import java.io.IOException;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        GsonParser parser = new GsonParser();

        HashMap<String,String> map = new HashMap<>();

        map.put("Страна", "Украина");
        map.put("Город","Киев");
        map.put("Улица","Крущатик");

        parser.parser(map);
    }
}
