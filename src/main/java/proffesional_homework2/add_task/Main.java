package proffesional_homework2.add_task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        for (int i = 0; i < 10; i++) {
            list.add(i, reader.readLine());
            if (list.get(i).equals("end")) {
                break;
            }
        }

        list.remove("end");


        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);
    }
}
