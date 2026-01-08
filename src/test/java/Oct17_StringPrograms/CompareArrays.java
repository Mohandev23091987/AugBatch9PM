package Oct17_StringPrograms;

import java.util.Arrays;

public class CompareArrays {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {1,2,4,3};

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            System.out.println("arrays are equal");
        } else
        {
            System.out.println("arrays are not  equal");
        }


        boolean isEqual = true;

        if(arr1.length != arr2.length){
            isEqual = false;
        } else {
            for(int i =0 ; i< arr1.length; i++){

                if(arr1[i]!=arr2[i]){
                    isEqual = false;
                    break;
                }

            }
        }



        if(isEqual)
            System.out.println("arrays are equal");
        else
            System.out.println("arrays are not equal ");






    }




}
