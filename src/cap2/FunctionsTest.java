package cap2;

import cap1.Person;

import java.util.function.Function;

public class FunctionsTest {

    Function<Person, Integer> ageMapper = person -> person.getAge();
    Function<Person, Integer> ageMapper1 = Person::getAge;

}
