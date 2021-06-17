package StreamsCollectionToStreams.cap2;

import StreamsCollectionToStreams.cap1.Person;

import java.util.function.Predicate;

public class PredicateTest {

    Predicate<Person> ageGT20 = person -> person.getAge() > 20;

}
