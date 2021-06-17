package StreamsCollectionToStreams.cap2;

public class Main2 {


    public static void main(String[] args) {


        Predicate<String> p = s -> s.length() < 20;
        Predicate<String> p2 = s -> s.length() > 5;

       boolean b = p.test("Hello");

        System.out.println("Hello is shorter thatn 20 char" + b);

        Predicate<String> p3 = p.and(p2);




    }
}
