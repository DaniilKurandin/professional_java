package professional_homework8.task3;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        String red = (char) 27 + "[31m";
        String white = (char) 27 + "[39m";

        try {
            A a = new A();
            Class<?> cl = a.getClass();
            Annotation[] annotations = cl.getAnnotations();

            System.out.println(cl.getName() + red + "\nAnnotations:");
            for (Annotation annotation : annotations) {
                System.out.println(white + "\t" + annotation);
            }
            System.out.println("====================================");
            Method[] classMethods = cl.getDeclaredMethods();
            System.out.println(red + "Method annotations:" + white);
            for (Method method : classMethods) {
                Annotation[] methodAnnotations = method.getAnnotations();
                if (methodAnnotations.length > 0) {
                    System.out.println("\t" + method.getName() + "():");
                }
                for (Annotation annotation : methodAnnotations) {
                    System.out.println("\t" + annotation);
                }
            }
            System.out.println("====================================");
            Field[] fields = cl.getDeclaredFields();
            System.out.println(red + "Field annotations:" + white);
            for (Field field : fields) {
                Annotation[] fieldsAnnotation = field.getAnnotations();
                if (fieldsAnnotation.length > 0) {
                    System.out.println("\t" + field.getName() + "():");
                }
                for (Annotation annotation : fieldsAnnotation) {
                    System.out.println("\t" + annotation);
                }
            }
            System.out.println("====================================");
            Constructor<?>[] constructors = cl.getConstructors();
            System.out.println(red + "Constructor annotations:" + white);
            for (Constructor<?> constructor : constructors) {
                Annotation[] constructorAnnotations = constructor.getAnnotations();
                if (constructorAnnotations.length > 0) {
                    System.out.println("\t" + constructor.getName() + "():");
                }
                for (Annotation annotation : constructorAnnotations) {
                    System.out.println("\t" + annotation);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
