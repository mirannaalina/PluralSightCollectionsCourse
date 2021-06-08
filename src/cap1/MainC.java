package cap1;

import java.util.function.Function;

public class MainC {

    public static void main(String[] args) {

        Comparator<Person> cmpAge = (p1,p2)->p2.getAge() - p2.getAge();
        Comparator<Person> cmpFirstName = (p1,p2) -> p1.getFirstName().compareTo(p2.firstName);
        Comparator<Person> cmpLastName = (p1,p2) -> p1.getLastName().compareTo(p2.lastName);


        Function<Person, Integer> f1 = p -> p.getAge();
        Function<Person, String> f2 = p -> p.getLastName();
        Function<Person, String> f3 = p -> p.getFirstName();

        Comparator<Person> cmpPersonAge = Comparator.comparing(Person::getAge);
        Comparator<Person> cmpPersonLastName = Comparator.comparing(Person::getLastName);


//        Comparator<Person> cmp = cmpPersonAge.comparing(Person::getLastName)
//                .thenComparing(Person::getFirstName);



    }
}
