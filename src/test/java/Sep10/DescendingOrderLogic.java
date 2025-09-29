package Sep10;

import java.util.Arrays;

public class DescendingOrderLogic {

    public static void main(String[] args) {


        int[] arr = { 11,10,8,9,2,50}; // {10,8,9,2,11,50}

        for(int i=0; i<arr.length-1;i++){  // pass

            for( int j=0; j<arr.length-i-1;j++){  // entire array iteration

                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }


        System.out.println(Arrays.toString(arr));




    }
}
