package professional_homework9.task3;

import professional_homework9.task2.Animal;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File f = new File("D:\\java_professional\\src\\main\\java\\professional_homework9\\task3\\test.txt");

        Car car = new Car("Lexus");

        try (ObjectOutputStream oos = new ObjectOutputStream((new FileOutputStream(f)));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {

            oos.writeObject(car);

            Car car1 = (Car) ois.readObject();

            System.out.println(car1);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
