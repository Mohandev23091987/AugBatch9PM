package Sep10;

import java.util.Arrays;

public class SortArrayBubbleSort {

    public static void main(String[] args) {


        int[] arr = { 11,10,8,9,2,40}; // {10,8,9,2,11,50}

        for(int i=0; i<arr.length-1;i++){  // pass

            for( int j=0; j<arr.length-i-1;j++){  // entire array iteration

                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

            if(i==1){
                System.out.println("First largest:"+arr[arr.length-3]);
            }

        }


//        System.out.println(Arrays.toString(arr));
//
//        System.out.println(arr[arr.length-1]);



    }
}
