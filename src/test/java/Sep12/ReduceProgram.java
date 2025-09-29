package Sep12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ReduceProgram {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 7, 8, 11, 20);

        int sum = numbers.stream().filter(n -> n % 2 == 0)
                .reduce(0, (a,b)->(a+b));
        System.out.println("sum of even numbers" + sum);

        int sumofElements = numbers.stream().reduce(0, Integer::sum);
        System.out.println("sum of all numbers" + sumofElements);

        System.out.println(numbers.stream().count());

        int leastnumber = numbers.stream().min(Integer::compare).get();
        int largestNumber = numbers.stream().max(Integer::compare).get();

        System.out.println("largest: " + largestNumber);
        System.out.println("Smallest: " + leastnumber);

        // anyMatch, allMatch , noneMatch

        List<String> names = Arrays.asList("Mohan", "Pushpa", "Dev", "Nani");

        boolean anyMatch = names.stream().anyMatch(n -> n.startsWith("M"));
        boolean AllMatch = names.stream().allMatch(n -> n.length() > 4);
        boolean noneMatch = names.stream().noneMatch(n -> n.equals("Java"));


        System.out.println("anyMatch:" + anyMatch);
        System.out.println("AllMatch:" + AllMatch);
        System.out.println("noneMatch:" + noneMatch);

        String str = "mmmmmohan";


        Map<Character, Long> charactersCount =
                str.chars()
                        .mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        charactersCount.forEach((ch, count) -> System.out.println(ch + ":" + count));


        // pre test

        // Introduction

        //InSprint automation
        //n+1 sprint
        // backlog automation

        //framework

        // xpath or java programs

        // java
        //selenium
        //rest api
        // rest assured
        //maven
        //jenkins
        //git

        //scenario based
        //challanges you faced how rectified

        //AI
        //Docker
        //cloud

        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(2, 3),
                Arrays.asList(8, 6),
                Arrays.asList(10, 120),
                Arrays.asList(100, 9));

        //Optional<Integer> maxAmongAllNumbers = listOfLists.stream().flatMap(n -> n.stream()).max(Comparator.naturalOrder());
        //System.out.println(maxAmongAllNumbers);









    }


}
