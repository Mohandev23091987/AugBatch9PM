package AUg29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.*;

public class ClassLambda {


    public static void main(String[] args) {
        //ananymous class concept

        Car toyotaCar = new Car(){

            @Override
            public void model(String model) {
                System.out.println("This is "+model);
            }
        };
        toyotaCar.model("totyoto");



        //ananymous function // lambda
        Car volvoCar =  model -> System.out.println("this is "+model);
        volvoCar.model("Volvo");


        Car innovaCar = mod -> {
            System.out.println("This is " + mod);
            System.out.println("this is lamba expression");
        };
        innovaCar.model("innova");



        Car2 obj = ( mod, sp) -> System.out.println("model is "+mod +" and speed is "+sp);
        obj.carModel("tata",100);


        Car3 car3Obj =model-> 100;
        System.out.println(car3Obj.carModel("xyz"));




        List<Integer> numbers = new ArrayList(Arrays.asList(56,11,23,99,100));

        Collections.sort(numbers, (a,b)-> a%10 - b%10);

        for ( Integer i: numbers){
            System.out.println(i);
        }


        Comparator<Integer> ascendinglogic = ( num1,  num2) -> (num1-num2);

//        Collections.sort(numbers,(a,b)->a-b);

        //   int compare(T o1, T o2);  negative won't swap postivie swap


//        System.out.println("sort with direct collection name");
//        numbers.sort((a,b)-> a%10 - b%10);

        Collections.sort(numbers,ascendinglogic.reversed());
        System.out.println(numbers);

        Comparator<Integer> comparatorObj2 = Comparator.comparingInt((Integer i) ->i);








                // int compare(T o1, T o2);








    }
}


@FunctionalInterface
interface Car{
    public void model(String model);
}


@FunctionalInterface
interface Car2{
    public void carModel(String model,int speed);
}

//  Car2 obj = (mod,speed)-> { sout (model+":"+Speed)};
//obj.carModel("model",250);


@FunctionalInterface
interface Car3{
    public int carModel(String model);
}

@FunctionalInterface
interface ElementAction{
    void perform(WebElement ele);
}



