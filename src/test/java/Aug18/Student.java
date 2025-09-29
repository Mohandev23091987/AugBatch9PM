package Aug18;

public class Student {

    String name;
    String rollNumber;

    Student(){
        System.out.println("this default constructor");
    }
    Student(String name){
        this.name=name;
        System.out.println("this is one parameter contructor"+name);
    }

    Student(String name, int rollnumber){
        this(name);
        System.out.println("name:"+name + "rollnumber:"+rollnumber);
    }

    void print(){
        System.out.println("printing student name");
    }

    void display(){
        this.print();
        System.out.println( "name of the student "+ name);
    }

    void display2( Student obj){

        System.out.println(obj.name);
    }

    void display3(){
        display2(this);
    }

    public static void main(String[] args) {
        Student studentObj = new Student("Mohan",123);

      studentObj.display3();

}



}
