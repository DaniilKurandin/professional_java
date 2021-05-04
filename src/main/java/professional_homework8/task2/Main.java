package professional_homework8.task2;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Class<?> cl = Calculator.class;
        try {
            Method methodAdd = cl.getDeclaredMethod("add", int.class, int.class);
            Method methodSub = cl.getDeclaredMethod("sub", int.class, int.class);
            Method methodMul = cl.getDeclaredMethod("mul", int.class, int.class);
            Method methodDiv = cl.getDeclaredMethod("div", int.class, int.class);

            Math math1 = methodAdd.getAnnotation(Math.class);
            Math math2 = methodSub.getAnnotation(Math.class);
            Math math3 = methodMul.getAnnotation(Math.class);
            Math math4 = methodDiv.getAnnotation(Math.class);

            System.out.println(calculator.add(math1.n1(), math1.n2()));
            System.out.println(calculator.sub(math2.n1(), math1.n2()));
            System.out.println(calculator.mul(math3.n1(), math1.n2()));
            System.out.println(calculator.div(math4.n1(), math1.n2()));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
