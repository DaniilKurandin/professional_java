package professional_homework4.dop_task;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\java_test\\test3.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String temp;
        while ((temp = br.readLine()) != null) {
            System.out.println(temp);
        }
        br.close();
    }
}
