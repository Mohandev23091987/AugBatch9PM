package August05_Inheritance;

class SuperClass {
    int num = 10;
}

class SubClass extends SuperClass {
    int num = 20;

    public static void main(String[] args) {
        SuperClass obj = new SubClass();
        System.out.println(obj.num);
    }
}

