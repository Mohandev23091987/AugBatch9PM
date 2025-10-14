package Oct12_StringPrograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ShrinkingOfAString {

    public static void main(String[] args) {
        //aabbbcc => a2b3c2

        String str = "aabbbcc";

        Map<Character,Integer> hashmap = new LinkedHashMap<>();

        for(char c : str.toCharArray()){
            hashmap.put(c, hashmap.getOrDefault(c,0)+1);
        }

        StringBuilder result = new StringBuilder();
        for( Character key :hashmap.keySet()){
            //System.out.print(key.toString()+hashmap.get(key));
            result.append(key).append(hashmap.get(key));
        }
        System.out.println(result);





    }


}
