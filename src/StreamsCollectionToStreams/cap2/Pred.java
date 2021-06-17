package StreamsCollectionToStreams.cap2;

import java.util.function.Predicate;

public class Pred {

    //predicate

    Predicate<String> p1 = new Predicate<String>() {
        @Override
        public boolean test(String s) {
            return s.length() < 20;
        }
    };

    //predicate with lambda expression

    Predicate<String> p = (String s) -> s.length() < 20;


}
