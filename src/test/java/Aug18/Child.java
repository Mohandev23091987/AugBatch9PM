package Aug18;


class Parent {

    String name = "Parent";
    void message(){
        System.out.println("Message from Parent");
    }

    Parent( String name){
        System.out.println("this is parent class constructor");
    }
}

public class Child extends Parent {

    Child(String name){
        super("");
        System.out.println("this is child class constructor");

    }


    String name = "Child";
    void message(){
        super.message();
        System.out.println("Message from Child");
    }

    void display(){
        System.out.println(super.name);
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        Child obj = new Child("Mohan");
        obj.message();
        System.out.println(obj.name);

    }
}
