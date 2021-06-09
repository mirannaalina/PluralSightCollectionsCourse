package cap2;

import java.util.function.Consumer;

public class ConsumerTest {

    Consumer<String> printer1 = s-> System.out.println(s);
    Consumer<String> printer = System.out::println;


}
