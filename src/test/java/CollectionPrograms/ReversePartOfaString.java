package CollectionPrograms;

public class ReversePartOfaString {

    public static void main(String[] args) {


        String input = "MohanDev";

        String firstPart = input.substring(0,3);  // Moh
        String middlePart = input.substring(3,input.length()-1);  // anDe
        String lastPart = input.substring(input.length()-1);  //v


       // reversing middle part

        String reverseMiddle = new StringBuilder(middlePart).reverse().toString();

        // combine all three parts

        String result = firstPart + reverseMiddle + lastPart;

        System.out.println(result);




    }
}
