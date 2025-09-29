package Aug07;

class X {
    static void test() {
        System.out.println("Static method from X");
    }

    protected  void sum(){
        System.out.println("sum in parent");
    }
}

class Y extends X {
    static void test() {
        System.out.println("Static method from Y");
    }

//      void sum(){
//        System.out.println("sum in child");
//    }

    public static void main(String[] args) {
        Y obj = new Y();
        Y.test();
        X.test();
    }

}
