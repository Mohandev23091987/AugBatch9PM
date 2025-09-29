package Aug21;

import java.util.LinkedList;

public class LinkedArrayListProgram {

    public static void main(String[] args) {


        LinkedList<Integer> linkedlist = new LinkedList<>();

        linkedlist.add(2);
        linkedlist.add(20);
        linkedlist.add(30);
        linkedlist.add(40);
        linkedlist.add(30);

        System.out.println(linkedlist);

        linkedlist.addFirst(-40);
        linkedlist.addLast(100);

        System.out.println(linkedlist);

        //access the elements
        System.out.println(linkedlist.get(0)+" other way :"+linkedlist.getFirst());


//        linkedlist.descendingIterator();
//        System.out.println(linkedlist.descendingIterator());
//
        //linkedlist.indexOf(30);  //3

        //linkedlist.lastIndexOf(30);


        linkedlist.removeLastOccurrence(30);

        System.out.println(linkedlist);

        //










    }
}
