package August05_Inheritance.Part2;

class A {
    static {
        System.out.println("Static Block A");
    }

    A() {
        System.out.println("Constructor A");
    }

    void testMethod(){
        System.out.println("test method");
    }

    static void staticMethodFromA(){
        System.out.println("message from parent");
    }
}

class B extends A {
    static {
        System.out.println("Static Block B");
    }

    B() {
        System.out.println("Constructor B");
    }

    void testMethod2(){
        System.out.println("test method");
    }

    static void staticMethodFromA(){
        System.out.println("message from child");
    }

    public static void main(String[] args) {

        B obj = new B();  //downcasting
        staticMethodFromA();


    }
}
