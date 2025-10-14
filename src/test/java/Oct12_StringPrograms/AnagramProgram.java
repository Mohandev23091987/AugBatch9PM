package Oct12_StringPrograms;

import java.util.Arrays;

public class AnagramProgram {

    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";


        //length
        if(str1.length() != str2.length()){
            System.out.println("Not Anagram check");
        } else {
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if(Arrays.equals(arr1,arr2)){
                System.out.println("Given strings are anagrams");
            }else{
                System.out.println("Given strings are not anagrams");
            }


        }



    }

}
