package August05_Inheritance.Part2;

class Base {
    static {
        System.out.println("Static Block - Base");
    }

    {
        System.out.println("Instance Block - Base");
    }

    Base() {
        System.out.println("Constructor - Base");
    }
}

class Derived extends Base {
    static {
        System.out.println("Static Block - Derived");
    }

    {
        System.out.println("Instance Block - Derived");
    }

    Derived() {
        System.out.println("Constructor - Derived");
    }

    public static void main(String[] args) {
        new Derived();
    }
}
