package proffesional_homework5.task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "Когда человек сознательно или интуитивно выбирает себе в жизни какую-то цель, жизненную задачу, он невольно дает себе оценку." +
                " По тому, ради чего человек живет, можно судить и о его самооценке - низкой или высокой.";

        String[] arr = str.split("\\s");

        String[] arr1 = Arrays.copyOfRange(arr, 0, arr.length / 2);
        String[] arr2 = Arrays.copyOfRange(arr, arr.length / 2, arr.length);

        StringBuilder result1 = new StringBuilder();
        StringBuilder result2 = new StringBuilder();

        for (int i = 0; i < arr1.length; i++) {
            result1.append(arr1[i]).append(" ");
        }
        String newString1 = result1.toString();

        System.out.println(newString1);

        for (int i = 0; i < arr2.length; i++) {
            result2.append(arr2[i]).append(" ");
        }

        String newString2 = result2.toString();

        System.out.println(newString2);

        System.out.println(arr1.length);
        System.out.println(arr2.length);


    }
}
