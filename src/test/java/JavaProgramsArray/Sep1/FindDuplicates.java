package JavaProgramsArray.Sep1;

import java.util.*;

public class FindDuplicates {

    public static void main(String[] args) {

        System.out.println("find duplicates without using any collection or predefined methods");

        int arr[] = {4,2,7,10,10,2,4,4,9,1,7,9};  // 7 4
         Arrays.sort(arr);
        for( int i=0; i<arr.length;i++){  // i = 1
            for(int j=i+1;j<arr.length;j++){   // j=2
                if(arr[i]==arr[j]){        // 2 ==7
                    System.out.println(arr[i]);
                    break;
                }
            }

        }
        System.out.println("========================================");


        System.out.println("find duplicates  using any hashset");
        Set<Integer> duplicates = new HashSet<>();
        for( int number : arr){
            if(duplicates.add(number) == false)
                System.out.println(number);
        }


        System.out.println("find duplicates using any HashMap");
        HashMap<Integer,Integer> DuplicateHashMap = new LinkedHashMap<>();
        for( int number : arr) {
            //DuplicateHashMap.put(number, DuplicateHashMap.getOrDefault(number, 0)+1);

            if(DuplicateHashMap.containsKey(number)) {
                DuplicateHashMap.put(number, DuplicateHashMap.get(number) + 1);
            }
            else
                DuplicateHashMap.put(number,1);
        }

        System.out.println("Printing duplicates using hashmap");
        for(int key :DuplicateHashMap.keySet()){
            if(DuplicateHashMap.get(key) >1){
                System.out.println(key);
            }
        }

        System.out.println("Printing unquie using hashmap");
        for(int key :DuplicateHashMap.keySet()){
            if(DuplicateHashMap.get(key) == 1){
                System.out.println(key);
            }
        }


        System.out.println("Printing numbers and their occurances using HashMap");
        for(int key :DuplicateHashMap.keySet()){
            System.out.println( "["+key +" - "+DuplicateHashMap.get(key)+"]");
        }


        System.out.println("Printing first duplicate using hashmap");
        for(int key :DuplicateHashMap.keySet()){
            if(DuplicateHashMap.get(key) > 1){   //2
                System.out.println(key);
                break;
            }
        }


        // {4,2,7,2,4,9,1,7};
        // <4,2>
        //  <2,2>
        // <7,2>
        // <9,1>
        // <1,1>


        System.out.println("Printing duplicates by sort");
        int[] arr2 =  {1,4,5,6,1,6,6};
        Arrays.sort(arr2);
        for( int i = 0 ; i< arr2.length-1;i++){
            if(arr2[i]  == arr2[i+1]){
                System.out.println(arr2[i]);
            }
        }


        //sort
        //rotating an array
        //movement of the array


        Integer arr3[] = {4,2,7,10,10,2,4,4,9,1,7,9};
        System.out.println("find second largest duplicate");
        Arrays.sort(arr3,Collections.reverseOrder());
        boolean[] visitedFlags = new boolean[arr.length];
        int counter = 0;
        for( int i=0; i<arr3.length;i++){
            if(visitedFlags[i]==true)
                continue;
            boolean isDuplicate = false;
            for(int j=i+1;j<arr.length;j++){   // j=2
                if(arr3[i]==arr3[j]){        // 2 ==7
                    isDuplicate= true;
                    visitedFlags[j]=true;
                }
            }

            if(isDuplicate==true){
               counter++;
            }
            if(counter==2){
                System.out.println(arr3[i]);
            }

        }





    }
}
