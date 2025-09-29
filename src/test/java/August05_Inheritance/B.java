package August05_Inheritance;

class A {
    void show() {
        System.out.println("Show from A");
    }
}

class B extends A {
    void show() {
        System.out.println("Show from B");
    }

    public static void main(String[] args) {
        A obj = new B();
        obj.show();
    }
}
