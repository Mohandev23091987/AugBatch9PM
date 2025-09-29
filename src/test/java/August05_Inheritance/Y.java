package August05_Inheritance;

class X {
    static void test() {
        System.out.println("Static method from X");
    }
}

class Y extends X {
    static void test() {
        System.out.println("Static method from Y");
    }

    public static void main(String[] args) {
        X obj = new Y();
        obj.test();
    }
}

