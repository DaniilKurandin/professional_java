package professional_homework7.task3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    private int field1 = 1;
    public String field2 = "FIELD";
    protected long field3 = 13L;

    public Main(int field1, String field2, long field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    public Main() {

    }

    public Main(int field1, long field3) {
        this.field1 = field1;
        this.field3 = field3;
    }

    public int getField1() {
        return field1;
    }

    public void setField1(int field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public long getField3() {
        return field3;
    }

    public void setField3(long field3) {
        this.field3 = field3;
    }

    public static void main(String[] args) {
        String red = (char) 27 + "[31m";
        String white = (char) 27 + "[39m";
        String blue = (char) 27 + "[34m";
        String yellow = (char) 27 + "[33m";
        Class<?> cl = Main.class;
        Constructor<?>[] constructors = cl.getConstructors();

        System.out.println(yellow + "Constructors:");
        int i = 0;
        for (Constructor<?> ctr : constructors) {
            System.out.print(red + "\tConstructor " + ++i + ": " + white);
            Class<?>[] paramTypes = ctr.getParameterTypes();
            for (Class<?> paraType : paramTypes) {
                System.out.print(paraType.getName() + " ");
            }
            System.out.println();
        }

        System.out.println(blue + "======================================");

        System.out.println(yellow+ "All fields: ");

        Field[] fields;

        fields = cl.getDeclaredFields();

        for (Field field : fields) {
            Class<?> fieldType = field.getType();
            System.out.println(red + "\tName - " + white + field.getName());
            System.out.println(red + "\tType - " + white + field.getType());
        }
        try {
            Constructor<?> ctr = cl.getConstructor();
            Main main = (Main) ctr.newInstance();
            System.out.println(yellow + "Field values: ");
            System.out.println(red + "\tfield1 - " + white + main.getField1());
            System.out.println(red + "\tfield2 - " + white + main.getField2());
            System.out.println(red + "\tfield3 - " + white + main.getField3());
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(blue + "======================================");

        Method[] methods = cl.getMethods();
        for (Method method : methods) {
            System.out.println(yellow + "Name - " + white + method.getName());
            System.out.println(red + "\tType - " + white + method.getReturnType().getName());
            Class<?>[] paramTypes = method.getParameterTypes();
            System.out.print(red + "\tParameter types - " + white);
            for (Class<?> param : paramTypes) {
                System.out.print(" " + param.getName());
            }
            System.out.println();
        }

    }
}
