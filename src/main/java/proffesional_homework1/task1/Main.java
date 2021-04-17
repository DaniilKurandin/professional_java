package proffesional_homework1.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car[] cars = {new Car("Lexus", 3000, 210, "Black"),
                new Car("BMW", 3000, 210, "Green"),
                new Car("Porsche", 7000, 190, "White"),
                new Car("Subaru", 3088, 250, "Yellow")};

        Arrays.sort(cars);

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
