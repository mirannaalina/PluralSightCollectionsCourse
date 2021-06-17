package StreamsCollectionToStreams.cap2;

import StreamsCollectionToStreams.cap1.Person;

import java.util.function.Supplier;

public class SupplierTest {

    //no parameters

    Supplier<Person> personSupplier = () -> new Person();
    Supplier<Person> personSupplier1 = Person::new;

}
