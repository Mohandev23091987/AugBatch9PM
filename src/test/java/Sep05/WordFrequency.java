package Sep05;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WordFrequency {

    public static void main(String[] args) {

//        1)Count Word Frequencies in a string
//        String str = "java is fun and java is powerful"
        String str = "java java is and fun fun fun fun fun fun and java is is powerful java";
        String[] words = str.split(" ");  //{"java", "is", "fun", "and","java","is", "powerful", "java"}
        HashMap<String,Integer> wordOccurences = new HashMap<>();

        for(String word: words){  // <java, 2>
            //wordOccurences.put(word,wordOccurences.getOrDefault(word,0)+1);
            if(wordOccurences.containsKey(word))
                wordOccurences.put(word,wordOccurences.get(word)+1);
            else
                wordOccurences.put(word,1);
        }

        System.out.println("Word Frequency");
        System.out.println(wordOccurences);

        System.out.println("Second largest valued key");
        ArrayList<Map.Entry<String, Integer>> entryset = new ArrayList<>(wordOccurences.entrySet());
        entryset.sort((obj1,obj2)->obj2.getValue()-obj1.getValue());
        System.out.println(entryset);
        System.out.println(entryset.get(1).getKey());

    }
}
