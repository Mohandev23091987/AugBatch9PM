package CollectionPrograms;

import java.util.HashSet;
import java.util.Set;

public class ComparingTwoSets {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(11);
        set.add(12);
        set.add(13);
        set.add(14);
        set.add(15);
        set.add(20);

        Set<Integer> set2 = new HashSet<>();

        set2.add(10);
        set2.add(11);
        set2.add(12);
        set2.add(13);
        set2.add(14);
        set2.add(15);
        set2.add(16);


        //compare two sets

        if(set.equals(set2)){

            System.out.println("Both sets are equal");

        } else{
            System.out.println("Both the sets are not equal");
        }








    }
}
