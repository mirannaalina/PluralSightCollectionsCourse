import java.util.Comparator;

public class ComparatorRefactorUsingLambda {

    public static void main(String[] args) {

        //Comparator

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(),o2.length());
            }
        };

        //becomes with lambda :


        //for body {} needs a return statement
        Comparator<String> comparator1 = (String o1, String o2) -> {
            return Integer.compare(o1.length(), o2.length());
        };

        Comparator<String> comparator2 = (String o1, String o2) ->
            Integer.compare(o1.length(), o2.length());


        String st1 = "String11111";
        String st2 = "String2111111";

        System.out.println(comparator.compare(st1,st2));
        System.out.println(comparator1.compare(st1,st2));



    }
}
