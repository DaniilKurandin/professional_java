package professional_homework10.task2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird("Alex", 7);

        ByteArrayOutputStream byteOutput = null;
        ByteArrayInputStream byteInput = null;

        ObjectOutputStream output = null;
        ObjectInputStream input = null;

        try {
            byteOutput = new ByteArrayOutputStream();
            output = new ObjectOutputStream(byteOutput);

            output.writeObject(bird);

            byteInput = new ByteArrayInputStream(byteOutput.toByteArray());
            input = new ObjectInputStream(byteInput);

            Bird cloneBird = (Bird) input.readObject();


            System.out.println(bird);
            System.out.println(cloneBird);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (byteOutput != null) {
                    byteOutput.flush();
                    byteOutput.close();

                }

                if(byteInput != null) {
                    byteInput.close();
                }

                if(output != null) {
                    output.flush();
                    output.close();
                }

                if(input != null) {
                    input.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
