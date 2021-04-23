package proffesional_homework3.task2;

import java.util.*;

public class Family {
    String lastname;

    public Family(String lastname) {
        this.lastname = lastname;
    }

    public Family() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family)) return false;
        Family family = (Family) o;
        return Objects.equals(lastname, family.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastname);
    }

    @Override
    public String toString() {
        return lastname;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Family ivanov = new Family("Иванов"); // создаем объекты Family
        Family petrov = new Family("Петров");
        Family sidorov = new Family("Сидоров");

        Map<String, Family> familyMap = new HashMap<>(); // заносим их ссылки в map<value>

        familyMap.put("Москва", ivanov);
        familyMap.put("Омск", petrov);
        familyMap.put("Новосибирск", sidorov);

        for (Map.Entry<String, Family> pair : familyMap.entrySet()) {
            System.out.println(pair.getKey() + " = " + pair.getValue());
        }

        System.out.println("================================");

        String city = sc.nextLine();

        System.out.println("Введите название города ");


        Family family = new Family();
        System.out.print("\nПроживающая семья в запрашиваемом городе = ");
        System.out.println(family.families(familyMap, city));
    }

    // метод возвращающий value запрашиваемого key
    Family families(Map<String, Family> map, String city) {
        return map.get(new String(city));
    }
}
