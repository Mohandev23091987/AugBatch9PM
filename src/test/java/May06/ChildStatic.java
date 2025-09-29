package May06;

//static method hiding

public class ChildStatic extends ParentStatic  {

    int num=20;

    static void test(){
        System.out.println("this is from child");
    }

//    void getDetails(){
//        System.out.println("getDetails is from child class ");
//    }

    public static void main(String[] args) {
        ParentStatic parentObj = new ChildStatic();
        parentObj.test();
        System.out.println(parentObj.num);

        ChildStatic obj =new ChildStatic();
        obj.test();
        System.out.println(obj.num);
    }




}
