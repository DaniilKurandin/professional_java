package professional_homework8.dop_task;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Sum m = new Sum();
        Class<?> cl = Sum.class;

        try {
            Method method = cl.getDeclaredMethod("mathSum", int.class, int.class);
            MyAnno myAnno = method.getAnnotation(MyAnno.class);
            m.mathSum(myAnno.num1(), myAnno.num2());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
