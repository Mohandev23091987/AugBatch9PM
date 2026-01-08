package Oct17_StringPrograms;

public class AscendingOrDescending {

    public static void main(String[] args) {

        //int[] arr = {-20,1,3,7,11};

        //int[] arr = {40,30,20,10};

        int[] arr = {1,2,3,4};

        boolean isAscending=true;
        boolean isDescending=true;  //false

        for(int i=0;i<arr.length-1;i++){

            if(arr[i]>arr[i+1]) isAscending= false;  // 2 >  3
            if(arr[i]<arr[i+1]) isDescending= false;  // 2 < 3
        }

        if(isAscending)
            System.out.println("array is ascending");
        else if(isDescending)
            System.out.println("array is descending");
        else
            System.out.println("array is not in ascending and also not in desceding");





    }
}
