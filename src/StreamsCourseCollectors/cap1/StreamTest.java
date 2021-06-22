package StreamsCourseCollectors.cap1;

import StreamsCollectionToStreams.cap1.Person;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class StreamTest {

    public static void main(String[] args) {

        //read a file into a stream


        Path path = Paths.get("/people.txt");

        try (Stream<String> lines = Files.lines(path)) {

            Spliterator<String> lineSpliterator = lines.spliterator();
            //Spliterator<Person> peopleSploterator = new PersonSpliterator();

            //Stream<Person> people= StreamSupport.stream(peopleSploterator,false);

            //people.forEach(System.out::println);
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
