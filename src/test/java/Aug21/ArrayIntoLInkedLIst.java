package Aug21;

import java.util.*;

public class ArrayIntoLInkedLIst {
    public static void main(String[] args) {
        String[] arrr = {"mohan1","mohan3","mohan4","Vinod", "Vinod"};

        String[] arrr2 = {"mohan5","mohan6","mohan7","Vinod"};

        Set<String> list1 = new HashSet<>(Arrays.asList(arrr));

        Set<String> list2 = new HashSet<>(Arrays.asList(arrr2));

        list1.retainAll(list2);

        System.out.println(list1);

        LinkedList<Integer> list3= new LinkedList<Integer>();
        list3.add(30);



    }


}
