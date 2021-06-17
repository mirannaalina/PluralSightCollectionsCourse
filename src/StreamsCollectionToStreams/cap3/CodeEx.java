package StreamsCollectionToStreams.cap3;

import StreamsCollectionToStreams.cap1.Person;

import java.util.*;

public class CodeEx {

    public static void main(String[] args) {

        Person p1 = new Person("Alice","sal",21);
        Person p2 = new Person("salice","sal",23);
        Person p3 = new Person("ralice","sal",26);
        Person p4 = new Person("malice","sal",29);


        City newyork =new City("new york");
        City paris =new City("paris");
        City tokyo =new City("tokio");


        List<Person>  people = new ArrayList<>(Arrays.asList(p1,p2,p3,p4));

        people.forEach(System.out::println);

        people.removeIf(person -> person.getAge()<30);

        people.replaceAll(person -> new Person(person.getFirstName().toLowerCase(), person.getLastName().toUpperCase(),person.getAge()));

        //people.sort(Comparator.comparing(Person::getAge));

        people.forEach(System.out::println);


        Map<City,List<Person>> map = new HashMap<>();

        map.putIfAbsent(paris,new ArrayList<>());
        map.get(paris).add(p1);


        map.computeIfAbsent(newyork, city -> new ArrayList<>()).add(p2);
        map.computeIfAbsent(newyork, city -> new ArrayList<>()).add(p3);


        System.out.println("People from paris" + map.getOrDefault(paris,Collections.EMPTY_LIST));
        System.out.println("People from newyork" + map.getOrDefault(newyork,Collections.EMPTY_LIST));
        System.out.println("People from paris" + map.getOrDefault(paris,Collections.EMPTY_LIST));

        System.out.println("map 2");

        Map<City,List<Person>> map2 = new HashMap<>();

        map2.computeIfAbsent(paris, city -> new ArrayList<>()).add(p3);
        map2.computeIfAbsent(paris, city -> new ArrayList<>()).add(p4);


        //map.forEach();




    }
}
