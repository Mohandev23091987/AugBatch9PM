package Sep05;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class CharacterOccurances {


    public static void main(String[] args) {
        String str = "xzswisseettt";  //w

       //char[] allCharacters =  str.toCharArray();// {'s','w',

        LinkedHashMap<Character,Integer> characterCount = new LinkedHashMap<>();

        for(char character :str.toCharArray()){
            characterCount.put(character,characterCount.getOrDefault(character,0)+1);
        }

        System.out.println("Character Occurances");
        System.out.println(characterCount);

        //Second duplicate character
        System.out.println("Second duplicate Character");
          int counter =0;
        for(Character ch  :characterCount.keySet()){
            if(characterCount.get(ch)>1){
                counter ++;
            }
            if(counter ==2){
                System.out.println( ch +":"+characterCount.get(ch));
                break;
            }
        }
    }







}
