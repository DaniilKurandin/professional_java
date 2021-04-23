package proffesional_homework3.task2_dop_realise;

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
        return lastname.equals(family.lastname);
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
        List<Family> list1 = Arrays.asList(new Family("Лист1"), new Family("Лист1"), new Family("Лист1"));
        List<Family> list2 = Arrays.asList(new Family("Лист2"), new Family("Лист2"), new Family("Лист2"));
        List<Family> list3 = Arrays.asList(new Family("Лист3"), new Family("Лист3"), new Family("Лист3"));
        List<Family> list4 = Arrays.asList(new Family("Лист4"), new Family("Лист4"), new Family("Лист4"));

        Map<String, List<Family>> familyMap = new HashMap<>(); // заносим их ссылки в map<value>

        familyMap.put("Москва", list1);
        familyMap.put("Омск", list2);
        familyMap.put("Новосибирск", list3);
        familyMap.put("Казань", list4);

        Family family = new Family();

        family.families(familyMap, "Москва");

        for (Map.Entry<String,List<Family>> pair : familyMap.entrySet()) {
            System.out.println(pair.getKey() + " = " + pair.getValue());
        }

        System.out.println("================================");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите название города ");

        String city = sc.nextLine();



        System.out.print("\nПроживающая(ие) семья(и) в запрашиваемом городе = ");
        System.out.println(family.families(familyMap, city));
    }

    List<Family> families(Map<String, List<Family>> map, String city) {
        return map.get(new String(city));
    }
}
