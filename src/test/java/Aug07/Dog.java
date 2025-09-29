package Aug07;

import com.google.gson.internal.bind.util.ISO8601Utils;

public class Dog extends Animal{

    @Override
void sound(){
    System.out.println("Dog barks");
}

void run(){
    System.out.println("dog runs");
}

void sum(int a, int b){

    System.out.println("Now I am adding two numbers");
    System.out.println("these values are salary and increment");
    super.sum(a,b);

}





}
