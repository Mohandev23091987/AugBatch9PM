package August05_Inheritance.Part2;

class M {
    void display() {
        System.out.println("Display from M");
    }
}

class N extends M {
    void display() {
        System.out.println("Display from N");
    }

    public static void main(String[] args) {
        M obj = new N();
        obj.display();
    }
}
