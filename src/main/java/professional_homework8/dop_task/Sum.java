package professional_homework8.dop_task;

public class Sum {

    @MyAnno(num1 = 10)
    @MyAnno(num2 = 15)
    public void mathSum(int num1, int num2){
        System.out.println(num1 + num2);
    }
}
