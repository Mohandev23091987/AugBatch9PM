package August05_Inheritance.Part2;

class SuperClass {
    static void print() {
        System.out.println("Static from SuperClass");
    }
}

class SubClass extends SuperClass {
    static void print() {
        System.out.println("Static from SubClass");
    }

    public static void main(String[] args) {
        SuperClass obj = new SubClass();
        obj.print();
    }
}



