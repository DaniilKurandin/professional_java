package professional_homework2.task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>(10, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        int count = 0;
        while (count < 10) {
            double random = Math.random() * 100;

            if (queue.add((int) random)) {
                count++;
            }
        }

        for (int i = 0; i < 10; i++) {
            Integer in = queue.poll();
            System.out.print(in + " ");
        }


    }
}
