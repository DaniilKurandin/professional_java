package professional_homework9.task3;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Car implements Externalizable {
    String name;
    static int price;
    static int age;

    public Car(){}

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getPrice() {
        return price;
    }

    public static void setPrice(int price) {
        Car.price = price;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Car.age = age;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeInt(price);
        out.writeInt(age);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        price = in.readInt();
        age = in.readInt();
    }
}
