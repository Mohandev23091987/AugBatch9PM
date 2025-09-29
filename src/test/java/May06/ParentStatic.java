package May06;

public class ParentStatic {

    int num =10;
    final int b =20;


    static void test(){
        System.out.println("this is from parent");
    }

    final void getDetails(){
        System.out.println("getDetails is from child class ");
    }
}


//public
//protected
//default
//private
