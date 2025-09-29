package AUg29;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CustomClassComparable {


    public static void main(String[] args) {

        ArrayList<EmployeeDetails> employeesList = new ArrayList<>();
        employeesList.add(new EmployeeDetails("Abhay",109));
        employeesList.add(new EmployeeDetails("Ram",208));
        employeesList.add(new EmployeeDetails("Abhay",301));
        employeesList.add(new EmployeeDetails("Nihan",307));
        employeesList.add(new EmployeeDetails("Dev",15));


        Collections.sort(employeesList);

        System.out.println(employeesList);


        System.out.println("with comparator");
        Collections.sort(employeesList,(o1, o2) -> o1.id - o2.id);
        System.out.println(employeesList);



        System.out.println("with comparator name sort by descending");
        Collections.sort(employeesList,(name1, name2) -> name2.name.compareTo(name1.name));
        System.out.println(employeesList);


        System.out.println("with comparator soring with last digit");
        Collections.sort(employeesList,(o1, o2) -> o1.id%10 - o2.id%10);
        System.out.println(employeesList);


//by defaulat methods in comparator



        System.out.println("by id using default methods");
        employeesList.sort(Comparator.comparingInt(EmployeeDetails::getId));
        System.out.println(employeesList);

        System.out.println("by id using default methods byusing collections");
        Collections.sort(employeesList,Comparator.comparing(EmployeeDetails::getName).thenComparing(EmployeeDetails::getId));
        System.out.println(employeesList);




    }





}



class EmployeeDetails implements Comparable<EmployeeDetails> {

    String name;
    int id;


    public EmployeeDetails(String name, int id) {
        this.name = name;
        this.id = id;
    }


    @Override //descending
    public int compareTo(EmployeeDetails o) {
        return this.name.compareTo(o.name) ;
    }

    @Override
    public String toString(){
        return id + " -" + name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

























