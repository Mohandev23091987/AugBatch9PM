package Aug18;

class A {
A get() {
 return this;
}
}

class B extends A {
 B get() {
 return this;
}

void display(){
    System.out.println("this is display from chid class");
}

 public static void main(String[] args) {
B b = new B();
  b.get().display();
 System.out.println("Covariant return type works!");
 }
}

//C extends D

