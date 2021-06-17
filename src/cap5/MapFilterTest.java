package cap5;

import cap1.Person;

import java.util.ArrayList;
import java.util.List;

public class MapFilterTest {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();


        people.stream()         //Stream<Person>
                .map(person -> person.getAge())  //Stream<Integer>
                .filter(age -> age>20)  //Stream<Integer>
                .forEach(System.out::println);     //


        //a stream does not hold any data

        //prints out the age of the people older than 20



        people.stream()         //Stream<Person>
                .map(person -> person.getAge())  //Stream<Integer>
                .peek(System.out::println)  //for debug purpose  //peek is an intermediate operation
                .filter(age -> age>20)  //Stream<Integer>
                .forEach(System.out::println);  //foreach is a terminal operation

        people.stream()
                .skip(2) //will skip the firt 2 elements of the stream
                .limit(3) //limit just 3 elements to be in the stream
                .filter(person -> person.getAge() >20)
                .forEach(System.out::println);

    }
}
