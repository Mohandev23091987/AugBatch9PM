package Oct17_StringPrograms;

public class swapTwoNumber {


    public static void main(String[] args) {
        int a =10;
        int b = 20;

        System.out.println("before swapping a = "+a + "  b="+b);

        int temp = a;
        a=b;
        b=temp;


        System.out.println("AFTER swapping a = "+a + "  b="+b);


        int x = 50 ;
        int y = 90;
        System.out.println("before swapping x = "+x + "  y="+y);

        x = x+y;   // x= 140
        y = x-y;  //y = 140 -90  = 50
        x = x-y;    // x = 90

        System.out.println("after swapping x = "+x + "  y="+y);



    }







}
