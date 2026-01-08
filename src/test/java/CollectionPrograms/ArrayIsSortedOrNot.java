package CollectionPrograms;

public class ArrayIsSortedOrNot {

    public static void main(String[] args) {

        int[] arr = {1,2,3,7,9,2};

        boolean isSorted = true;

        for(int i=0; i< arr.length-1;i++){

            if(arr[i+1]<arr[i]){
                isSorted = false;
            }

        }


        if(isSorted){
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }





    }
}
