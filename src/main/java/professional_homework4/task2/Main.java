package professional_homework4.task2;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\java_test\\test.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String temp;
        while ((temp = br.readLine()) != null) {
            System.out.println(temp);
        }
        br.close();

        PrintWriter pw = new PrintWriter(new FileWriter(file, true));

        pw.println("new string");
        pw.flush();
        pw.close();
    }
}
