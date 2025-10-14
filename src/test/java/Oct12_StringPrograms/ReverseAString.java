package Oct12_StringPrograms;

public class ReverseAString {

    public static void main(String[] args) {

        String str = "mohan";
String rev = "";//nahom
        for(int i=str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }

        System.out.println(rev);


        System.out.println(new StringBuilder(str).reverse().toString());


        char[] characterArray = str.toCharArray();

        for(int j=characterArray.length-1;j>=0;j--){
            System.out.print(characterArray[j]);
        }



    }

}
