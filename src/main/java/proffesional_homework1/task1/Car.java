package proffesional_homework1.task1;

import java.util.Comparator;

public class Car implements Comparable<Car> {
    String model;
    int price;
    int speed;
    String color;

    public Car(String model, int price, int speed, String color) {
        this.model = model;
        this.price = price;
        this.speed = speed;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return model + " " + price + " " + speed + " " + color;
    }

    @Override
    public int compareTo(Car obj) { // Сортировка speed -> price -> model -> color
        return Comparator.comparing(Car::getSpeed).thenComparing(Car::getPrice).thenComparing(Car::getModel).thenComparing(Car::getColor).compare(this, obj);
    }
}
