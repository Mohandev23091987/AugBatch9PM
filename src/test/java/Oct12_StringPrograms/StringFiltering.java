package Oct12_StringPrograms;

import java.util.Arrays;

public class StringFiltering {

    public static void main(String[] args) {

        String str = "3aBcA1bC2";

        StringBuilder lower = new StringBuilder();
        StringBuilder upper = new StringBuilder();
        StringBuilder digits = new StringBuilder();

        for(char c : str.toCharArray() ){

            if(Character.isLowerCase(c)){
                lower.append(c);
            } else if(Character.isUpperCase(c)){
                upper.append(c);
            }else if(Character.isDigit(c)){
                digits.append(c);
            }

        }

        char[] lowerArr = lower.toString().toCharArray();
        char[] upperArr = upper.toString().toCharArray();
        char[] digitsArr = digits.toString().toCharArray();

        Arrays.sort(lowerArr);
        Arrays.sort(upperArr);
        Arrays.sort(digitsArr);


        System.out.println(new String(lowerArr)+new String(upperArr)+new String(digitsArr));



    }
}
