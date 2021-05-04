package professional_homework8.task2;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Math {
    int n1() default 0;
    int n2() default 0;
}
