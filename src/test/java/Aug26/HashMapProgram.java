package Aug26;

import java.util.*;

public class HashMapProgram {

    public static void main(String[] args) {


        HashMap<String,Integer> fruitsHashMap = new HashMap<>();

        fruitsHashMap.put("Orange",10);
        fruitsHashMap.put("Apple",5);
        fruitsHashMap.put("Avacado",15);
        fruitsHashMap.put(null,10);
        fruitsHashMap.put("Mango",10);
        fruitsHashMap.put("Banana",null);

        //get the value
       int quantity= fruitsHashMap.get("Orange"); //10

        System.out.println("Orange quantity is "+quantity);
        //System.out.println(fruitsHashMap.get("Papaya"));

        Set<String> fruitNames = fruitsHashMap.keySet();
        System.out.println(fruitNames);
        System.out.println(fruitsHashMap.values());

        //  orange : 10
        //entry <orange,10>
        //entrySet()
        //keySet()
        //values()


        //Set<Map.Entry<String,Integer>> entries =fruitsHashMap.entrySet();


        //  orange : 10
        for( Map.Entry<String,Integer> fruitentry: fruitsHashMap.entrySet()){
            System.out.println(fruitentry.getKey() +":"+fruitentry.getValue());
        }

        Set<Map.Entry<String,Integer>> entries =fruitsHashMap.entrySet();

        for(Map.Entry<String,Integer> entry:entries){
            System.out.println(entry.getKey() + ":"+entry.getValue());
        }


        //  orange : 10


        //using the keyset concept
        System.out.println("using the keyset concept");
        for( String fruit :fruitsHashMap.keySet()){
            System.out.println(fruit + ":"+fruitsHashMap.get(fruit));
        }

        //getvalue
        //getkey //entry
        System.out.println(fruitsHashMap.containsKey("Orange"));
        System.out.println(fruitsHashMap.containsValue(10));
        System.out.println(fruitsHashMap.keySet());
        System.out.println(fruitsHashMap.values());


        //directly printing
        //keyset
        //entryset


       Iterator<Map.Entry<String,Integer>> itr = fruitsHashMap.entrySet().iterator();

       while(itr.hasNext()){
           Map.Entry<String,Integer> entry = itr.next();
           System.out.println(entry.getKey()+":"+entry.getValue());
       }


       //word = mohaaannnnn

        //m-1
        //0-1
        //a-3
        //n-5

        HashMap<Character,Integer> charOccurrances = new HashMap<>();

        String name ="mohhaaannnnn";   // 'm','o','h','a'

        for( Character charKey:name.toCharArray()){
            charOccurrances.put(charKey,charOccurrances.getOrDefault(charKey,0)+1);
        }

        System.out.println(charOccurrances);

        for(Character char1:  charOccurrances.keySet()){

            if(charOccurrances.get(char1)>1)
                System.out.println( char1 +":"+charOccurrances.get(char1));
        }



        HashMap<Character,Integer> firstDuplicateHashMap = new HashMap<>();
        System.out.println("first duplicate character by using hashmap");
        for( Character charKey:name.toCharArray()){
            if(firstDuplicateHashMap.containsKey(charKey)){
                System.out.println(charKey);
                break;
            } else{
                firstDuplicateHashMap.put(charKey,1);
            }
        }


        System.out.println("first duplicate character by using hashset");
        HashSet<Character> firstDuplicateChar = new HashSet<>();
        for(Character charKey:name.toCharArray()){
            if(!firstDuplicateChar.add(charKey)){
                System.out.println(charKey);
                break;
            }
        }

































    }



}
