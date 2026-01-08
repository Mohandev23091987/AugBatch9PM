package Oct17_StringPrograms;

public class primeNumber {
    public static void main(String[] args) {

        int n = 10;
        boolean isPrime = true;

        for(int i =2;i<Math.sqrt(n);i++){

           if( n %i== 0){
               isPrime =false;
           }


        }

        if(isPrime)
            System.out.println("its a prime");
        else
            System.out.println("its not prime");






    }




}


