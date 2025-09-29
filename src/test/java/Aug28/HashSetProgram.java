package Aug28;

import java.util.*;

public class HashSetProgram {


    public static void main(String[] args) {
        int[] arr11 = {1, 2, 2, 3, 3, 3, 4, 4, 5, 6, 6, 7};
        Set<Integer> treeSetUnique = new TreeSet<>();
        Set<Integer> treeSetDuplicate = new TreeSet<>();

        for (int j : arr11) {
            if (!treeSetUnique.add(j)) {
                treeSetDuplicate.add(j);
            }
        }

        System.out.println("TreeSet Unique Numbers:- " + treeSetUnique);
        System.out.println("TreeSet Duplicate Numbers:- " + treeSetDuplicate);



    }
}

































