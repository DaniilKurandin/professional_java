package proffesional_homework7.dop_task;

import java.lang.reflect.Constructor;

public class Cat {
    public static void main(String[] args) {
        String red = (char) 27 + "[31m";
        String white = (char) 27 + "[39m";
        Class<?> cl = Animal.class;
        try {
            Constructor<?> ctr1 = cl.getConstructor(String.class, int.class, int.class);
            Constructor<?> ctr2 = cl.getConstructor();

            Animal animal1 = (Animal) ctr2.newInstance();
            System.out.println(red + "Old field values: " + white);
            System.out.println("\tName - " + animal1.getName());
            System.out.println("\tAge - " + animal1.getAge());
            System.out.println("\tTail - " + animal1.getTail());

            Animal animal2 = (Animal) ctr1.newInstance("Marina", 32, 12);
            System.out.println(red + "New field values: " + white);
            System.out.println("\tName - " + animal2.getName());
            System.out.println("\tAge - " + animal2.getAge());
            System.out.println("\tTail - " + animal2.getTail());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
