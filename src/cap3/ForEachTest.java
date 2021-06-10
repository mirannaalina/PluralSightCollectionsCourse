package cap3;

import cap1.Comparator;
import cap1.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachTest {


    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Su", "Ae", 19));
        people.add(new Person("SS", "ee", 34));
        people.add(new Person("Tss", "saQ", 20));

        people.forEach(System.out::println);

        people.removeIf(person -> person.getAge() < 20);

        // people.sort(Comparator);


        Map<City, List<Person>> map = new HashMap<>();
        //map.put(new City("Deva"), new List<Person>);

        map.forEach((city, list) -> System.out.println(city + " " +list.size() + " people"));

        map.forEach((key, value) -> map.merge(key,value,
                (existingPeople, newPeople) -> {
            existingPeople.addAll(newPeople);
            return existingPeople;
                }));

    }
}
