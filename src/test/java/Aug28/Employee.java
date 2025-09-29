package Aug28;

import static java.lang.Long.compare;

public class Employee implements Comparable<Employee>{

        int id;
        String name;
        Employee(int id , String name){
            this.id=id;
            this.name=name;
        }

    @Override
    public int compareTo(Employee anotherObj) {
        //return compare(this.id, anotherObj.id);
        int x = this.id;
        int y = anotherObj.id;
        //return (x < y) ? -1 : ((x == y) ? 0 : 1);
        return y-x;
    }

    @Override
    public String toString(){
           return id + " "+ name;
    }

}
