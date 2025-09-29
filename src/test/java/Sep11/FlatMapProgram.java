package Sep11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapProgram {

    public static void main(String[] args) {

        List<List<String>> listOfLists = Arrays.asList(

                Arrays.asList("A","A") ,
                Arrays.asList("C","C") ,
                Arrays.asList("X","F")
                );

        //listOfLists.stream()  =>   ("Z","B"),("C","E"),("X","F")
        // flatmap => {Z,B,C,E,X,F}

        List<String> allStrings = listOfLists.stream().flatMap(n->n.stream()).distinct().collect(Collectors.toList());

        System.out.println(allStrings);

    }



}
