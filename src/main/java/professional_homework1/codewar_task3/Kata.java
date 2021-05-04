package professional_homework1.codewar_task3;

import java.util.*;

public class Kata {

    public static Double[] sortItOut(Double[] array) {

        List<Double> odd = new ArrayList<>(); // список для нечетных
        List<Double> even = new ArrayList<>(); // список для четных

        for (Double item : array) {
            if ((int) Math.floor(item) % 2 == 0) {
                even.add(item);
            } else {
                odd.add(item);
            }
        }

        Collections.sort(odd); // сортируем
        Collections.sort(even);
        Collections.reverse(even); // разворачиваем список
        odd.addAll(even); // соединяем списки

        Double newArray[] = odd.toArray(new Double[0]); // преобразуем список в массив
        return newArray;
    }

    public static void main(String[] args) {
        Double[] arr = {26d,243d,52d,2d,432414d,1d,11d,46d,32d};

        System.out.println(Arrays.toString(Kata.sortItOut(arr)));
    }
}
