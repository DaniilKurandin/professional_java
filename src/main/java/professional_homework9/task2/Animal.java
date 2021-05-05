package professional_homework9.task2;

import java.io.Serializable;

public class Animal implements Serializable {
    String name;
    int age;
    int tail;

    public Animal(){}

    public Animal(String name, int age, int tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", tail=" + tail +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }


}
