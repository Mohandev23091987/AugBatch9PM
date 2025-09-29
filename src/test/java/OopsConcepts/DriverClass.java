package OopsConcepts;

public class DriverClass {

    public static void main(String[] args) {

        LooselyEncapsulatedClass obj = new LooselyEncapsulatedClass();

        int number = obj.a;

        int number2 =obj.getNumber();

        TIghtlyEncapsulatedClass obj2 = new TIghtlyEncapsulatedClass();

        //System.out.println(obj2.getNumber());






    }
}
