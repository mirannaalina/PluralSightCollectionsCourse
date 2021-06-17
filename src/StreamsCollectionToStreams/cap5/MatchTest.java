package StreamsCollectionToStreams.cap5;

import StreamsCollectionToStreams.cap1.Person;

import java.util.ArrayList;
import java.util.List;

public class MatchTest {

    //terminal operations -return a boolean


    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        //....


        boolean b = people.stream().anyMatch(person -> person.getAge() > 20);

        System.out.println(b);

        boolean b1 = people.stream().anyMatch(person -> person.getAge() > 20);

        System.out.println(b1);

        boolean b2 = people.stream().noneMatch(person -> person.getAge() > 20);

        System.out.println(b2);


    }

}
