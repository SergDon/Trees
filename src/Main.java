import java.util.ArrayList;
import java.util.StringTokenizer;
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
        people.add(new Person("Михаил", "Жванецкий", 80));

        List<Person> personList = new ArrayList<>();
        personList.sort((o1, o2) -> {
            StringTokenizer stringTokenizer = new StringTokenizer(o1.getSurname());
            StringTokenizer stringTokenizer1 = new StringTokenizer(o2.getSurname());

            int maxAmountWords = 5;
            if (stringTokenizer.countTokens() >= maxAmountWords || stringTokenizer1.countTokens() >= maxAmountWords) {
                if (stringTokenizer.countTokens() < stringTokenizer1.countTokens()) {
                    return -1;
                } else if (stringTokenizer.countTokens() > stringTokenizer1.countTokens()) {
                    return 1;
                }
            }
            return Integer.compare(o1.getAge(), o2.getAge());
        });
        System.out.println(people);
    }
}