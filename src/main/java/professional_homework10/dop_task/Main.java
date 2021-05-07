package professional_homework10.dop_task;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", 2015, 1000);

        ByteArrayOutputStream byteOutput = null;
        ByteArrayInputStream byteInput = null;

        ObjectOutputStream output = null;
        ObjectInputStream input = null;

        try {
            Car carClone1 = (Car) car.clone();

            System.out.println("Original - " + car);
            System.out.println("Clone - " + carClone1);

            byteOutput = new ByteArrayOutputStream();
            output = new ObjectOutputStream(byteOutput);

            output.writeObject(car);

            byteInput = new ByteArrayInputStream(byteOutput.toByteArray());
            input = new ObjectInputStream(byteInput);

            Car carClone2 = (Car) input.readObject();

            System.out.println("Serialization - " + carClone2);

        } catch (IOException | ClassNotFoundException | CloneNotSupportedException e) {
            e.printStackTrace();
        } finally {
            try {
                if (byteOutput != null) {
                    byteOutput.flush();
                    byteOutput.close();

                }

                if (byteInput != null) {
                    byteInput.close();
                }

                if (output != null) {
                    output.flush();
                    output.close();
                }

                if (input != null) {
                    input.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
