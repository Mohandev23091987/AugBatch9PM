package Oct17_StringPrograms;

import java.util.Arrays;

public class mergeTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,5};
        int[] arr2 ={6,9,10};

        int[] result = new int[arr1.length+arr2.length];

        for(int i=0;i<arr1.length;i++){
            result[i]=arr1[i];
        }

        for( int j=0; j<arr2.length;j++){
            result[arr1.length+j]=arr2[j];
        }


        System.out.println("result arrays is "+ Arrays.toString(result));







    }


}
