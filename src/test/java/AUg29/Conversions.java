package AUg29;

import java.util.*;

public class Conversions {

    public static void main(String[] args) {

        Integer[] arr = {2,3,4,5,9};
        Arrays.sort(arr);
        System.out.println(arr);


        // with using collections
        //with using Arrays
        //with using for loop logic



        //sort
        //removing duplicate
        //unique
        //occurances
        //string



        List<Integer> numbers = new ArrayList<>(Arrays.asList(arr));
        System.out.println(numbers);
        Collections.sort(numbers);

        Employee[] arrayOfObj = {
                new Employee(123,234.3f,"MOhan"),
                new Employee(127,234.3f,"Ranjan"),
                new Employee(100,234.3f,"Ravi")
        };

        Comparator<Employee> ascendingOnId = ( o1,  o2)-> o1.id - o2.id;

        Arrays.sort(arrayOfObj,ascendingOnId);
        System.out.println(Arrays.toString(arrayOfObj));

        List<Employee> employees = new ArrayList<>(Arrays.asList(arrayOfObj));
       Collections.sort(employees, (s1,s2)->s1.name.compareTo(s2.name));

        System.out.println(employees);

        employees.sort(Comparator.comparing(Employee::getName));
        System.out.println(employees);

        Collections.sort(employees,Comparator.comparingInt(Employee::getId));
        System.out.println(employees);








    }
}

class Employee implements Comparable<Employee>{

    public Employee(int id, float sal, String name) {
        this.id = id;
        this.sal = sal;
        this.name = name;
    }

     int id;
     float sal;
     String name;


    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", sal=" + sal +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getSal() {
        return sal;
    }

    public void setSal(float sal) {
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
