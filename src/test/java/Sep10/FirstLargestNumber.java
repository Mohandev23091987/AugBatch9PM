package Sep10;

import java.util.Arrays;

public class FirstLargestNumber {

    public static void main(String[] args) {


        int[] arr = { 11,10,8,9,2,50};

        Arrays.sort(arr);

        System.out.println(arr[arr.length-2]);

    }
}
