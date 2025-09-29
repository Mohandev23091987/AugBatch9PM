package August05_Inheritance.Part2;

class P {
    {
        System.out.println("Instance Block P");
    }

    P() {
        System.out.println("Constructor P");
    }
}

class Q extends P {
    {
        System.out.println("Instance Block Q");
    }

    Q() {
        System.out.println("Constructor Q");
    }

    public static void main(String[] args) {
        new Q();
    }
}
