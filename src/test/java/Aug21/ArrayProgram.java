package Aug21;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayProgram {

    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();



        // int[] a = new int[10];
        //int a;

        //add
        list.add("Apple");
        list.add("Orange");
        list.add("Mango");

        //insertion by using index
        list.add(2,"Grapes");

        System.out.println(list);

       boolean found = list.contains("Apple");

        //access element
        System.out.println("accessing element "+list.get(3));

        //update element
        list.set(3,"Pineapple");
        System.out.println("After update"+list);

        //remove the element
        list.remove("Pineapple");
        System.out.println("After removing pineapple"+list);

        // size of an arraylist
        System.out.println("Number of elements in an arraylist"+list.size());

        //one way
        System.out.println(list);

//        //2
//        for(String fruit:list){
//            System.out.println(fruit);
//        }
//
//        //3
//          Iterator<String> itr =   list.iterator();
//
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }

        //4 listIterator

        System.out.println("printing forward direction");
        ListIterator<String> itr1 =   list.listIterator();
        while(itr1.hasNext()){
           System.out.println(itr1.next());
            System.out.println(itr1.previous());

           // //apple orange grapes
       }

        System.out.println("printing back direction");
        ListIterator<String> itr2 =   list.listIterator();
        while(itr2.hasPrevious()){
            System.out.println(itr2.previous());
        }

//        //5
//        list.forEach(fruit -> System.out.println(fruit));
//
//        //6
//        list.stream().forEach(System.out::println);
//
//        //7
//        list.forEach(System.out::println);



        // 1   6  8  9 10 7 6 2 1 1 1
        //

        // single
        //streams



    }

}









