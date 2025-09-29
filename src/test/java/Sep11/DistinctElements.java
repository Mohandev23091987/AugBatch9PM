package Sep11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DistinctElements {


    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(100,90,80,3,3,3,4,5,6,7,7,9);

       // numbers.stream().distinct().forEach(System.out::println);

       // numbers.stream().limit(3).forEach(System.out::println);

       // numbers.stream().skip(3).forEach(System.out::println);

       // numbers.stream().sorted().forEach(System.out::println);

        numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);


    }
}
