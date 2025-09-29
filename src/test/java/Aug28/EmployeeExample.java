package Aug28;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeExample {


    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        Employee emp1 = new Employee(129,"mohan");
        Employee emp2 = new Employee(124,"dev");
        Employee emp3 = new Employee(100,"nani");

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);



        Comparator<Employee> comparatorObj = (obj1,  obj2) ->(obj1.id%10) - (obj2.id%10);
        Comparator<Employee> DescendingLogic = (obj1,  obj2) -> obj2.id -obj1.id;

        Collections.sort(employees);

        //Collections.sort(employees, (obj1,obj2)->obj1.name.compareTo(obj2.name));

        Collections.sort(employees,comparatorObj);
        System.out.println(employees);
        Collections.sort(employees,DescendingLogic);
        System.out.println(employees);

        employees.sort(Comparator.comparingInt((Employee obj) -> obj.id));




        //interfaces
        //   2 6
        //retrun 2-6 = -4
        // negative don't swap
        //positive  swap

    }


}
