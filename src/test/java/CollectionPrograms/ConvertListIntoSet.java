package CollectionPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertListIntoSet {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();

        list.add(123);
        list.add(1);
        list.add(4);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(123);
        list.add(123);

        System.out.println("List values are :"+list);

        //convert list into set

        Set<Integer> set = new HashSet<>(list);

        System.out.println("Set values are: "+set);









    }



}
