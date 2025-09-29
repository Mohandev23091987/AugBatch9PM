package packageB;

import August05_Inheritance.Parent123;
import packageA.ParentClassFromA;

public class ChildClassFromPackageB extends ParentClassFromA {

    public void sub(int a, int b){
        System.out.println(a-b);
    }

    public static void main(String[] args) {
        August05_Inheritance.Child123 obj = new August05_Inheritance.Child123();

        obj.sum(2,3);

        obj.sub(3,4);

        Parent123 obj2 = new August05_Inheritance.Child123();






    }

}
