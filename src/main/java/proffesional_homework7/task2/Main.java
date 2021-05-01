package proffesional_homework7.task2;

import java.lang.reflect.Member;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String red = (char) 27 + "[31m";
        String white = (char) 27 + "[39m";
        String blue = (char) 27 + "[34m";

        while (true) {
            System.out.println("Choose Class: ");
            System.out.println("\t1 - String");
            System.out.println("\t2 - Integer");
            System.out.println("\t3 - Short");
            System.out.println("\t4 - Byte");
            System.out.println("\t5 - Long");
            System.out.println("\t6 - Double");
            System.out.println("\t7 - Float");
            String choose = sc.nextLine();
            switch (choose) {
                case "1": {
                    System.out.println(args[0]);
                    try {
                        Class<?> cl = Class.forName(args[0]);
                        System.out.println(cl);
                        System.out.println(blue + "==========================================");
                        System.out.println(red + "Fields: " + white);
                        print(cl.getFields());
                        System.out.println(blue + "==========================================");
                        System.out.println(red + "Constructors: " + white);
                        print(cl.getConstructors());
                        System.out.println(blue + "==========================================");
                        System.out.println(red + "Methods: " + white);
                        print(cl.getMethods());
                    } catch (ClassNotFoundException e) {
                        System.out.println("Unknown Class: " + args[0]);
                    }
                    break;
                } case "2": {
                    System.out.println(args[1]);
                    try {
                        Class<?> cl = Class.forName(args[1]);
                        System.out.println(cl);
                        System.out.println(blue + "==========================================");
                        System.out.println(red + "Fields: " + white);
                        print(cl.getFields());
                        System.out.println(blue + "==========================================");
                        System.out.println(red + "Constructors: " + white);
                        print(cl.getConstructors());
                        System.out.println(blue + "==========================================");
                        System.out.println(red + "Methods: " + white);
                        print(cl.getMethods());
                    } catch (ClassNotFoundException e) {
                        System.out.println("Unknown Class: " + args[1]);
                    }
                    break;
                } case "3": {
                    System.out.println(args[2]);
                    try {
                        Class<?> cl = Class.forName(args[2]);
                        System.out.println(cl);
                        System.out.println(blue + "==========================================");
                        System.out.println(red + "Fields: " + white);
                        print(cl.getFields());
                        System.out.println(blue + "==========================================");
                        System.out.println(red + "Constructors: " + white);
                        print(cl.getConstructors());
                        System.out.println(blue + "==========================================");
                        System.out.println(red + "Methods: " + white);
                        print(cl.getMethods());
                    } catch (ClassNotFoundException e) {
                        System.out.println("Unknown Class: " + args[2]);
                    }
                    break;
                } case "4": {
                    System.out.println(args[3]);
                    try {
                        Class<?> cl = Class.forName(args[3]);
                        System.out.println(cl);
                        System.out.println(blue + "==========================================");
                        System.out.println(red + "Fields: " + white);
                        print(cl.getFields());
                        System.out.println(blue + "==========================================");
                        System.out.println(red + "Constructors: " + white);
                        print(cl.getConstructors());
                        System.out.println(blue + "==========================================");
                        System.out.println(red + "Methods: " + white);
                        print(cl.getMethods());
                    } catch (ClassNotFoundException e) {
                        System.out.println("Unknown Class: " + args[3]);
                    }
                    break;
                } case "5": {
                    System.out.println(args[4]);
                    try {
                        Class<?> cl = Class.forName(args[4]);
                        System.out.println(cl);
                        System.out.println(blue + "==========================================");
                        System.out.println(red + "Fields: " + white);
                        print(cl.getFields());
                        System.out.println(blue + "==========================================");
                        System.out.println(red + "Constructors: " + white);
                        print(cl.getConstructors());
                        System.out.println(blue + "==========================================");
                        System.out.println(red + "Methods: " + white);
                        print(cl.getMethods());
                    } catch (ClassNotFoundException e) {
                        System.out.println("Unknown Class: " + args[4]);
                    }
                    break;
                } case "6": {
                    System.out.println(args[5]);
                    try {
                        Class<?> cl = Class.forName(args[5]);
                        System.out.println(cl);
                        System.out.println(blue + "==========================================");
                        System.out.println(red + "Fields: " + white);
                        print(cl.getFields());
                        System.out.println(blue + "==========================================");
                        System.out.println(red + "Constructors: " + white);
                        print(cl.getConstructors());
                        System.out.println(blue + "==========================================");
                        System.out.println(red + "Methods: " + white);
                        print(cl.getMethods());
                    } catch (ClassNotFoundException e) {
                        System.out.println("Unknown Class: " + args[5]);
                    }
                    break;
                } case "7": {
                    System.out.println(args[6]);
                    try {
                        Class<?> cl = Class.forName(args[6]);
                        System.out.println(cl);
                        System.out.println(blue + "==========================================");
                        System.out.println(red + "Fields: " + white);
                        print(cl.getFields());
                        System.out.println(blue + "==========================================");
                        System.out.println(red + "Constructors: " + white);
                        print(cl.getConstructors());
                        System.out.println(blue + "==========================================");
                        System.out.println(red + "Methods: " + white);
                        print(cl.getMethods());
                    } catch (ClassNotFoundException e) {
                        System.out.println("Unknown Class: " + args[6]);
                    }
                    break;
                }
                default: {
                    System.out.println("Unknown Class, repeat");
                    sc.hasNextLine();
                    continue;
                }
            }
            break;
        }
    }

    private static void print(Member[] mem) {
        for (int i = 0; i < mem.length; i++) {
            if (mem[i].getDeclaringClass() == Object.class) {
                continue;
            }
            System.out.print("\t");
            System.out.println(mem[i].toString());
        }
    }
}
