package professional_homework10.task3;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Eagle eagle = new Eagle("Alex", 1, 7);

        ByteArrayOutputStream byteOutput = null;
        ByteArrayInputStream byteInput = null;

        ObjectOutputStream output = null;
        ObjectInputStream input = null;

        try {
            byteOutput = new ByteArrayOutputStream();
            output = new ObjectOutputStream(byteOutput);

            output.writeObject(eagle);

            byteInput = new ByteArrayInputStream(byteOutput.toByteArray());
            input = new ObjectInputStream(byteInput);

            Eagle cloneEagle = (Eagle) input.readObject();


            System.out.println(eagle);
            System.out.println(cloneEagle);

        } catch (IOException | ClassNotFoundException e) {
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
