package Oct17_StringPrograms;

public class GivenNumberIsPowerOf2 {

    public static void main(String[] args) {


        int n =9;
        int orignalnum = n;

        boolean isPowerOfTwo = false;

        if(n>0){

           while(n%2==0) {
               n=n/2;
           }

           if(n==1){
               isPowerOfTwo=true;
           }
        }


        if(isPowerOfTwo){
            System.out.println(orignalnum+":is power of two");
        }





    }




}
