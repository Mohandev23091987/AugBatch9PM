package Sep11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers {


    public static void main(String[] args) {


      List<Integer> numbers = Arrays.asList(3,5,7,8,11,20);


//        List<Integer> evennumbers =numbers.stream().filter(n-> n%2 ==0).collect(Collectors.toList());
//
//        System.out.println(evennumbers);


        //numbers.stream().filter(n-> n%2 ==0).forEach(n-> System.out.println(n));
        numbers.stream().filter(n-> n%2 ==0).forEach(System.out::println);






    }



}
