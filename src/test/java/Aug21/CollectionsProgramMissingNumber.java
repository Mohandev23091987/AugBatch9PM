package Aug21;

import java.util.*;

public class CollectionsProgramMissingNumber {

    public static void main(String[] args) {

        Integer[] arr = {1,4,7,13};
        int n =arr[arr.length-1];

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));

        Set<Integer> set = new HashSet<>(Arrays.asList(arr));

        for(int i=1;i<=n;i++){
            if(!list.contains(i)){
                System.out.println("missing number is "+i);
            }
        }

        //get the sum

        int sumoffirstNnumber = (n*(n+1))/2;
        int sum=0;
        for(int i : arr){
            sum = sum+i;
        }

        System.out.println("missing number is "+(sumoffirstNnumber-sum));

        //Given String[] = {"1", "2", "3"} asked to convert to Integer and add them
        //how we can do this


        String[] arr5= {"1", "2", "3"};
      //  int result=Integer.parseInt(arr5[0])+Integer.parseInt(arr5[1])+Integer.parseInt(arr5[2]);

        int result2=0;

        for(String number: arr5){
            result2 = result2 + Integer.parseInt(number);
        }

        System.out.println(result2);






    }
}
