package StreamsCollectionToStreams.cap5;

import StreamsCollectionToStreams.cap1.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsTest {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        //streams not hold any data

        Stream<Person> p = Stream.<Person>builder().build();

        //empty stream

        Stream.empty();

        //a singleton Stream
        // --one element

        Stream.of("one");

        //stream with several elements

        Stream.of("one","two","three");

        //constant Stream

        Stream.generate(() -> "one");

        // growing stream

        //Stream.iterate("+", s -> s_+ "+");

        //random Stream

        ThreadLocalRandom.current().ints();

        //Stream on the letters of a String

        IntStream stream = "hello".chars();

       // System.out.println(stream);

        // first build

        Stream<String> str = Stream.<String>builder().build();

        stream.forEach(System.out::println);





    }
}
