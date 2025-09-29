package August05_Inheritance;

class Animal {
    final void sound() {
        System.out.println("Animal makes sound");
    }

}

class Dog extends Animal {

    public static void main(String[] args) {
        new Dog().sound();
    }

}
