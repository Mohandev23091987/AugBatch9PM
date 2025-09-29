package May06;

public class ClasswithDifferentMethods {


    void sum(int a, int b){
        System.out.println(a+b);
    }
    void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }

    void sub(float a, float b, float c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        ClasswithDifferentMethods obj = new ClasswithDifferentMethods();

    }
}
