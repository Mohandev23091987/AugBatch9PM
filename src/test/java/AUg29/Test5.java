package AUg29;

interface A {
    default void m()
{
    System.out.println("A.m");
}

}
interface B {
    default void m(){
        System.out.println("B.m");
    }
}


class D implements A,B{
    public void m() {
        A.super.m();
        B.super.m();
        System.out.println("D.m"); }
}



public class Test5 {
    public static void main(String[] args) {
        new D().m(); }
}

