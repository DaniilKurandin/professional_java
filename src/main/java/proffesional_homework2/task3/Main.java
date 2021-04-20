package proffesional_homework2.task3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number;
        while (true) {
            if (sc.hasNextInt()) {
                number = sc.nextInt();
                break;
            } else {
                System.out.println("Введите целое число: ");
                sc.nextLine();
            }
        }
        System.out.println(main.getIntegerList(number));
    }

    List<Integer> getIntegerList(int number) {
        List<Integer> integerList = new LinkedList<>();

        for (int i = 0; i < number; i++) {
            int a = (int) (Math.random() * 100 + 1);
            integerList.add(a);
        }
        System.out.println("===============================================");
        System.out.println("min = " + getMinimum(integerList));
        System.out.print("array = ");
        return integerList;
    }


    int getMinimum(List<Integer> list) {
        Collections.sort(list);
        return list.get(0);
    }
}
