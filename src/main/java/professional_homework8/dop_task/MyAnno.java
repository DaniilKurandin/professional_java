package professional_homework8.dop_task;

import java.lang.annotation.*;


//@Target(ElementType.METHOD)
//@Retention(RetentionPolicy.RUNTIME) не получается задать аннотации, ругается
@Repeatable(MyAnno2.class)
public @interface MyAnno {
    int num1() default 0;
    int num2() default 0;
}
