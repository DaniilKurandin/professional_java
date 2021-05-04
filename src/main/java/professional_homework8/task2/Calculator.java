package professional_homework8.task2;

public class Calculator {

    @Math(n1 = 5, n2 = 10)
    int add(int n1, int n2) {
        return n1 + n2;
    }

    @Math(n1 = 5, n2 = 10)
    int sub(int n1, int n2) {
        return n1 - n2;

    }

    @Math(n1 = 5, n2 = 10)
    int mul(int n1, int n2) {
        return n1 * n2;
    }

    @Math(n1 = 5, n2 = 10)
    int div(int n1, int n2) {
        if (n2 == 0) {
            System.err.println("Division by 0");
        }

        return n1 / n2;
    }
}
