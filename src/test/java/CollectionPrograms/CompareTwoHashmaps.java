package CollectionPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class CompareTwoHashmaps {

    public static void main(String[] args) {

        Map<String,Integer> map1 = new HashMap<>();

        map1.put("Mohan",456);
        map1.put("Pushpa",345);
        map1.put("Dev",246);
        map1.put("Nani",789);

        Map<String,Integer> map2 = new HashMap<>();

        map2.put("Mohan",123);
        map2.put("Pushpa",345);
        map2.put("Dev",246);
        map2.put("Nani",789);


        // comparing entire things

        System.out.println("Full map comparision:"+ map1.equals(map2));


        // compare only keys
        System.out.println("Keys comparision:"+ map1.keySet().equals(map2.keySet()));


        //compare values
        System.out.println("Values comparision:"+ new HashSet<>(map1.values()).equals(new HashSet<>(map2.values())));
        System.out.println(map1.values());
        System.out.println(map2.values());








    }
}
