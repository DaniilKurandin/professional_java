package professional_homework7.dop_task;

public class Animal {
    public String name = "Lara";
    private int age = 2;
    protected int tail = 1;

    public Animal(String name, int age, int tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
    }

    public Animal() {

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
