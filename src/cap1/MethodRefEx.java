package cap1;

import cap1.Person;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;

public class MethodRefEx {

    public static void main(String[] args) {

        Function<Person, Integer> f = person -> person.getAge();

        Function<Person, Integer> f1 = Person::getAge;

        BinaryOperator<Integer> sum = (i1,i2) -> i1 +i2;

        BinaryOperator<Integer> sum1 = (i1,i2) -> Integer.sum(i1,i2);

        BinaryOperator<Integer> sum2 = Integer::sum;

        Consumer<String> printer = s -> System.out.println(s);

        Consumer<String> printer1 = System.out::println;





    }
}
