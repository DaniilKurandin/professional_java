package professional_homework8.dop_task;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Sum m = new Sum();
        Class<?> cl = Sum.class;

        try {
            Method method = cl.getDeclaredMethod("mathSum", int.class, int.class);
            MyAnno2 myAnno2 = method.getAnnotation(MyAnno2.class);
            MyAnno[] myAnnos = myAnno2.value();
            m.mathSum(myAnnos[0].num1(), myAnnos[1].num2());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
