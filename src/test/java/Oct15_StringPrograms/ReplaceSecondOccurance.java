package Oct15_StringPrograms;

public class ReplaceSecondOccurance {

    public static void main(String[] args) {

        String str = "BOOKEEPER";//E   => #     =====>BOOKE#PER

        String result = "";

        //find occurance of 'E'
        int firstOccurance = str.indexOf('E');  //4

        int secondOccu = str.indexOf('E',firstOccurance+1);

        result = result + str.substring(0,secondOccu)+"#"+str.substring(secondOccu+1);

        System.out.println(result);


    }
}
