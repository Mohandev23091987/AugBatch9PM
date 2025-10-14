package Oct12_StringPrograms;

public class RemoveSpecialCharacters {

    public static void main(String[] args) {

        String str = "Moh(*(*)(*()an1213^%&%&^%^&%^&%^&#@@!@#";

        // character a-z A-Z
        //number 0-9

        //remove special characters
        System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));

        //remove special character

        //only character
        System.out.println(str.replaceAll("[^a-zA-Z]",""));

        String str2 = "This& is@ Mohan";
        System.out.println(str2.replaceAll("[^a-zA-Z\\s]",""));

        String str3 = "I am an indain";
        System.out.println(str3.replaceAll("\\s",""));
String str4 = "I                    am      an   idian  staying at Bengaluru";
        System.out.println(str4.replaceAll("\\s+"," "));
    }








}
