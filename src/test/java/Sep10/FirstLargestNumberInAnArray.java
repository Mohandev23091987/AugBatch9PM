package Sep10;

public class FirstLargestNumberInAnArray {

    public static void main(String[] args) {


        int[] arr = { 11,100,10,8,100,9,2,50,50};

        int max = arr[0];

        for(int i=1; i<arr.length;i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }

        System.out.println(max);



        int first = arr[0];//11
        int second= arr[0];

        // int[] arr = { 11,10,8,100,9,2,50};
        //Second largest
        for(int number : arr){

            if(number > first){
                second = first;
                first = number;
            } else if(number > second && number != first){
                second = number;
            }

        }

        System.out.println(second);






    }
}
