package StreamsCourseCollectors.cap1;

import StreamsCollectionToStreams.cap1.Person;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class PersonSpliterator implements Spliterator<Person> {

    Spliterator<String> lineSpliterator;

    public PersonSpliterator(Spliterator<String> lineSpliterator) {
        this.lineSpliterator = lineSpliterator;
    }

    @Override
    public void forEachRemaining(Consumer<? super Person> action) {

    }

    @Override
    public long getExactSizeIfKnown() {
        return 0;
    }

    @Override
    public boolean hasCharacteristics(int characteristics) {
        return false;
    }

    @Override
    public Comparator<? super Person> getComparator() {
        return null;
    }

    @Override
    public boolean tryAdvance(Consumer<? super Person> action) {

        //this.lineSpliterator.tryAdvance(line -> this.name=line)
        return false;
    }

    @Override
    public Spliterator<Person> trySplit() {
        return null;
    }

    @Override
    public long estimateSize() {
        return lineSpliterator.estimateSize() / 3;
    }

    @Override
    public int characteristics() {
        return lineSpliterator.characteristics();
    }
}
