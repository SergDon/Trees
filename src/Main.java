import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Илон", "Маск", 50));
        people.add(new Person("Александр", "Дюма", 47));
        people.add(new Person("Тарас", "Шевченко", 59));
        people.add(new Person("Михаил", "Горбачев", 82));
        people.add(new Person("Лев", "Лещенко", 73));
        people.add(new Person("Ален", "Прост", 30));
        people.add(new Person("Михаил", "Жванецкий", 80));
        people.add(new Person("Алексей", "Гордиенко", 14));
        people.add(new Person("Захар", "Казаков", 15));

        Predicate<Person> predicate = (person -> person.getAge() < 18);

        people.removeIf(predicate);

        System.out.println();
        System.out.println(people);
    }
}