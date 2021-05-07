package professional_homework10.task2;

import java.io.*;

public class Bird implements Serializable, Externalizable {
    static String name;
    final int age = 1;
    transient int weight;

    public Bird() {
    }

    public Bird(String name, int weight) {
        this.weight = weight;
        this.name = name;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Bird.name = name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "Bird{" + "name = " + name +
                ", age = " + age +
                ", weight = " + weight +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeInt(weight);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        weight = in.readInt();
    }
}
