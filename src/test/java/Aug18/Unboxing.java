package Aug18;

import java.util.Arrays;

public class Unboxing {


    public static void main(String[] args) {


        int a = 10;

        Integer b = a;  // autoboxing

        int x = b;  // unboxing

        System.out.println(x);


        int[] arr ={10,2,3,4,5,6}; //array

        long z =Arrays.stream(arr).count();

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //Arrays  java.util  //static methods
        // sort(arr)
        //Arrays.toString(arr)
        //Arrays.equals(
        //






    }
}

//collections
