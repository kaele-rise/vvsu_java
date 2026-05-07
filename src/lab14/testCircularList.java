package lab14;

import java.util.ArrayList;
import java.util.List;

public class testCircularList {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("b");
        words.add("a");
        words.add("c");
        words.add("d");

        CircularList<String> stringContainer = new CircularList<>(words);
        Iterator<String> strIt = stringContainer.getIterator();

        System.out.println("обход вперёд");
        for (int i = 0; i < 7; i++) {
            System.out.print(strIt.next() + " ");
        }
        System.out.println("\nобход назад");
        for (int i = 0; i < 5; i++) {
            System.out.print(strIt.previous() + " ");
        }

        List<Person> people = new ArrayList<>();
        people.add(new Person("Анна", 25));
        people.add(new Person("Борис", 30));
        people.add(new Person("Вика", 20));
        people.add(new Person("Глеб", 35));

        CircularList<Person> personContainer = new CircularList<>(people);
        Iterator<Person> persIt = personContainer.getIterator();

        System.out.println("\nобход вперёд");
        for (int i = 0; i < 6; i++) {
            System.out.println(persIt.next());
        }
        System.out.println("\nобход назад");
        for (int i = 0; i < 4; i++) {
            System.out.println(persIt.previous());
        }
    }
}
