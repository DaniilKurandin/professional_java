package professional_homework9.task2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File f = new File("D:\\java_professional\\src\\main\\java\\professional_homework9\\task2\\test.txt");

        Animal animal = new Animal("Penguin", 2, 1);

        try (ObjectOutputStream oos = new ObjectOutputStream((new FileOutputStream(f)));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {

            oos.writeObject(animal);

            Animal animal1 = (Animal) ois.readObject();

            System.out.println(animal1);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
