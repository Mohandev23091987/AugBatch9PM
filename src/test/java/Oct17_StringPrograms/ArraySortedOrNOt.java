package Oct17_StringPrograms;

public class ArraySortedOrNOt {

    public static void main(String[] args) {

        int[] arr = {-20,1,3,7,11};

        boolean isSorted=true;

        for(int i=0; i<arr.length-1;i++){

            if(arr[i] >arr[i+1]){
                isSorted = false;
                break;
            }


        }

        if(isSorted)
            System.out.println("array is sorted");
        else
            System.out.println("array is not sorted in ascending order");







    }



}
