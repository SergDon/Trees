import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Илон", "Маск", 50));
        people.add(new Person("Александр", "Дюма", 47));
        people.add(new Person("Тарас", "Шевченко", 59));
        people.add(new Person("Михаил", "Горбачев", 82));
        people.add(new Person("Лев", "Лещенко", 73));
        people.add(new Person("Ален", "Прост", 30));

        Collections.sort(people, new ComparatorMaximumNumberOfWordsInASurname(10));
        System.out.println(people);
    }
}