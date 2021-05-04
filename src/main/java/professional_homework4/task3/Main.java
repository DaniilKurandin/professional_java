package professional_homework4.task3;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("D:\\java_test\\test2.txt"));
        List<Integer> arr = new ArrayList<>();
        while (scanner.hasNext()) {
            arr.add(scanner.nextInt());
        }

        Collections.sort(arr);

        System.out.println(arr);

        scanner.close();
    }

}
