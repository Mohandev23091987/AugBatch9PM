package Oct15_StringPrograms;

public class OddEvenIndexCharactersString {


    public static void main(String[] args) {

        String str = "IamanIndian";
        StringBuilder evenIndexResult = new StringBuilder();
        StringBuilder oddIndexResult = new StringBuilder();

        for(int i=0;i<str.length();i++){

            if(i%2 ==0){
                evenIndexResult.append(str.charAt(i));
            }else {
                oddIndexResult.append(str.charAt(i));
            }


        }

        System.out.println("evenIndexResult: "+evenIndexResult);

        System.out.println("oddIndexResult: "+oddIndexResult);



    }

}
