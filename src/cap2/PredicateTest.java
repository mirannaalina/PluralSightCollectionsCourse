package cap2;

import cap1.Person;

import java.util.function.Predicate;

public class PredicateTest {

    Predicate<Person> ageGT20 = person -> person.getAge() > 20;

}
