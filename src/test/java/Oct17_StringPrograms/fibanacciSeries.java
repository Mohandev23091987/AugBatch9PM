package Oct17_StringPrograms;

public class fibanacciSeries {

    public static void main(String[] args) {
        int f1 = 0;
        int f2 = 1;
        System.out.print( f1 + " "+ f2);   //  0 1 1

        for ( int i =2 ; i < 20; i++){
            int f3 = f1+ f2;  //f3 = 2
            System.out.print(" "+f3);  // 0 1 1 2  3
            f1 = f2;  // 1
            f2 = f3;  //  2

        }

// 0 1 1

    }
}
