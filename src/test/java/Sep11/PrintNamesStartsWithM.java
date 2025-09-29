package Sep11;

import java.util.Arrays;
import java.util.List;

public class PrintNamesStartsWithM {


    public static void main(String[] args) {

        List<String> names = Arrays.asList("Mohan","Mani","Ravi","Pushpa",null, "");

        names.stream().filter(n->n.startsWith("M")).forEach(System.out::println);

    }


}
