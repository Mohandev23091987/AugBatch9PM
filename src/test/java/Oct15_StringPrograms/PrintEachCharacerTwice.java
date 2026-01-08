package Oct15_StringPrograms;

public class PrintEachCharacerTwice {

    public static void main(String[] args) {

        String str = "Hello";

        StringBuilder result = new StringBuilder();

        for(char ch : str.toCharArray()){

            if(ch=='l'){
                result.append(ch);
            }else{
                result.append(ch).append(ch);
            }


        }

        System.out.println(result);





    }
}
