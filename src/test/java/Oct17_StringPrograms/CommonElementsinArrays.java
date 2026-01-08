package Oct17_StringPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonElementsinArrays {

    public static void main(String[] args) {

        Integer[] arr1 = {1,2,3,4};
        Integer[] arr2 = {3,4,5,6};  //3,4
//
//        for(int i =0;i<arr1.length;i++){
//            for(int j=0; j<arr2.length;j++){
//
//                if(arr1[i]==arr2[j]) {
//                    System.out.println(arr1[i]);
//                    break;  // it will avoid duplicates
//                }
//            }
//
//        }


        System.out.println("===========================By suing hashset");


        HashSet<Integer>  set1 = new HashSet<>(Arrays.asList(arr1));
        HashSet<Integer>  set2 = new HashSet<>(Arrays.asList(arr2));

        set1.retainAll(set2); // keep only common elements

        System.out.println("common elements are"+set1);





    }

}
