package Oct12_StringPrograms;

public class NumberPalindrome {

    public static void main(String[] args) {

        int num= 121;
        int original = num;//121
        int rev =0;

        //  num%10 = 1
        //12%10  => 2
        //1%10 => 1

        //get the last digit
        //multiply rev with 10 and add the last digit
       // num/10

        while(num>0){
            int digit = num%10;
            rev =rev*10 + digit;   // 120 + 1
            num =num/10;
        }

        if(original==rev)
        System.out.println(rev + "is a palindrom number");
        else
            System.out.println(rev + "is not a palindrom number");






    }




}
