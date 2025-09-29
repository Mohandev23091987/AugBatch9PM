package Sep11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MapToFIndSquares {


    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3,4,5,6,7);  // 6,7  => 216,

        List<Integer> squares = numbers.stream().map(n-> n*n).toList();


        System.out.println(squares);


        List<Integer> cubesGreaterThan5 = numbers.stream().filter(x->x>5).map(n->n*n*n).collect(Collectors.toList());

        System.out.println(cubesGreaterThan5);




    }
}
