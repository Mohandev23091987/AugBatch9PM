package JavaProgramsArray.Sep1;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayProgram1 {

    public static void main(String[] args) {

        int[] arr = {11,20,33,40,59,9};
        // ==================================***********************===================
        //first
        System.out.println(arr[0]);
        //last
        System.out.println(arr[arr.length-1]);

        // ==================================***********************===================
        //print everything - normal for loop
        System.out.println("//print everything - normal for loop ");

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        // ==================================***********************===================
        //for each
        System.out.println("//print everything - normal for loop ");

        for(int number:arr){
            System.out.println(number);
        }

        // ==================================***********************===================
        System.out.println("numbers greater than 30");
        // which are greater than 30
        for(int number:arr){

            if(number>30)
                System.out.println(number);

        }

        // ==================================***********************===================
        System.out.println("printing in reverse order");
        // print array in reverse order
        for(int i = arr.length-1; i >=0;i--){
            System.out.println(arr[i]);
        }

        // ==================================***********************===================
        //even    n%2==0 => even else odd
        //= assigning the nnumber // assignment opertor
        System.out.println("printing even numbers and odd numbers ");

        for(int number:arr){

            if(number%2==0)
                System.out.println("this is even number :"+number);
            else
                System.out.println("this is odd number :"+number);

        }

        // ==================================***********************===================

         int sum =0; //31
        // find the sum of all numbers in an array

        for(int number:arr){
            sum = sum + number; // sum+=number
        }
        System.out.println("Sum of the numbers in an array: "+sum);

        // ==================================***********************===================
        // find the sum of all numbers in an array except 40

        int sumWithOut40 =0;
        for(int number:arr){

            if(number==40)
                continue;  //skip below lines
            //if(number!=40)
            sumWithOut40 = sumWithOut40 + number; // sum+=number
        }

        System.out.println("sumWithOut40:"+sumWithOut40);

        // ==================================***********************===================
        //printing using streams
        Arrays.stream(arr).forEach(i -> System.out.println(i));

        // ==================================***********************===================
        //while and for
        System.out.println("printing using for loop");
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }

        // ==================================***********************===================
        System.out.println("printing using while loop");
        int i=0;
        while(i<arr.length){
            if(arr[i]%2==0)
            System.out.println("this is even"+arr[i]);
            else
                System.out.println("this is odd"+arr[i]);
            i++;
        }

        // ==================================***********************===================
        //do while loop
        System.out.println("printing using Do while loop");
        int j=0;

        do{
            if(arr[j]%2==0)
                System.out.println("this is even"+arr[j]);
            else
                System.out.println("this is odd"+arr[j]);
            j++;
        }while(j<arr.length);

        // ==================================***********************===================
        // find the largest and smallest in an array
        //what is input
        //what is expected output

        int largest = arr[0]; //33
        int smallest = arr[0]; //11

        for( int number :arr ){
            if( number > largest )
                largest = number;
            else if( number < smallest)
                smallest =number;
        }

//        for( int k=1 ; i < arr.length; i++){
//
//            if( arr[k] > largest )
//                largest = arr[k];
//            else if( arr[k] < smallest)
//                smallest =arr[k];
//
//        }
        // largest number : and smallest number :
        System.out.println("largest:"+ largest+ " smallest:"+smallest);

        // ==================================***********************===================
        //sort

        Arrays.sort(arr);
        System.out.println("this is printing by using Arrays utility class");
        System.out.println("samllest:"+ arr[0]+ " largest:"+arr[arr.length-1]);

        // ==================================***********************===================
        //missing number

        int[] arr2 = {1,2,3,4,6,7,8}; // 5

        // 1 3  = 4
        //1 2 3 = 6
        // 6- 4 = 2 is missing number
        int n =8;
        int sumOfFirst8Numbers =0;
        for(int m=1; m <=8;m++){
            sumOfFirst8Numbers = sumOfFirst8Numbers + m;
        }

        int sumOfNumbers = 0;
        for( int number: arr2){
            sumOfNumbers = number + sumOfNumbers;
        }
        System.out.println(sumOfFirst8Numbers-sumOfNumbers);
        // ==================================***********************===================
        //another logic
        System.out.println(((n*(n+1))/2)-sumOfNumbers);

        // ==================================***********************===================
        //using set

        int[] arr3 = {1,2,3,4,5,7,8};
        Set<Integer> missingNumber = new HashSet<>();
        for(int ele: arr3){
            missingNumber.add(ele);
        }

        System.out.println("Missing numbers");
        for(int x= 1 ; x<=8; x++){
            if(!(missingNumber.contains(x)))
                System.out.println(x);
        }




















    }
}
