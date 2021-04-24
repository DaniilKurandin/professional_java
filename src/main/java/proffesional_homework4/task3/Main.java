package proffesional_homework4.task3;

import java.io.*;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        try (OutputStream os = new FileOutputStream("D:\\java_test\\test2.txt");
             InputStream is = new FileInputStream("D:\\java_test\\test2.txt")) {

            int[] arr = new int[10];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (Math.random() * 100);
            }

            Arrays.sort(arr);

            for (int i = 0; i < arr.length; i++) {
                os.write(arr[i]);
            }

            os.flush();

            int size = is.available();

            for (int i = 0; i < size; i++) {
                System.out.print(is.read() + " ");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
