package August05_Inheritance;

class Parent {
    Parent() {
        System.out.println("Parent Constructor");
    }

//    protected void privateMethodFromParent(){
//        System.out.println("privateMethodFromParent");
//    }

    //final methods
}

class Child extends Parent {

    Child() {

        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {
        Child c = new Child();
//        c.privateMethodFromParent();

    }
}


//  class loader => main memory => staticblock => 15th line
